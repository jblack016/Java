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
import org.springframework.web.bind.annotation.PutMapping;

import com.jaredblack.eventplanner.models.Event;
import com.jaredblack.eventplanner.services.EventService;


@Controller
public class HomeController {

	@Autowired
	private EventService eventService;
	


	@GetMapping("/events")
	public String dashboard(HttpSession session, Model model) {
		if (session.getAttribute("userId") == null) {
			session.invalidate();
			return "redirect:/";
		}
		model.addAttribute("eventList", eventService.allEvents());

		return "dashboard.jsp";
	}

	// Create

	// Show
	@GetMapping("/events/new")
	public String renderCreateEvent(@ModelAttribute("newEvent") Event newEvent, HttpSession session) {
		if (session.getAttribute("userId") == null) {
			session.invalidate();
			return "redirect:/";
		}
		return "newEvent.jsp";
	}

	// Process Create
	@PostMapping("events/process")
	public String processEventForm(@Valid @ModelAttribute("newEvent") Event event, BindingResult result, Model model, HttpSession session) {
		if (session.getAttribute("userId") == null) {
			session.invalidate();
			return "redirect:/";
		}
		if (result.hasErrors()) {
			return "newEvent.jsp";
		} else {
			eventService.createEvent(event);
			return "redirect:/events";
		}
	}
	
	// Find One
	
	@GetMapping("/events/{id}")
	public String eventDetails(@PathVariable("id")Long id, Model model, HttpSession session) {
		if (session.getAttribute("userId") == null) {
			session.invalidate();
			return "redirect:/";
		}
		Event foundEvent = eventService.oneEvent(id);
		model.addAttribute("event", foundEvent);
		return "viewEvent.jsp";
	}
	
	// Edit
	
	// Show Edit
	@GetMapping("/events/edit/{id}")
	public String showEditForm(@PathVariable("id") Long id, Model model, HttpSession session) {
		Event foundEvent = eventService.oneEvent(id);
		model.addAttribute("event", foundEvent);
		if(!foundEvent.getUser().getId().equals( (Long) session.getAttribute("userId"))) {
			return "redirect:/events";
		}
		return "editEvent.jsp";
	}
	
		// Process Edit
	@PutMapping("/events/edit/{id}")
	public String processEdit(@Valid @ModelAttribute("event") Event event, 
			BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "editEvent.jsp";
		} else {
			eventService.createEvent(event);
			return "redirect:/events";
		}
	}
	
	// Delete
	
	@DeleteMapping("/events/delete/{id}")
	public String deleteEvent(@PathVariable("id") Long id) {
		eventService.deleteEvent(id);
		return "redirect:/events";
	}	 
}
