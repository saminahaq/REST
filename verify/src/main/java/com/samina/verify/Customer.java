package com.samina.verify;

import org.springframework.stereotype.Repository;

@Repository
public class Customer {
	private int Id;
	private String Name;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", Name=" + Name + "]";
	}

}
