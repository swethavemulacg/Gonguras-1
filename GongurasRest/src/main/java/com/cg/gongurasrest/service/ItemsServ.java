package com.cg.gongurasrest.service;

import java.util.List;

import com.cg.gongurasrest.entity.Items;

public interface ItemsServ {
	
	public List<Items> getAllitems();
    public Items addItems(Items items);
}
