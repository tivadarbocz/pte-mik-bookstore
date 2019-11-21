package com.uni.bookstore.controller;

import com.uni.bookstore.model.Book;
import com.uni.bookstore.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class BookController {

	private final BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@GetMapping(value = "/books")
	public String main(Model model) {
		model.addAttribute("books", bookService.findAll());

		return "book/main";
	}

	@GetMapping(value = "/books/{id}")
	public String findById(@PathVariable("id") Long id,  Model model) {
		model.addAttribute("book", bookService.findById(id));

		return "book/edit";
	}

	@PostMapping(value = "/books/{id}")
	public String update(@PathVariable("id") Long id,  Model model, Book book) {
		model.addAttribute("book", bookService.save(book));

		return "book/edit";
	}

	@GetMapping(value = "/books/{id}/delete")
	public String deleteById(@PathVariable("id") Long id) {
		bookService.deleteById(id);

		return "redirect:/books";
	}

	//TODO new book endpoint
}
