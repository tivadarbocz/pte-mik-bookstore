package com.uni.bookstore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass //https://vladmihalcea.com/how-to-inherit-properties-from-a-base-class-entity-using-mappedsuperclass-with-jpa-and-hibernate/
@Getter
@Setter
public class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "default_gen")
	protected Long id;

	@Column(updatable = false)
	protected LocalDateTime createdAt;

	@Column
	protected LocalDateTime modifiedAt;

	public BaseEntity() {
		LocalDateTime now = LocalDateTime.now();

		this.createdAt = now;
		this.modifiedAt = now;
	}
}