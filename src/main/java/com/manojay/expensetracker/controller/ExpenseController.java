package com.manojay.expensetracker.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manojay.expensetracker.model.Expense;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {
	private List<Expense> expenses = new ArrayList<>();
	
	@GetMapping
	public List<Expense> getExpense(){
		return expenses;
	}
	
	@PostMapping
	public Expense addExpense(@RequestBody Expense expense) {
		expenses.add(expense);
		return expense;
		
	}

}
