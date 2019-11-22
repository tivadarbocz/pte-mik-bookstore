package com.uni.bookstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//@Getter
//@Setter
@Entity
@SequenceGenerator(name = "default_gen", sequenceName = "book_seq", allocationSize = 1)
@Table(name = "books", schema = "public")
public class Book extends BaseEntity {

	@Column(nullable = false, length = 13)
	private String isbn;

	@Column(nullable = false)
	private String title;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
