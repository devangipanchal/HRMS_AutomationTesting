package com.qa.mewurk.test.attendance;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.attendance.allpage.AttendancePage;
import com.qa.attendance.allpage.ChooseTemplateForPolicy;
import com.qa.attendance.allpage.CreateFixedPolicy;
import com.qa.attendance.allpage.CreateFlexiPolicy;
import com.qa.attendance.allpage.HomePageAttendance;
import com.qa.attendance.allpage.LoginForAttendance;
import com.qa.attendance.allpage.NoAttendancePolicy;
import com.qa.attendance.allpage.SettingsForAttendance;
import com.qa.mewurk.attendance.base.TestBase;

public class ChooseTemplateTest extends TestBase{
	
	LoginForAttendance loginPage;
	HomePageAttendance homePage;
	AttendancePage attendancepage;
	SettingsForAttendance settings;
	ChooseTemplateForPolicy choosetemplate;
	CreateFixedPolicy FixedPolicy;
	 CreateFlexiPolicy FlexiPolicy;
	 NoAttendancePolicy NoAttendance;
	    	
	 public ChooseTemplateTest() throws IOException {
			super();
			// TODO Auto-generated constructor stub
	 }
	 
	      @BeforeMethod6
			public void setUp() throws Exception{
				intialization();
				loginPage = new LoginForAttendance();
				homePage = new HomePageAttendance();
				attendancepage = new AttendancePage();
				settings = new SettingsForAttendance();
				choosetemplate = new ChooseTemplateForPolicy(); 
				FlexiPolicy = new CreateFlexiPolicy();
				FixedPolicy = new CreateFixedPolicy();
				NoAttendance = new NoAttendancePolicy();
				homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		       	homePage.clickonsettings();
		       	settings.clickonattendance();
	            attendancepage.clickoncreatenewpolicy();
	
	}
	      @Test(priority=2)
			public void TestFixedPolicy() throws Exception {
	    	  FixedPolicy = choosetemplate.Fixedtemplate();
			}
	

			@Test(priority=1)
			public void TestFlexiPolicy() throws Exception {
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				Thread.sleep(6000);
				FlexiPolicy = choosetemplate.ClickOnFlexiTemplate();
				//choosetemplate.ClickOnFlexiTemplate();
						
			}
			
		@Test(priority=3)
			public void TestNoAttendance() throws Exception {
				NoAttendance = choosetemplate.Noattendancetemplate();
		}
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
	
}
