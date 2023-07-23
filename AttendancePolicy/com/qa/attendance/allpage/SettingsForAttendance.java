package com.qa.attendance.allpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.mewurk.attendance.base.TestBase;

public class SettingsForAttendance extends TestBase{
	
	public SettingsForAttendance() throws Exception{
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath ="//h6[@class='page-title']")  WebElement settings_title;

	@FindBy(xpath = "//a[normalize-space()='Attendance']")
	WebElement attendance;
	
	public String validatesettingspagetitle() {
		return driver.getTitle();
	}
	
	public AttendancePage clickonattendance() throws Exception {
		attendance.click();
		return new AttendancePage();
		
}
}
