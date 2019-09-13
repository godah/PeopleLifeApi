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

import br.com.peoplelife.model.Procedure;
import br.com.peoplelife.repository.ProcedureRepository;
import javassist.NotFoundException;

@CrossOrigin
@RestController
public class ProcedureController {
	private static final String ROUTE = "procedure";

	@Autowired
	private ProcedureRepository procedureRepository;

	@CrossOrigin
	@GetMapping(path = "/" + ROUTE)
	public @ResponseBody Iterable<Procedure> list() {
		return procedureRepository.findAll();
	}

	@CrossOrigin
	@GetMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody Procedure find(@PathVariable Integer id) throws NotFoundException {
		return procedureRepository.findById(id).orElseThrow(() -> new NotFoundException("NotFound"));
	}

	@CrossOrigin
	@PostMapping(path = "/" + ROUTE)
	public @ResponseBody Procedure add(@RequestBody Procedure procedure) {
		return procedureRepository.save(procedure);
	}

	@CrossOrigin
	@PutMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody Procedure update(@PathVariable Integer id, @RequestBody Procedure procedure) {
		return procedureRepository.findById(id).map(ut -> {
			ut.setDescricao(procedure.getDescricao());
			return procedureRepository.save(ut);
		}).orElseGet(() -> {
			procedure.setId(id);
			return procedureRepository.save(procedure);
		});
	}

	@CrossOrigin
	@DeleteMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody void remove(@PathVariable Integer id) {
		procedureRepository.deleteById(id);
	}
}
