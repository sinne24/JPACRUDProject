package com.skilldistillery.jpacrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
//***** Home *********************************************	
	@RequestMapping(path={"/","home.do"})
	public String index(Model model) {
	  model.addAttribute("allPokemon", dao.findAll());
	  return "index"; // if using a ViewResolver.
	}
	
//***** Get *********************************************		
	@RequestMapping (path="getPokemon.do")
	public String showPokemon(Integer pid, Model model) {
		model.addAttribute("pokemon", dao.findById(pid));
		return "show";
	}
	
//***** Create *********************************************	
	@RequestMapping (path="createPokemonForm.do", method=RequestMethod.POST)
	public String createPokemonForm(Model model, Pokemon pokemon) {
		return "addPokemon";
	}
	
	@RequestMapping (path="createPokemon.do", method=RequestMethod.POST)
	public String createPokemon(Model model, Pokemon pokemon) {
		model.addAttribute("pokemon", dao.addPokemon(pokemon));
		return "addConfirmation";
	}

//***** Update *********************************************		
	@RequestMapping (path="updatePokemonForm.do", method=RequestMethod.POST)
	public String updatePokemonForm(Model model, @RequestParam Integer pid) {
		Pokemon p = dao.findById(pid);
		System.out.println("************************************************");
		System.out.println(p + ", " + pid);
		model.addAttribute("pokemon", p);
		return "updatePokemon";
	}
	
	@RequestMapping (path="updatePokemon.do", method=RequestMethod.POST)
	public String updatePokemon(Integer pid, Model model, Pokemon pokemon) {
		model.addAttribute("pokemon", dao.updatePokemon(pid, pokemon));
		return "updateConfirmation";
	}
	
//***** Delete *********************************************	
	@RequestMapping (path="deletePokemon.do")
	public String deletePokemon(Integer pid, Model model) {
		model.addAttribute("pokemon", dao.deletePokemon(pid));
		return "deleteConfirmation";
	}
	
	
	
	

}
