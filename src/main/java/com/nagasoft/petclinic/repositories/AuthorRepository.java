package com.nagasoft.petclinic.repositories;

import com.nagasoft.petclinic.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
