package br.com.peoplelife.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.peoplelife.model.MedicalCareAttachments;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface MedicalCareAttachmentsRepository extends CrudRepository<MedicalCareAttachments, Integer> {

}
