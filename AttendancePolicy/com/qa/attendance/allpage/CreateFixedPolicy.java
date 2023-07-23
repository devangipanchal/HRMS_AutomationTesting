package com.qa.attendance.allpage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.mewurk.attendance.base.TestBase;

public class CreateFixedPolicy extends TestBase {
	
	public CreateFixedPolicy() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='title']")
	WebElement FixedTitle;

	@FindBy(xpath = "//input[@placeholder='hh : mm'and @name='attendanceSetting.workingStartTimeHour']")
	WebElement StartFrom;

	@FindBy(xpath = "//input[@placeholder='hh : mm'and @name='attendanceSetting.workingEndTimeHour']")
	WebElement EndTo;

	@FindBy(xpath = "//select[@id='workingStartTimeMode']")
	WebElement StartIsAm;

	@FindBy(xpath = "//select[@id='workingEndTimeMode']")
	WebElement EndIsPm;

	@FindBy(xpath = "//select[@id='workDurationCalculatedBy']")
	WebElement SelectClockType;
	
	
	
	@FindBy(xpath = "//input[@placeholder='hh : mm'and @name='attendanceSetting.minHalfDayHour']")
	WebElement MinHoursForHalfDay;
	
	@FindBy(xpath = "//input[@placeholder='hh : mm'and @name='attendanceSetting.minFullDayHour']")
	WebElement MinHoursForFullDay;
	
	@FindBy(xpath = "//button[@type='button']//img[@alt='linkarrowright']")
	WebElement AdditionalSettings;
	
	@FindBy(xpath = "//button[@type='submit' and normalize-space()='Create']")
	WebElement CreateButton;	

	public void CreateAttendanceFixedPolicy() throws Exception {
		FixedTitle.sendKeys("NewtestPolicyforautomation");
		StartFrom.sendKeys("09:00");
		EndTo.sendKeys("06:00");
		MinHoursForHalfDay.sendKeys("04:00");
		MinHoursForFullDay.sendKeys("08:00");
		CreateButton.click();
	}



}
