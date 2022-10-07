package com.plb.projectSb.entity;


import java.util.Objects;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name="book")
public class Book extends Item{


	private static final long serialVersionUID = 1L;


	
	@NotNull
	private String author;
	
	@NotNull
	@Column(name="ISBN_Number")
	private  Long nbISBN;

	@Override
	public int hashCode() {
		return Objects.hash(author, nbISBN);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(nbISBN, other.nbISBN);
	}
	
	
}
