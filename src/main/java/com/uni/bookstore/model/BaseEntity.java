package com.uni.bookstore.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
//@Getter
//@Setter
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(LocalDateTime modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
}