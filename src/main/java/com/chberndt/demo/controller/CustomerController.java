package com.chberndt.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chberndt.demo.model.Customer;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class CustomerController {

	private static final List<Customer> CUSTOMERS = List.of(new Customer(1L, "john", "doe", "john@chberndt.com"),
			new Customer(2L, "mary", "public", "mary@chberndt.com"),
			new Customer(3L, "foo", "bar", "foo@chberndt.com"),
			new Customer(4L, "dunny", "duncan", "dunny@chberndt.com"));

	@GetMapping
	public List<Customer> findAllCustomers() {
		return CUSTOMERS;
	}

}
