package com.qa.mewurk.test.attendance;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.attendance.allpage.AttendancePage;
import com.qa.attendance.allpage.ChooseTemplateForPolicy;
import com.qa.attendance.allpage.HomePageAttendance;
import com.qa.attendance.allpage.LoginForAttendance;
import com.qa.attendance.allpage.SettingsForAttendance;
import com.qa.mewurk.attendance.base.TestBase;




public class AttendancePageTesting extends TestBase{ 
	
	LoginForAttendance loginPage;
	HomePageAttendance homePage;
	AttendancePage attendancepage;
	SettingsForAttendance settings;
	 ChooseTemplateForPolicy choosetemplate;
	    	
			public AttendancePageTesting() throws Exception{
				super();
				}
			
			@BeforeMethod
			public void setUp() throws Exception{
				intialization();
				loginPage = new LoginForAttendance();
				homePage = new HomePageAttendance();
				attendancepage = new AttendancePage();
				settings = new SettingsForAttendance();
				choosetemplate = new ChooseTemplateForPolicy(); 
			/*	loginPage = PageFactory.initElements(driver, LoginForAttendance.class);
				homePage = PageFactory.initElements(driver, HomePageAttendance.class);
				settings = PageFactory.initElements(driver, SettingsForAttendance.class);
				attendancepage = PageFactory.initElements(driver, AttendancePage.class);
				choosetemplate = PageFactory.initElements(driver, ChooseTemplateForPolicy.class);*/
				
				
				homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		       	homePage.clickonsettings();	
		       settings.clickonattendance();
		            // attendancepage.clickoncreatenewpolicy();
				//attendancepage = settings.clickonattendance();
		       Thread.sleep(3000);
			}
			
			/*@Test(priority=1)
			public void testcreatepolicy() throws Exception {
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				Thread.sleep(6000);
				choosetemplate = attendancepage.clickoncreatenewpolicy();		
			}*/
			
			
			@Test(priority=2)
			public void testEditpolicy() throws Exception {
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				Thread.sleep(6000);
				attendancepage.EditAttendancePolicy();		
			}
			
			@Test(priority=3)
			public void testDeletepolicy() throws Exception {
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				Thread.sleep(3000);
				attendancepage.DeleteAttendancePolicy();		
			}
			@AfterMethod
			public void tearDown() {
				driver.quit();
			}
		

}
