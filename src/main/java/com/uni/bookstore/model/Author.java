package com.uni.bookstore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//TODO
@Getter
@Setter
@Entity
@SequenceGenerator(name = "default_gen", sequenceName = "author_seq", allocationSize = 1)
@Table(name = "authors", schema = "public")
public class Author extends BaseEntity{

	private String name;
}
