package com.karthik.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;
	
	private String cityName;
	
	private String stateName;
	
	private String typeOfResidence;
	
	@ManyToOne
	@JoinColumn(name="emp_id")
	private Employee emp;
	
	public Address() {
		
	}

	public Address(String cityName, String stateName, String typeOfResidence, Employee emp) {
		
		this.cityName = cityName;
		this.stateName = stateName;
		this.typeOfResidence = typeOfResidence;
		this.emp = emp;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getTypeOfResidence() {
		return typeOfResidence;
	}

	public void setTypeOfResidence(String typeOfResidence) {
		this.typeOfResidence = typeOfResidence;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	
	
	
}
