package com.samina.verify;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Repository
@RestController
public class Service {

	@Autowired
	CustomerJdbcDAO customerService;
	@Autowired
	Customer_AddressJdbcDAO customerAddService;
	@Autowired
	Customer customer;
	@Autowired
	Customer_Address customer_address;

	@GetMapping(path = "/Customer")
	public List<Customer> reteriveAllCustomer() {
		return customerService.findAll();
	}

	@GetMapping(path = "/CustomerAddress")
	public List<Customer_Address> reteriveCustomerAddress() {
		return customerAddService.findAll();
	}

}
