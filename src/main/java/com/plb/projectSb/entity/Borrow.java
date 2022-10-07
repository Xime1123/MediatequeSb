package com.plb.projectSb.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data

public class Borrow implements Serializable {
	
private static final long serialVersionUID = 6590486482810196501L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 

	private LocalDate borrowDate; 

	private LocalDate ReturnDate; 
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user; 
	
	@ManyToMany
	@JoinColumn(name="items_id")
	private List<Item> items;

}
