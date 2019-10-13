package br.com.peoplelife.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.peoplelife.model.Patient;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PatientRepository extends CrudRepository<Patient, Integer> {

}
