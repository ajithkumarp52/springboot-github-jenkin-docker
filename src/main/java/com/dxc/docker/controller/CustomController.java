package com.dxc.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.docker.model.Customer;

@RestController
public class CustomController {
	@RequestMapping("/customer")
	public Customer displayCustomer() {
		Customer customer = new Customer("Ajith","kumar","9442575346");
		return customer;
	}
}
