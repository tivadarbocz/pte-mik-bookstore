package com.uni.bookstore.service;

import com.uni.bookstore.model.Author;

import java.util.List;

public interface AuthorService {

	Author save(Author author);

	List<Author> saveAll(List<Author> authors);

	Author findById(Long id);

	List<Author> findAll();

	void deleteById(Long id);
}
