package com.plb.projectSb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.plb.projectSb.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository <Item, Long>{

}
