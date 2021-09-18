package com.skilldistillery.jpacrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.jpacrud.dao.PokemonDAO;
import com.skilldistillery.jpacrud.entities.Pokemon;

@Controller
public class PokemonController {
	
	@Autowired
	private PokemonDAO dao;
	
//	@RequestMapping(path= {"/","home.do"})
//	public String home(Model model) {
//		model.addAttribute("allPokemon", dao.findAll());
//		return "home";
//	}
	
	@RequestMapping(path={"/","home.do"})
	public String index(Model model) {
	  model.addAttribute("allPokemon", dao.findAll());
	  return "index"; // if using a ViewResolver.
	}
	
	@RequestMapping (path="getPokemon.do")
	public String showPokemon(Integer pid, Model model) {
		model.addAttribute("pokemon", dao.findById(pid));
		return "show";
	}
	@RequestMapping (path="updatePokemon.do")
	public String updatePokemon(Integer pid, Model model) {
		model.addAttribute("pokemon", dao.findById(pid));
		return "updatePokemon";
	}
	
	@RequestMapping (path="deletePokemon.do")
	public String deletePokemon(Integer pid, Model model) {
		model.addAttribute("pokemon", dao.findById(pid));
		return "deletePokemon";
	}
	
	@RequestMapping (path="createPokemon.do")
	public String createPokemon(Model model, Pokemon pokemon) {
		model.addAttribute("pokemon", dao.addPokemon(pokemon));
		return "addPokemon";
	}
	

}
