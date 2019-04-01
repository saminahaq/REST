package com.samina.verify;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

@Repository
public class Customer_AddressJdbcDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Customer_Address> findAll() {

		return jdbcTemplate.query("select * from Customer_Address", new BeanPropertyRowMapper(Customer_Address.class));
	}

}
