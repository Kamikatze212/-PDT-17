package com.example.tests;

import org.testng.annotations.Test;

public class AddAdressTests extends TestBase{
 
  @Test
  public void testNonEmptyAddAdres() throws Exception {
    openMainPage();
    gotoAddNew();
	AdressStructure group1 = new AdressStructure();
	group1.name1 = "test4";
	group1.name2 = "test4";
	group1.adress = "Moscow";
	group1.homephone = "25232545";
	group1.mobilephone = "892045487821";
	group1.workphone = "87125145411";
	group1.email1 = "neoline.test@gmail.com";
	group1.email2 = "test.mail@neoline.biz";
	group1.day = "12";
	group1.month = "April";
	group1.year = "1986";
	group1.group = "group 1";
	group1.adress2 = "Germany";
	group1.phone2 = "54545844646";
	fillGroupForm(group1);
    submitAddNew();
    returnToHomePage();
  }
  @Test 
  public void testEmptyAddAdres() throws Exception {
	openMainPage();
	gotoAddNew();
    fillGroupForm(new AdressStructure("", "", "", "", "", "", "", "", "-", "-", "", "[none]", "", ""));
	submitAddNew();
	returnToHomePage();
	  }


}
