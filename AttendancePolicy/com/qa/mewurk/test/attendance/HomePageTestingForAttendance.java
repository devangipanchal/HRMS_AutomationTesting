package com.qa.mewurk.test.attendance;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.attendance.allpage.AttendancePage;
import com.qa.attendance.allpage.HomePageAttendance;
import com.qa.attendance.allpage.LoginForAttendance;
import com.qa.attendance.allpage.SettingsForAttendance;
import com.qa.mewurk.attendance.base.TestBase;



	public class HomePageTestingForAttendance extends TestBase {
		LoginForAttendance loginPage;
		HomePageAttendance homePage;
		SettingsForAttendance settings;
		AttendancePage attendancepage;
		
		
		public HomePageTestingForAttendance() throws Exception{
			super();
		}
		@BeforeMethod
		public void setUp() throws Exception{
			intialization();
			loginPage = new LoginForAttendance();
			homePage = new HomePageAttendance();
			settings = new SettingsForAttendance();
			attendancepage = new AttendancePage();
			//method level object creation
			homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(3000);
		}
		
		@Test(priority=1)
		public void homepagetitleTest() throws Exception {
			Thread.sleep(5000);
			//homePage = new HomePageAttendance();
			String Hp_title = homePage.validatehomepageTitle();
			Assert.assertEquals(Hp_title,"Mewurk HRMS","Title not matching");
			System.out.print(Hp_title);
			Thread.sleep(3000);
		}
		
		@Test(priority=2)
	public void testclickonsettings() throws Exception {
			//homePage = new HomePage();
			Thread.sleep(3000);
			settings = homePage.clickonsettings();	
		}
		
		/*@Test(priority=3)
		public void testclickonattendance() throws Exception {
				//homePage = new HomePage();
				attendancepage = homePage.clickonsettings();
				Thread.sleep(3000);
				
			}*/
		
	@AfterMethod
		public void tearDown() {
			driver.quit();
		}



}
