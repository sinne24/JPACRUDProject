package com.skilldistillery.jpacrud.dao;

import java.util.List;

import com.skilldistillery.jpacrud.entities.Pokemon;

public interface PokemonDAO {
	
	Pokemon findById( int pokemonId);
	List<Pokemon> findAll(); 
	//add
	Pokemon addPokemon(Pokemon pokemon);
	//update
	Pokemon updatePokemon(Pokemon pokemon);
	//delete
	boolean deletePokemon(int pokemonId);
}
