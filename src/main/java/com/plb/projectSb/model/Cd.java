package com.plb.projectSb.model;


	


	import javax.persistence.*;
	import javax.validation.constraints.NotNull;

	import lombok.Data;

	@Data
	@Entity
	@Table (name= "cd")
	@PrimaryKeyJoinColumn(name="idItem")
	public class Cd  extends Item{
		private static final long serialVersionUID = 1L;
		
		
		@NotNull
		private String artist;
		
		@NotNull
		private int duration;
	    
		@NotNull
		@Column(name= "Numbertitles")
		private int titlesNumber;

		
		

}
