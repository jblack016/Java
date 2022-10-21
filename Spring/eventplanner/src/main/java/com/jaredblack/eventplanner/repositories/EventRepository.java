package com.jaredblack.eventplanner.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jaredblack.eventplanner.models.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {


	List<Event> findAll();
}
