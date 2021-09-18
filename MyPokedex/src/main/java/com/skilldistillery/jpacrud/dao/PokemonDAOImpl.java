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

	@Override
	public Pokemon updatePokemon(Pokemon pokemon) {
		
		Pokemon dbPokemon = em.find(Pokemon.class, pokemon);
		dbPokemon.setName(pokemon.getName());
		em.flush();
		return pokemon;
	}

	@Override
	public boolean deletePokemon(int pokemonId) {
		// boolean removedActor = false;
		//Actor a = em.find(Actor.class, id);
//		boolean destroyed = false;
//		if(a != null) {
//			
//			em.remove(a); // performs the delete on the managed entity
//			
//			//check is removal was successful
//			removedActor = !em.contains(a);
//			
//		}
		
		
		
		
		return false;
	}

}
