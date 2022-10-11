package com.jaredblack.bookclub.controllers;

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

import com.jaredblack.bookclub.models.Book;
import com.jaredblack.bookclub.services.BookService;

@Controller
public class HomeController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public String dashboard(HttpSession session, Model model){
		if(session.getAttribute("userId")==null) {
			session.invalidate();
			return "redirect:/";
		}
		model.addAttribute("bookList", bookService.allBooks());
		
		return "dashboard.jsp";
		}
	
	// Create
	
	// Show
	@GetMapping("/books/new")
	public String renderCreateBook(
			@ModelAttribute("newBook") Book newBook) {
		return "newBook.jsp";
	}
	
		// Process Create
	@PostMapping("books/process")
	public String processBookForm(@Valid @ModelAttribute("newBook") Book book, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "newBook.jsp";
		} else {
			bookService.createBook(book);
			return "redirect:/books";
		}
	}
	
	// Find One
	
	@GetMapping("/books/{id}")
	public String bookDetails(@PathVariable("id")Long id, Model model) {
		Book foundBook = bookService.oneBook(id);
		model.addAttribute("book", foundBook);
		return "viewBook.jsp";
	}
	
	// Edit
	
	// Show Edit
	@GetMapping("/books/edit/{id}")
	public String showEditForm(@PathVariable("id") Long id, Model model, HttpSession session) {
		Book foundBook = bookService.oneBook(id);
		model.addAttribute("book", foundBook);
		if(!foundBook.getUser().getId().equals( (Long) session.getAttribute("userId"))) {
			return "redirect:/books";
		}
		return "editBook.jsp";
	}
	
		// Process Edit
	@PutMapping("/books/edit/{id}")
	public String processEdit(@Valid @ModelAttribute("book") Book book, 
			BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "editBook.jsp";
		} else {
			bookService.createBook(book);
			return "redirect:/books";
		}
	}
	 
	// Delete
	
	@DeleteMapping("/books/delete/{id}")
	public String deleteBook(@PathVariable("id") Long id) {
		bookService.deleteBook(id);
		return "redirect:/books";
	}
}
