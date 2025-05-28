package com.orangehrm.OrangeHRM.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By username = By.xpath("//input[@name='username']");
	private By password = By.name("password");
	private By loginBtn = By.xpath("//button[@type = 'submit']");
	
	
	
	public void login(String uname, String pwd) {
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();
	}
}
