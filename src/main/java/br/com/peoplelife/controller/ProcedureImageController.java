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

import br.com.peoplelife.model.ProcedureImage;
import br.com.peoplelife.repository.ProcedureImageRepository;
import javassist.NotFoundException;

@CrossOrigin
@RestController
public class ProcedureImageController {
	private static final String ROUTE = "procedureimage";

	@Autowired
	private ProcedureImageRepository procedureImageRepository;

	@CrossOrigin
	@GetMapping(path = "/" + ROUTE)
	public @ResponseBody Iterable<ProcedureImage> list() {
		return procedureImageRepository.findAll();
	}

	@CrossOrigin
	@GetMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody ProcedureImage find(@PathVariable Integer id) throws NotFoundException {
		return procedureImageRepository.findById(id).orElseThrow(() -> new NotFoundException("NotFound"));
	}

	@CrossOrigin
	@PostMapping(path = "/" + ROUTE)
	public @ResponseBody ProcedureImage add(@RequestBody ProcedureImage procedureImage) {
		return procedureImageRepository.save(procedureImage);
	}

	@CrossOrigin
	@PutMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody ProcedureImage update(@PathVariable Integer id, @RequestBody ProcedureImage procedureImage) {
		return procedureImageRepository.findById(id).map(ui -> {
			ui.setImagem(procedureImage.getImagem());
			return procedureImageRepository.save(ui);
		}).orElseGet(() -> {
			procedureImage.setId(id);
			return procedureImageRepository.save(procedureImage);
		});
	}

	@CrossOrigin
	@DeleteMapping(path = "/" + ROUTE + "/{id}")
	public @ResponseBody void remove(@PathVariable Integer id) {
		procedureImageRepository.deleteById(id);
	}
}
