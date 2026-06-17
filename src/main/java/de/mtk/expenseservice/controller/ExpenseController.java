package de.mtk.expenseservice.controller;

import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpenseController {

    @GetMapping
    @Description(value = "Test Endpoint of Expense Controller")
    public String testEndpoint() {
        return "Welcome to Expenseserice";
     }
}
