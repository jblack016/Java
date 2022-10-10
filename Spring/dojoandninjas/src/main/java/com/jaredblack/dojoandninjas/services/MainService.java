package com.jaredblack.dojoandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaredblack.dojoandninjas.models.Dojo;
import com.jaredblack.dojoandninjas.models.Ninja;
import com.jaredblack.dojoandninjas.repositories.DojoRepository;
import com.jaredblack.dojoandninjas.repositories.NinjaRepository;

@Service
public class MainService {

	@Autowired
	private DojoRepository dojoRepo;
	
	@Autowired
	private NinjaRepository ninjaRepo;
	
	
	// Find All Dojos
	
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	
	// Find All Ninjas
	
	public List<Ninja> allNinjas(){
		return ninjaRepo.findAll();
	}
	
	// Create Dojos
	
	public Dojo createDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	// Create Ninjas
	
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	// Find one Dojo
	
	public Dojo oneDojo(Long dojoId) {
		Optional<Dojo> optionalDojo = dojoRepo.findById(dojoId);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;
		}
	}
}
