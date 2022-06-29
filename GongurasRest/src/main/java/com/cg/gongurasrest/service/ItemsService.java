package com.cg.gongurasrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cg.gongurasrest.entity.Items;
import com.cg.gongurasrest.repo.ItemsRepo;

@Service
public class ItemsService implements ItemsServ {

	@Autowired
	public ItemsRepo repo;
	
	List<Items> items = new ArrayList<>();

	public List<Items> getAllitems() {
		List<Items> items = new ArrayList<>();
		repo.findAll().forEach(items::add);
		return items;

	}
	
	public Items addItems(Items items) {
		repo.save(items);
		return items;
	}
	
	public void deleteItem(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}
	
	public void deleteItem(String name) {
		repo.deleteByname(name);
	}



	/*public void UpdateItems(Integer id, Items items) {
		// TODO Auto-generated method stub
		repo.save(items);

		
	}*/

}
