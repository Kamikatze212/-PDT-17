package com.example.tests;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

	private static WebDriver driver;
	private static String baseUrl;
	private static boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();

	@BeforeTest
	public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://localhost/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	protected void returnToGroupPage() {
	    driver.findElement(By.linkText("group page")).click();
	  }

	protected void submitGroupCreation() {
	    driver.findElement(By.name("submit")).click();
	  }

	protected void fillGroupForm(GroupData group) {
	    driver.findElement(By.name("group_name")).clear();
	    driver.findElement(By.name("group_name")).sendKeys(group.name);
	    driver.findElement(By.name("group_header")).clear();
	    driver.findElement(By.name("group_header")).sendKeys(group.header);
	    driver.findElement(By.name("group_footer")).clear();
	    driver.findElement(By.name("group_footer")).sendKeys(group.footer);
	  }

	protected void initGroupCreation() {
	    driver.findElement(By.name("new")).click();
	  }

	protected void gotoGroupsPage() {
	    driver.findElement(By.linkText("groups")).click();
	  }

	protected void openMainPage() {
	    driver.get(baseUrl + "/addressbookv4.1.4/");
	  }

	@AfterTest
	public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }

	protected void returnToHomePage() {
		driver.findElement(By.linkText("home page")).click();
	}

	protected void submitAddNew() {
		driver.findElement(By.name("submit")).click();
	}

	protected void gotoAddNew() {
		driver.findElement(By.linkText("add new")).click();
	}

	protected void fillTextField(String textFieldName, String fillWithText) {
		driver.findElement(By.name(textFieldName)).clear();
		driver.findElement(By.name(textFieldName)).sendKeys(fillWithText);
	}

	protected void fillGroupForm(AdressStructure group1) {
		fillTextField("firstname", group1.name1);
		fillTextField("lastname",group1.name2);
		fillTextField("address",group1.adress );
		fillTextField("home",group1.homephone);
		fillTextField("work",group1.workphone);
		fillTextField("mobile",group1.mobilephone);
		fillTextField("email",group1.email1);
		fillTextField("email2",group1.email2);
	    new Select(driver.findElement(By.name("bday"))).selectByVisibleText(group1.day);
	    new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText(group1.month);
	    fillTextField("byear",group1.year);
	    new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(group1.group);
	    fillTextField("address2",group1.adress2);
	    fillTextField("phone2",group1.phone2);
	}
	

}
