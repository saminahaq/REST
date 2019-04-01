package com.samina.verify;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VerifyApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	CustomerJdbcDAO customerDAO;
	@Autowired
	Customer_AddressJdbcDAO customerAddDAO;
	@Autowired
	Service service;

	public static void main(String[] args) {
		SpringApplication.run(VerifyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("All customer -> {}", customerDAO.findAll());
		logger.info("All customer_Address -> {}", customerAddDAO.findAll());

	}

}
