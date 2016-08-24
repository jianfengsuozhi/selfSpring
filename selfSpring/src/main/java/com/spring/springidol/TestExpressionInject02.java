package com.spring.springidol;

import java.util.List;

public class TestExpressionInject02 {
	private City choseCities;
	private String name;
	private String java_home;
	private char chars;
	private List<City> bigCities;
	private City bigCity;
	
	
	public City getBigCity() {
		return bigCity;
	}

	public void setBigCity(City bigCity) {
		this.bigCity = bigCity;
	}

	public List<City> getBigCities() {
		return bigCities;
	}

	public void setBigCities(List<City> bigCities) {
		this.bigCities = bigCities;
	}

	public char getChars() {
		return chars;
	}

	public void setChars(char chars) {
		this.chars = chars;
	}

	public String getJava_home() {
		return java_home;
	}

	public void setJava_home(String java_home) {
		this.java_home = java_home;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getChoseCities() {
		return choseCities;
	}

	public void setChoseCities(City choseCities) {
		this.choseCities = choseCities;
	}

	@Override
	public String toString() {
		return "TestExpressionInject02 [choseCities=" + choseCities + ", name="
				+ name + ", java_home=" + java_home + ", chars=" + chars
				+ ", bigCities=" + bigCities + ", bigCity=" + bigCity + "]";
	}
}
