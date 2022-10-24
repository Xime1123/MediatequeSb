package com.plb.projectSb.model;



import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name="dvd")
@PrimaryKeyJoinColumn(name="idItem")
public class Dvd extends Item {

	private static final long serialVersionUID = 1L;

	@NotNull
	private String director;

	@NotNull
	private int duration;
   

	@Column(name="TypeDVD")
	@Enumerated(EnumType.STRING)
	private TYPEDVD typedvd; 
	
	


}
