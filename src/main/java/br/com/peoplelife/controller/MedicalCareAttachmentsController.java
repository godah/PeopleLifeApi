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

import br.com.peoplelife.model.MedicalCareAttachments;
import br.com.peoplelife.repository.MedicalCareAttachmentsRepository;
import javassist.NotFoundException;

@CrossOrigin
@RestController
public class MedicalCareAttachmentsController {
	private static final String ROUTE = "MedicalCareAttachments";

	@Autowired
	private MedicalCareAttachmentsRepository medicalCareAttachmentsRepository;

	@CrossOrigin
	@GetMapping(path = "/" + ROUTE)
	public @ResponseBody Iterable<MedicalCareAttachments> list() {
		return medicalCareAttachmentsRepository.findAll();
	}

	@CrossOrigin
	@GetMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody MedicalCareAttachments find(@PathVariable Integer id) throws NotFoundException {
		return medicalCareAttachmentsRepository.findById(id).orElseThrow(() -> new NotFoundException("NotFound"));
	}

	@CrossOrigin
	@PostMapping(path = "/" + ROUTE)
	public @ResponseBody MedicalCareAttachments add(@RequestBody MedicalCareAttachments attach) {
		return medicalCareAttachmentsRepository.save(attach);
	}

	@CrossOrigin
	@PutMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody MedicalCareAttachments update(@PathVariable Integer id, @RequestBody MedicalCareAttachments attach) {
		return medicalCareAttachmentsRepository.save(attach);
	}

	@CrossOrigin
	@DeleteMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody void remove(@PathVariable Integer id) {
		medicalCareAttachmentsRepository.deleteById(id);
	}
}
