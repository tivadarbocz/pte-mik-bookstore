package com.uni.bookstore.service;

import com.uni.bookstore.exception.NoResourceException;
import com.uni.bookstore.model.Author;
import com.uni.bookstore.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImp implements AuthorService {

	private final AuthorRepository authorRepository;

	public AuthorServiceImp(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	@Override
	public Author save(Author author) {
		return authorRepository.save(author);
	}

	@Override
	public List<Author> saveAll(List<Author> authors) {
		return authorRepository.saveAll(authors);
	}

	@Override
	public Author findById(Long id) {
		Optional<Author> optionalAuthor= authorRepository.findById(id);

		return optionalAuthor.map(o -> optionalAuthor.get())
				.orElseThrow(NoResourceException::new);
	}

	@Override
	public List<Author> findAll() {
		return authorRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		authorRepository.deleteById(id);
	}
}
