package com.skilldistillery.jpacrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.jpacrud.entities.Pokemon;

@Service
@Transactional
public class PokemonDAOImpl implements PokemonDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Pokemon findById(int pokemonId) {
		return em.find(Pokemon.class, pokemonId);
	}

	@Override
	public Pokemon findByName(String name) {
		return em.find(Pokemon.class, name);
	}
	
	@Override
	public List<Pokemon> findAll() {
		String jpql = "SELECT p FROM Pokemon p";
		return em.createQuery(jpql, Pokemon.class).getResultList();
	}

	@Override
	public Pokemon addPokemon(Pokemon pokemon) {
		em.persist(pokemon);
		em.flush();
		return pokemon;
	}

//	@Override
//	public Pokemon updatePokemon(String name, Pokemon pokemon) {
//		
//		System.out.println(name + ", " + pokemon);
//		
//		Pokemon dbPokemon = em.find(Pokemon.class, name);
//		dbPokemon.setName(pokemon.getName());
//		dbPokemon.setpokedexId(pokemon.getpokedexId());
//		dbPokemon.setType(pokemon.getType());
//		dbPokemon.setType2(pokemon.getType2());
//		dbPokemon.setEvolution(pokemon.getEvolution());
//		dbPokemon.setRegion(pokemon.getRegion());
//		
//		System.out.println(dbPokemon);
//		
//		em.flush();
//		return pokemon;
//	}
	
	@Override
	public Pokemon updatePokemon(int pokemonId, Pokemon pokemon) {
		
		System.out.println(pokemon);
		Pokemon dbPokemon = em.find(Pokemon.class, pokemonId);
		dbPokemon.setName(pokemon.getName());
		dbPokemon.setpokedexId(pokemon.getpokedexId());
		dbPokemon.setType(pokemon.getType());
		dbPokemon.setType2(pokemon.getType2());
		dbPokemon.setEvolution(pokemon.getEvolution());
		dbPokemon.setRegion(pokemon.getRegion());
		
		System.out.println(dbPokemon);
		
		em.flush();
		return dbPokemon;
	}

	@Override
	public boolean deletePokemon(int pokemonId) {
		Pokemon pokemon = em.find(Pokemon.class, pokemonId);
	    boolean removedPokemon = false;
		boolean destroyed = false;
		if(pokemon != null) {		
			em.remove(pokemon); 
			removedPokemon = !em.contains(pokemon);
			
		}	
		return removedPokemon;
	}


}
