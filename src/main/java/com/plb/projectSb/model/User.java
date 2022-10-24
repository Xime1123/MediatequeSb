package com.plb.projectSb.model;


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
	@Column( nullable=false, unique=true)
	private String login;
    
	@NotNull
    private String password;
   
	@NotNull
	@Column(name="Firstname")
    private String firstname;
	
	@NotNull
	@Column(name="Lastname")
	private String lastname;
	
	
	public static int maxBorrow=3;

   // Relation One-to Many with Borrow 
	
	@OneToMany( mappedBy = "user",cascade=CascadeType.ALL,orphanRemoval=true)
	private Set<Borrow> borrows = new HashSet<Borrow>();


    //Getters and Setter
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public Set<Borrow> getBorrows() {
		return borrows;
	}


	public void setBorrows(Set<Borrow> borrows) {
		this.borrows = borrows;
	}




	
	
	
	
	
	
	

}



