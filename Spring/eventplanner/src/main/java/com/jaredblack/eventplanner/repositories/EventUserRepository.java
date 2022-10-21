package com.jaredblack.eventplanner.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jaredblack.eventplanner.models.EventUser;

@Repository
public interface EventUserRepository extends CrudRepository<EventUser, Long> {

	List<EventUser> findAll();
	
	
}
