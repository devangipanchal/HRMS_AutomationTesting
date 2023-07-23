package com.qa.mewurk.test.attendance;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.attendance.allpage.AttendancePage;
import com.qa.attendance.allpage.ChooseTemplateForPolicy;
import com.qa.attendance.allpage.CreateFixedPolicy;
import com.qa.attendance.allpage.CreateFlexiPolicy;
import com.qa.attendance.allpage.HomePageAttendance;
import com.qa.attendance.allpage.LoginForAttendance;
import com.qa.attendance.allpage.SettingsForAttendance;
import com.qa.mewurk.attendance.base.TestBase;

public class FixedPolicyTest extends TestBase{
	

	LoginForAttendance loginPage;
	HomePageAttendance homePage;
	AttendancePage attendancepage;
	SettingsForAttendance settings;
	 ChooseTemplateForPolicy choosetemplate;
	 CreateFlexiPolicy FlexiPolicy;
	 CreateFixedPolicy FixedPolicy;

	public FixedPolicyTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	 @BeforeMethod
		public void setUp() throws Exception{
			intialization();
			loginPage = new LoginForAttendance();
			homePage = new HomePageAttendance();
			attendancepage = new AttendancePage();
			settings = new SettingsForAttendance();
			choosetemplate = new ChooseTemplateForPolicy(); 
			FlexiPolicy = new CreateFlexiPolicy();
			FixedPolicy = new CreateFixedPolicy();
			homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	       	homePage.clickonsettings();
	       	settings.clickonattendance();
            attendancepage.clickoncreatenewpolicy();
            choosetemplate.ClickOnFlexiTemplate();

}
	 @Test(priority=1)
		public void TestAttendanceFlexiPolicy() throws Exception { 
		 FixedPolicy.CreateAttendanceFixedPolicy();
					
		}
	 @AfterMethod
		public void tearDown() {
			driver.quit();
		}


}
