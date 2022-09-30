package com.jaredblack.daikichiroutes.controllers;

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
}
