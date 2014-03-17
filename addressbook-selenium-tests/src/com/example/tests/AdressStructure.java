package com.example.tests;

public class AdressStructure {
	public String name1;
	public String name2;
	public String adress;
	public String homephone;
	public String workphone;
	public String mobilephone;
	public String email1;
	public String email2;
	public String day;
	public String month;
	public String year;
	public String group;
	public String adress2;
	public String phone2;

	public AdressStructure() {
		
	}
	
	public AdressStructure(String name1, String name2, String adress,
			String homephone, String workphone, String mobilephone,
			String email1, String email2, String day, String month,
			String year, String group, String adress2, String phone2) {
		this.name1 = name1;
		this.name2 = name2;
		this.adress = adress;
		this.homephone = homephone;
		this.workphone = workphone; 
		this.mobilephone = mobilephone;
		this.email1 = email1;
		this.email2 = email2;
		this.day = day;
		this.month = month;
		this.year = year;
		this.group = group;
		this.adress2 = adress2;
		this.phone2 = phone2;
	}
}