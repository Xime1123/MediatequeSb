package com.plb.projectSb.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;


@Data
@Entity
@Table(name="items")
@Inheritance(strategy=InheritanceType.JOINED) 

public class Item implements Serializable {
	
	
	private static final long serialVersionUID = 6590486482810196501L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	@NotNull
	private String title;
	
	@NotNull
	@Column(name="Number_copies")
	private int copiesNumber;
	
	@NotNull
	@Column(name="release_Date")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date releaseDate;

	@ManyToMany(mappedBy="items", fetch = FetchType.LAZY)
	@JsonIgnore
	private Set<Borrow> borrows = new HashSet<Borrow>();
	
	
	// Setters and Getters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCopiesNumber() {
		return copiesNumber;
	}

	public void setCopiesNumber(int copiesNumber) {
		this.copiesNumber = copiesNumber;
	}

	public @NotNull Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(@NotNull Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Set<Borrow> getBorrows() {
		return borrows;
	}

	public void setBorrows(Set<Borrow> borrows) {
		this.borrows = borrows;
	}


	
	


}
