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

}
