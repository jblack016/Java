package com.jaredblack.eventplanner.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaredblack.eventplanner.models.Event;
import com.jaredblack.eventplanner.repositories.EventRepository;

@Service
public class EventService {

	
	@Autowired
	private EventRepository eventRepo;
	
	// Create
	
	public Event createEvent(Event event) {
		return eventRepo.save(event);
	}
	
	// Find All
	
	public List<Event> allEvents(){
		return eventRepo.findAll();
	}
	
	// Find One
	
	public Event oneEvent(Long id) {
		Optional<Event> optionalEvent = eventRepo.findById(id);
		if(optionalEvent.isPresent()) {
			return optionalEvent.get();
		} else {
			return null;
		}
	}
	
	// Edit Process
	
	public Event editEvent(Event event ) {
		return eventRepo.save(event);
	}
	
	// Delete
	
	public void deleteEvent(Long id) {
		eventRepo.deleteById(id);
	}
	
	
}
