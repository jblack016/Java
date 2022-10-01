package com.jaredblack.daikichiroutes.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DaikichiController {

	@RequestMapping("/daikichi") // Default GET
	public String welcome() {
		return "Welcome!";
	}
	
	@RequestMapping("/daikichi/today") // Default GET
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/daikichi/tomorrow") // Default GET
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/daikichi/travel/{place}") // Default GET
	public String travel(@PathVariable("place") String place) {
		return "Congratulations! You will travel to " + place + " soon!";
	}
	
	@RequestMapping("/daikichi/lotto/{num}") // Default GET
	public String lotto(@PathVariable("num") int num) {
		if(num % 2 == 0 ) {
			return "You will take a grand journey in the near future, but be wary of tempting offers!";
		} else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}
}
