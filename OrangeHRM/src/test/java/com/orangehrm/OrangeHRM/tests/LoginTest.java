package com.orangehrm.OrangeHRM.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.orangehrm.OrangeHRM.base.BaseTest;
import com.orangehrm.OrangeHRM.pages.LoginPage;



public class LoginTest extends BaseTest {
	private WebDriver driver;
	
	@Test 
	public void testValidLogin() {
		
		LoginPage login = new LoginPage(driver);
		login.login("Admin", "admin123");
		
		assert driver.getCurrentUrl().contains("dashboard");
	}
}
