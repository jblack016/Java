package com.jaredblack.dojoandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.jaredblack.dojoandninjas.models.Dojo;
import com.jaredblack.dojoandninjas.models.Ninja;
import com.jaredblack.dojoandninjas.services.MainService;

@Controller
public class HomeController {

	@Autowired
	private MainService mainService;

	@GetMapping("/")
	public String dojoDashboard(Model model) {
		model.addAttribute("dojoList", mainService.allDojos());
		model.addAttribute("ninjaList", mainService.allNinjas());
		return "dashboard.jsp";
	}

	// Create Ninja
	
	// Show
	@GetMapping("/ninjas/new")
	public String showNinjaForm(Model model) {
		model.addAttribute("newNinja", new Ninja());
		model.addAttribute("dojoList", mainService.allDojos());
		return "newNinja.jsp";
	}

	// Process
	@PostMapping("/ninjas/process")
	public String processNinjaForm(@Valid @ModelAttribute("newNinja") Ninja ninja, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("dojoList", mainService.allDojos());
			return "newNinja.jsp";
		} else {
			mainService.createNinja(ninja);
			return "redirect:/";
		}
	}

	// Create Dojo
	
	// Show
	@GetMapping("/dojos/new")
	public String showDojoForm(Model model) {
		model.addAttribute("newDojo", new Dojo());
		return "newDojo.jsp";
	}

	// Process
	@PostMapping("/dojos/process")
	public String processDojoForm(@Valid @ModelAttribute("newDojo") Dojo Dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "newDojo.jsp";
		} else {
			mainService.createDojo(Dojo);
			return "redirect:/";
		}
	}
	
	// View One Dojo
	
	@GetMapping("/dojos/{id}")
	public String dojoDetails(@PathVariable("id") Long id, Model model) {
		Dojo foundDojo = mainService.oneDojo(id);
		model.addAttribute("dojo", foundDojo);
		return "showDojo.jsp";
	}

}
