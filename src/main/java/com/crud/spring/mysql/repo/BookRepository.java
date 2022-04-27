package com.crud.spring.mysql.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.spring.mysql.model.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
	
	public List<Book> findBybookName(String name);

}
