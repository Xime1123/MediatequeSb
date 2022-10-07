package com.plb.projectSb.entity;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity 
@Table (name="users")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="userSequenceGenerator")
	@SequenceGenerator(name="userSequenceGenerator", allocationSize=1)
	private Long id;
	
	@NotNull
	@Email
	private String login;
    
	@NotNull
    private String password;
   
	@NotNull
	@Column(name="Firstname")
    private String firstname;
	
	@NotNull
	@Column(name="Lastname")
	private String lastname;


	@OneToMany( mappedBy = "user",cascade=CascadeType.ALL,orphanRemoval=true)
	private Set<Borrow> loans = new HashSet<Borrow>();


	

}



