package com.cg.gongurasrest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
//@Table(name = "items")
@Table(name="items",uniqueConstraints={@UniqueConstraint(columnNames={"name"})})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Items {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "cost")
	private int cost;
     
	//@Column(unique=true)
	
	@Column(name = "name")
	private String name;

	@Column(name = "quantity")
	private int quantity;

}
