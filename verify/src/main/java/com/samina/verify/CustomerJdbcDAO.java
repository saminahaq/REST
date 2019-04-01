package com.samina.verify;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Repository
public class CustomerJdbcDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Customer> findAll() {

		return jdbcTemplate.query("select * from Customers", new BeanPropertyRowMapper(Customer.class));
	}

}
