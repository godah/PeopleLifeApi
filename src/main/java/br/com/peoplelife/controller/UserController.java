package br.com.peoplelife.controller;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.peoplelife.model.User;
import br.com.peoplelife.repository.UserRepository;
import javassist.NotFoundException;

@CrossOrigin
@RestController
public class UserController {
	private final Log log = LogFactory.getLog(UserController.class);
	private static final String MD5 = "MD5";
	private static final String ROUTE = "user";

	@Autowired
	private UserRepository userRepository;

	@CrossOrigin
	@GetMapping(path = "/" + ROUTE)
	public @ResponseBody Iterable<User> list() {
		return userRepository.findAll();
	}

	@CrossOrigin
	@GetMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody User find(@PathVariable Integer id) throws NotFoundException {
		return userRepository.findById(id).orElseThrow(() -> new NotFoundException("NotFound"));
	}

	@CrossOrigin
	@PostMapping(path = "/" + ROUTE)
	public @ResponseBody User add(@RequestBody User user) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance(MD5);
			BigInteger hash = new BigInteger(1, md.digest(user.getSenha().getBytes()));
			user.setSenha(String.format("%32x", hash));
			return userRepository.save(user);
		} catch (NoSuchAlgorithmException e) {
			log.error(e.getMessage(), e);
			return null;
		}
	}

	@CrossOrigin
	@PutMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody User update(@PathVariable Integer id, @RequestBody User user) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance(MD5);
			BigInteger hash = new BigInteger(1, md.digest(user.getSenha().getBytes()));
			user.setSenha(String.format("%32x", hash));
			return userRepository.findById(id).map(usr -> {
				usr.setEmail(user.getEmail());
				usr.setImagem(user.getImagem());
				usr.setNome(user.getNome());
				usr.setSenha(user.getSenha());
				usr.setTipo(user.getTipo());
				usr.setAltura(user.getAltura());
				usr.setCpf(user.getCpf());
				usr.setMedico(user.getMedico());
				usr.setNascimento(user.getNascimento());
				usr.setPeso(user.getPeso());
				usr.setSexo(user.getSexo());
				return userRepository.save(usr);
			}).orElseGet(() -> {
				user.setId(id);
				return userRepository.save(user);
			});
		} catch (NoSuchAlgorithmException e) {
			log.error(e.getMessage(), e);
		}
		return user;
	}

	@CrossOrigin
	@DeleteMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody void remove(@PathVariable Integer id) {
		userRepository.deleteById(id);
	}
	
	@CrossOrigin
	@PostMapping(path = "/" + ROUTE + "/login")
	public @ResponseBody User login(@RequestBody User user) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance(MD5);
			BigInteger hash = new BigInteger(1, md.digest(user.getSenha().getBytes()));
			user.setSenha(String.format("%32x", hash));
			List<User> users = (List<User>) userRepository.findAll();
			User response = users.stream()
					.filter(p -> p.getNome().equals(user.getNome()) && p.getSenha().equals(user.getSenha()))
					.findFirst()
					.orElse(null);
			return response;
		} catch (NoSuchAlgorithmException e) {
			log.error(e.getMessage(), e);
			return null;
		}
	}
}
