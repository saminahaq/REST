package com.samina.verify;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Repository
public class Customer_AddressJdbcDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Customer_Address> findAll() {

		return jdbcTemplate.query("select * from Customer_Address", 
				new BeanPropertyRowMapper(Customer_Address.class));
	}

	public List<Customer_Address> List() {
	return jdbcTemplate.query("SELECT * from customers c join Customer_Address ca on c.Id  = ca.Customer_Id", 
				new BeanPropertyRowMapper(Customer_Address.class));
	}

}
