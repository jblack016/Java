package com.jaredblack.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {

	@RequestMapping("/") // Default GET
	public String human(@RequestParam(value = "name", required = false) String name) {
		if (name == null) {
			return "Hello Human!";
		}else {
			return "Hello " + name + "!";
		}
	}
}