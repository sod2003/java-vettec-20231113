package com.skillstorm.daos;

import java.util.List;
import java.util.Optional;

import com.skillstorm.models.Book;

/** 
 * This is an interface that defines all the interactions with the database
 */
public interface BookDao {
	
	Optional<Book> findById(int id);
	
	Optional<Book> findByName(String name);
	
	List<Book> findAll();
	
	Book save(Book e);
	
	Book update(Book e);
	
	void delete(Book e);
	
	void deleteById(int id);
}
