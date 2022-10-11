package com.jaredblack.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaredblack.bookclub.models.Book;
import com.jaredblack.bookclub.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepo;
	
	// Create
	
	public Book createBook(Book book) {
		return bookRepo.save(book);
	}
	
	// Find All
	
	public List<Book> allBooks(){
		return bookRepo.findAll();
	}
	
	// Find One
	
	public Book oneBook(Long id) {
		Optional<Book> optionalBook = bookRepo.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
	
	// Edit Process
	
	public Book editBook(Book book ) {
		return bookRepo.save(book);
	}
	
	// Delete
	
	public void deleteBook(Long id) {
		bookRepo.deleteById(id);
	}
}
