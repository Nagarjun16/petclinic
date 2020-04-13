package com.nagasoft.petclinic.repositories;

import com.nagasoft.petclinic.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
