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

import br.com.peoplelife.model.MedicalCare;
import br.com.peoplelife.repository.MedicalCareRepository;
import javassist.NotFoundException;

@CrossOrigin
@RestController
public class MedicalCareController {
	private static final String ROUTE = "usertype";

	@Autowired
	private MedicalCareRepository medicalCareRepository;

	@CrossOrigin
	@GetMapping(path = "/" + ROUTE)
	public @ResponseBody Iterable<MedicalCare> list() {
		return medicalCareRepository.findAll();
	}

	@CrossOrigin
	@GetMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody MedicalCare find(@PathVariable Integer id) throws NotFoundException {
		return medicalCareRepository.findById(id).orElseThrow(() -> new NotFoundException("NotFound"));
	}

	@CrossOrigin
	@PostMapping(path = "/" + ROUTE)
	public @ResponseBody MedicalCare add(@RequestBody MedicalCare medicalCare) {
		return medicalCareRepository.save(medicalCare);
	}

	@CrossOrigin
	@PutMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody MedicalCare update(@PathVariable Integer id, @RequestBody MedicalCare medicalCare) {
		return medicalCareRepository.save(medicalCare);
	}

	@CrossOrigin
	@DeleteMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody void remove(@PathVariable Integer id) {
		medicalCareRepository.deleteById(id);
	}
}
