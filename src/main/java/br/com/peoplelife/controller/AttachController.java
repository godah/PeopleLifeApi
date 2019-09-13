package br.com.peoplelife.controller;

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

import br.com.peoplelife.model.Attach;
import br.com.peoplelife.repository.AttachRepository;
import javassist.NotFoundException;

@CrossOrigin
@RestController
public class AttachController {
	private static final String ROUTE = "attach";

	@Autowired
	private AttachRepository attachRepository;

	@CrossOrigin
	@GetMapping(path = "/" + ROUTE)
	public @ResponseBody Iterable<Attach> list() {
		return attachRepository.findAll();
	}

	@CrossOrigin
	@GetMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody Attach find(@PathVariable Integer id) throws NotFoundException {
		return attachRepository.findById(id).orElseThrow(() -> new NotFoundException("NotFound"));
	}

	@CrossOrigin
	@PostMapping(path = "/" + ROUTE)
	public @ResponseBody Attach add(@RequestBody Attach attach) {
		return attachRepository.save(attach);
	}

	@CrossOrigin
	@PutMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody Attach update(@PathVariable Integer id, @RequestBody Attach attach) {
		return attachRepository.findById(id).map(ut -> {
			ut.setAnexo(attach.getAnexo());
			return attachRepository.save(ut);
		}).orElseGet(() -> {
			attach.setId(id);
			return attachRepository.save(attach);
		});
	}

	@CrossOrigin
	@DeleteMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody void remove(@PathVariable Integer id) {
		attachRepository.deleteById(id);
	}
}
