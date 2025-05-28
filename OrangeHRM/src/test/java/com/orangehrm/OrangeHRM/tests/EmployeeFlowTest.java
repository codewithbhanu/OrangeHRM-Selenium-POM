package com.orangehrm.OrangeHRM.tests;

import org.testng.annotations.Test;

import com.orangehrm.OrangeHRM.base.BaseTest;
import com.orangehrm.OrangeHRM.pages.DashboardPage;
import com.orangehrm.OrangeHRM.pages.LoginPage;
import com.orangehrm.OrangeHRM.pages.PIMPage;

public class EmployeeFlowTest extends BaseTest{
	
	@Test
	public void testAddAndVerifyEmployee() {
		LoginPage login = new LoginPage(driver);
		login.login("Admin", "admin123");
		
		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.goToPIM();
		
		PIMPage pim = new PIMPage(driver);
		pim.addEmployee("Teja", "Kalagatla");
		pim.openEmployeeList();
		
		assert pim.verifyEmployee("Teja");
	}
	
}
