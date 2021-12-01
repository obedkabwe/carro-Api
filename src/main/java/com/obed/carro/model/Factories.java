package com.obed.carro.model;

import java.util.Objects;

public class Factories {
	
	private Integer id;
	private String name;
	private Integer country_code;
	
	

	
	public Factories() {
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getCountry_code() {
		return country_code;
	}


	public void setCountry_code(Integer country_code) {
		this.country_code = country_code;
	}


	public Factories(String name, Integer country_code) {
		super();
		this.name = name;
		this.country_code = country_code;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factories other = (Factories) obj;
		return Objects.equals(id, other.id);
	}


	
	
	
	
	
	
}
