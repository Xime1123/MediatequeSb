package com.plb.projectSb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plb.projectSb.entity.User;

@Repository
public interface BorrowRepository  extends JpaRepository <User, Long> {

}
