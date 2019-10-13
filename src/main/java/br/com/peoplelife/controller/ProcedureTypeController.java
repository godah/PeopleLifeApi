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

import br.com.peoplelife.model.ProcedureType;
import br.com.peoplelife.repository.ProcedureTypeRepository;
import javassist.NotFoundException;

@CrossOrigin
@RestController
public class ProcedureTypeController {
	private static final String ROUTE = "ProcedureType";

	@Autowired
	private ProcedureTypeRepository procedureTypeRepository;

	@CrossOrigin
	@GetMapping(path = "/" + ROUTE)
	public @ResponseBody Iterable<ProcedureType> list() {
		return procedureTypeRepository.findAll();
	}

	@CrossOrigin
	@GetMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody ProcedureType find(@PathVariable Integer id) throws NotFoundException {
		return procedureTypeRepository.findById(id).orElseThrow(() -> new NotFoundException("NotFound"));
	}

	@CrossOrigin
	@PostMapping(path = "/" + ROUTE)
	public @ResponseBody ProcedureType add(@RequestBody ProcedureType procedureType) {
		return procedureTypeRepository.save(procedureType);
	}

	@CrossOrigin
	@PutMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody ProcedureType update(@PathVariable Integer id, @RequestBody ProcedureType procedureType) {	
		return procedureTypeRepository.save(procedureType);
	}

	@CrossOrigin
	@DeleteMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody void remove(@PathVariable Integer id) {
		procedureTypeRepository.deleteById(id);
	}
}
