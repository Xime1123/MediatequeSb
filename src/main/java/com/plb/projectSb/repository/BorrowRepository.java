package com.plb.projectSb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plb.projectSb.model.Borrow;
import com.plb.projectSb.model.User;


@Repository
public interface BorrowRepository  extends JpaRepository <Borrow, Long> {

	 // Get the borrows made by the user
     	public List<Borrow> findByUser(User user);
}
