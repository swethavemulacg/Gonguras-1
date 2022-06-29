package com.cg.gongurasrest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.gongurasrest.entity.Items;

public interface ItemsRepo extends JpaRepository<Items,Integer> {

	void deleteByname(String name);

	//void save(List<Items> item);

}
