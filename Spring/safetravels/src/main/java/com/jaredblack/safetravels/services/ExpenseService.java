package com.jaredblack.safetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jaredblack.safetravels.models.Expense;
import com.jaredblack.safetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {

	private final ExpenseRepository expenseRepository;
	
	public ExpenseService(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}
	
		// ********** Find All ********** //
	
	public List<Expense> allExpenses(){
		return expenseRepository.findAll();
	}
	
		// ********** Create ********** //
	
	public Expense createExpense(Expense expense) {
		return expenseRepository.save(expense);
	}
	
		// ********** Find One ********** //
	
	public Expense findExpense(Long id) {
		// Optional means the object can exist or not
		Optional<Expense> optionalExpense = expenseRepository.findById(id);
		if(optionalExpense.isPresent()) {
			return optionalExpense.get();
		} else {
			return null;
		}
	}
	
		// ********** Update ********** //
	
	public Expense updateExpense(Expense expense) {
		return expenseRepository.save(expense);
	}
	
		// ********** Delete ********** //
	
	public void deleteExpense(Long id) {
		Optional <Expense> optionalExpense = expenseRepository.findById(id);
		if(optionalExpense.isPresent()) {
			expenseRepository.deleteById(id);
		}
	}
	
	
}
