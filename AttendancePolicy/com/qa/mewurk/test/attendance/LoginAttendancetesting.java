package com.qa.mewurk.test.attendance;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.attendance.allpage.HomePageAttendance;
import com.qa.attendance.allpage.LoginForAttendance;
import com.qa.mewurk.attendance.base.TestBase;


public class LoginAttendancetesting extends TestBase{
		
		
		LoginForAttendance loginPage;
		HomePageAttendance homePage;
		//AllFilesPage allfilesPage;
		//LoginPage loginPage1;
		
		public LoginAttendancetesting() throws Exception {
			super();
		}
		
		@BeforeMethod
		public void setUp() throws Exception{
			intialization();
			loginPage = new LoginForAttendance();
			//method level object creation
		}
		
		@Test(priority=1)
		public void loginpagelabelTest() throws Exception {
			String test_label = loginPage.validatelabel();
			Assert.assertEquals(test_label,"Login to access your account!");
			System.out.print(test_label);
			
		}
		@Test(priority=2)
		public void loginTest() throws Exception {
			homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
			//homePage =(HomePage)
		}
		
		@AfterMethod
		public void tearDown() {
		driver.quit();
		}
	}
