package com.cg.gongurasrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.gongurasrest.entity.Items;
import com.cg.gongurasrest.service.ItemsService;

@RestController
@RequestMapping("/gongura")
public class ItemsController {
	
	@Value("${msgkey}")
	private String msgKey;

	@Autowired
	public ItemsService itemsService;
	
	@GetMapping("/")
	public ResponseEntity<String> messageKey(){
		return new ResponseEntity<>(msgKey, HttpStatus.OK);
	}

	@GetMapping("/items")
	public List<Items> getAllitems() {
		return itemsService.getAllitems();

	}

	@PostMapping("/item")
	public Items addItems(@RequestBody Items items) {

		return itemsService.addItems(items);
	}

	@DeleteMapping("/item/{id}")
	public void deleteItem(@PathVariable Integer id)

	{
		itemsService.deleteItem(id);
	}

	@DeleteMapping("/item/{name}")
	public void deleteItem(@PathVariable String name)

	{
		itemsService.deleteItem(name);
	}

	/*
	 * @PutMapping("/updateitem/{id}") public void UpdateItems(@PathVariable Integer
	 * id,@RequestBody Items items ) {
	 * 
	 * serv.UpdateItems(id,items); }
	 */

}
