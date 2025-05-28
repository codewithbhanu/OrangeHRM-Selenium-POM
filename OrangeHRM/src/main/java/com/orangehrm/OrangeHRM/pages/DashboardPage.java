package com.orangehrm.OrangeHRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By profileIcon = By.className("oxd-userdropdown-img");
	private By logoutLink = By.xpath("//a[text()='logout']");
	private By pimMenu = By.xpath("//span[text()='PIM']");
	
	
	
	public void goToPIM() {
		driver.findElement(pimMenu).click();
	}
	
	public void logout() {
		driver.findElement(profileIcon).click();
		driver.findElement(logoutLink).click();
	}
}
