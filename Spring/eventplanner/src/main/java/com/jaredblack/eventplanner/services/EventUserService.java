package com.jaredblack.eventplanner.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaredblack.eventplanner.models.EventUser;
import com.jaredblack.eventplanner.repositories.EventUserRepository;

@Service
public class EventUserService {

	@Autowired
	private EventUserRepository eventUserRepo;
	
	// Create
	
	public EventUser createEventUser(EventUser eventUser) {
		return eventUserRepo.save(eventUser);
	}
	
	// Find All
	
	public List<EventUser> allEventUsers(){
		return eventUserRepo.findAll();
	}
	
	// Find One
	
	public EventUser oneEventUser(Long id) {
		Optional<EventUser> optionalEventUser = eventUserRepo.findById(id);
		if(optionalEventUser.isPresent()) {
			return optionalEventUser.get();
		} else {
			return null;
		}
	}
	// Edit
	
	public EventUser editEventUser(EventUser eventUser ) {
		return eventUserRepo.save(eventUser);
	}
	
	// Delete
	
	public void deleteEventUser(Long id) {
		eventUserRepo.deleteById(id);
	}
}
