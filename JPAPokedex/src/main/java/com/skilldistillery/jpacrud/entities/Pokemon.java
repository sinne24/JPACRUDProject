package com.skilldistillery.jpacrud.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pokemon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	//TODO: New properties from table
	
	private String type;
	private String type2;
	private Integer pokedexId;
	private String evolution;
	private String region;

	public Pokemon() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	public Integer getpokedexId() {
		return pokedexId;
	}

	public void setpokedexId(Integer pokedexId) {
		this.pokedexId = pokedexId;
	}

	public String getEvolution() {
		return evolution;
	}

	public void setEvolution(String evolution) {
		this.evolution = evolution;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Database location id: " + id + ".) Pokemon name: " + name  +", pokedex number: "
				+ pokedexId + ", from the " + region + " region. Type " + type + ", type2 " 
				+ type2  + ", evolutionary stage: " + evolution;
	}


	
}
