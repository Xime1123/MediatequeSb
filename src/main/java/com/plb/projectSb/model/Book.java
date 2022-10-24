package com.plb.projectSb.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name="book")
@PrimaryKeyJoinColumn(name="idItem")
public class Book extends Item{
	private static final long serialVersionUID = 1L;


	
	@NotNull
	private String author;
	
	@NotNull
	@Column(name="ISBN_Number")
	private  Long nbISBN;

	
	
	
}
