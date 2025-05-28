package com.orangehrm.OrangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIMPage {
	WebDriver driver;
	
	 public PIMPage(WebDriver driver) {
	       this.driver = driver;
	   }
	   private By addBtn = By.xpath("//button[text()=' Add ']");
	   private By firstName = By.name("firstName");
	   private By lastName = By.name("lastName");
	   private By saveBtn = By.xpath("//button[@type='submit']");
	   private By employeeList = By.linkText("Employee List");
	  
	   public void addEmployee(String fname, String lname) {
	       driver.findElement(addBtn).click();
	       driver.findElement(firstName).sendKeys(fname);
	       driver.findElement(lastName).sendKeys(lname);
	       driver.findElement(saveBtn).click();
	   }
	   public void openEmployeeList() {
	       driver.findElement(employeeList).click();
	   }
	   public boolean verifyEmployee(String name) {
	       return driver.getPageSource().contains(name);
	   }
}
