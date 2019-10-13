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

import br.com.peoplelife.model.Patient;
import br.com.peoplelife.repository.PatientRepository;
import javassist.NotFoundException;

@CrossOrigin
@RestController
public class PatientController {
	private static final String ROUTE = "patient";

	@Autowired
	private PatientRepository patientRepository;

	@CrossOrigin
	@GetMapping(path = "/" + ROUTE)
	public @ResponseBody Iterable<Patient> list() {
		return patientRepository.findAll();
	}

	@CrossOrigin
	@GetMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody Patient find(@PathVariable Integer id) throws NotFoundException {
		return patientRepository.findById(id).orElseThrow(() -> new NotFoundException("NotFound"));
	}

	@CrossOrigin
	@PostMapping(path = "/" + ROUTE)
	public @ResponseBody Patient add(@RequestBody Patient patient) {
		return patientRepository.save(patient);
	}

	@CrossOrigin
	@PutMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody Patient update(@PathVariable Integer id, @RequestBody Patient patient) {
		return patientRepository.save(patient);
	}

	@CrossOrigin
	@DeleteMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody void remove(@PathVariable Integer id) {
		patientRepository.deleteById(id);
	}
}
