package com.jaredblack.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@GetMapping("/omikuji")
	public String showForm() {
		return "/formPage.jsp";
	}
	
	@PostMapping("/process/omikuji")
	public String processReviewForm(
			@RequestParam("number") Integer number,
			@RequestParam("city") String city,
			@RequestParam("person") String person,
			@RequestParam("hobby") String hobby,
			@RequestParam("thing") String thing,
			@RequestParam("comment") String comment,
			HttpSession session
			) {
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", thing);
		session.setAttribute("comment", comment);
		return "redirect:/omikuji/show";
	}
	
	// 3. Display the Result
@GetMapping("/omikuji/show")
public String displayResults() {
	return "/resultsPage.jsp";
}
	
}
