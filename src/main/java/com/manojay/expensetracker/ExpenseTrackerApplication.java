package com.manojay.expensetracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(
	    exclude = {DataSourceAutoConfiguration.class}
	)
public class ExpenseTrackerApplication {

	public static void main(String[] args) {

		SpringApplication.run(ExpenseTrackerApplication.class, args);
		System.out.println("JAVA Version " + System.getProperty("java.version"));
	}

}
