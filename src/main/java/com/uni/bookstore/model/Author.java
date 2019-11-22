package com.uni.bookstore.model;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "default_gen", sequenceName = "author_seq", allocationSize = 1)
@Table(name = "authors", schema = "public")
public class Author extends BaseEntity {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
