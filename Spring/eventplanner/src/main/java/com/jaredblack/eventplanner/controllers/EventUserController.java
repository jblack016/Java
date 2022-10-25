package com.jaredblack.eventplanner.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.jaredblack.eventplanner.models.EventUser;
import com.jaredblack.eventplanner.services.EventUserService;

@Controller
public class EventUserController {

	@Autowired
	private EventUserService eventUserService;
	
	// Create

	// Show
	@GetMapping("/events/{eventId}/guests/new")
	public String renderCreateEventUser(@ModelAttribute("newEventUser") EventUser newEventUser, @PathVariable("eventId") Long eventId, Model model, HttpSession session) {
		if (session.getAttribute("userId") == null) {
			session.invalidate();
			model.addAttribute("eventId", eventId);
			return "redirect:/";
		}
		return "newGuest.jsp";
	}

	// Process Create
	@PostMapping("/events/{eventId}/guests/process")
	public String processEventUserForm(@Valid @ModelAttribute("newEventUser") EventUser eventUser, BindingResult result, @PathVariable("eventId") Long eventId, Model model, HttpSession session) {
		if (session.getAttribute("userId") == null) {
			session.invalidate();
			return "redirect:/";
		}
		if (result.hasErrors()) {
			return "newGuest.jsp";
		} else {
			eventUserService.createEventUser(eventUser);
			return "redirect:/events/{eventId}";
		}
	}
	
	// Delete
	
	@DeleteMapping("/events/guests/delete/{id}")
	public String deleteEventUser(@PathVariable("id") Long id) {
		eventUserService.deleteEventUser(id);
		return "redirect:/events";
	}	
}
