package br.com.peoplelife.controller;

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
	private static final String ROUTE = "User";

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
		return userRepository.save(user);
	}

	@CrossOrigin
	@PutMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody User update(@PathVariable Integer id, @RequestBody User user) {
		return userRepository.save(user);
	}

	@CrossOrigin
	@DeleteMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody void remove(@PathVariable Integer id) {
		userRepository.deleteById(id);
	}

	@CrossOrigin
	@PostMapping(path = "/" + ROUTE + "/login")
	public @ResponseBody User login(@RequestBody User user) {
		List<User> users = (List<User>) userRepository.findAll();
		User response = users.stream()
				.filter(p -> p.getEmail().equals(user.getEmail()) && p.getPassword().equals(user.getPassword()))
				.findFirst().orElse(null);
		return response;
	}
}
