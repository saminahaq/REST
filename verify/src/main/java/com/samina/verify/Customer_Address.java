package com.samina.verify;

import org.springframework.stereotype.Repository;

@Repository
public class Customer_Address {

	int Id;
	int Customer_Id;
	String Street_Address;
	String Postal_Code;
	String Country;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getCustomer_Id() {
		return Customer_Id;
	}

	public void setCustomer_Id(int customer_Id) {
		Customer_Id = customer_Id;
	}

	public String getStreet_Address() {
		return Street_Address;
	}

	public void setStreet_Address(String street_Address) {
		Street_Address = street_Address;
	}

	public String getPostal_Code() {
		return Postal_Code;
	}

	public void setPostal_Code(String postal_Code) {
		Postal_Code = postal_Code;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "Customer_Address [Id=" + Id + ", Customer_Id=" + Customer_Id + ", Street_Address=" + Street_Address
				+ ", Postal_Code=" + Postal_Code + ", Country=" + Country + "]";
	}

}
