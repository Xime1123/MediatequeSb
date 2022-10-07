package com.plb.projectSb.repository;



	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;
	import com.plb.projectSb.entity.*;

	@Repository
	public interface UserRepository extends JpaRepository <Borrow, Long>{


		
		
	}

	

