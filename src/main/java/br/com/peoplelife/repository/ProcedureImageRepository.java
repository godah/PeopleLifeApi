package br.com.peoplelife.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.peoplelife.model.ProcedureImage;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ProcedureImageRepository extends CrudRepository<ProcedureImage, Integer> {

}
