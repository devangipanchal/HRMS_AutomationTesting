package com.qa.attendance.allpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.mewurk.attendance.base.TestBase;


public class AttendancePage extends TestBase{
	
		
		public AttendancePage() throws Exception{
			
			PageFactory.initElements(driver, this);
			}
		
		@FindBy(xpath = " //h4[normalize-space()='Attendance Policies']")
		WebElement listviewlabel;
		
		
		@FindBy(xpath = "//button[normalize-space()='Create New Policy']")
		WebElement createnewpolicy;
		
		@FindBy(xpath = "//span[normalize-space()='Aug_newFlexi']")
		WebElement EditPolicy;
		
		@FindBy(xpath = "//button[2]//img[1]")
		WebElement EditIcon;
		
		
		
		@FindBy(xpath = "//input[@id='title']")
		WebElement FlexiTitle;

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
		
		@FindBy(xpath = "//input[@placeholder='hh : mm'and @name='attendanceSetting.minWorkingHourInDay']")
		WebElement MinHoursForFullDay;
		
		@FindBy(xpath = "//button[@type='button']//img[@alt='linkarrowright']")
		WebElement AdditionalSettings;
		
		@FindBy(xpath = "//button[normalize-space()='Update']")
		WebElement UpdateButton;	

		@FindBy(xpath = "//span[normalize-space()='chaitra!@21']")
		WebElement DeletePolicy;	
		
		@FindBy(xpath = "//img[@alt='delete_icon']")
		WebElement DeleteButton;
		
		@FindBy(xpath = "//button[normalize-space()='Delete']")
		WebElement ConfirmDelete;
		
		

		
		public boolean validatelistviewlabel() {
			return listviewlabel.isDisplayed();
		}
		
		public ChooseTemplateForPolicy clickoncreatenewpolicy() throws Exception {
			
			Thread.sleep(3000);
			createnewpolicy.click();
			return new ChooseTemplateForPolicy();
	} 
		public void EditAttendancePolicy() throws Exception {
			 Thread.sleep(3000);
			 EditPolicy.click();
			 Thread.sleep(3000);
			 EditIcon.click();
			 Thread.sleep(3000);
			 FlexiTitle.clear();
			 FlexiTitle.sendKeys("UpdatedPolicyforautomation");
			StartFrom.clear();
			StartFrom.sendKeys("09:00");
			EndTo.clear();
			EndTo.sendKeys("06:00");
			MinHoursForHalfDay.clear();
			MinHoursForHalfDay.sendKeys("04:00");
			MinHoursForFullDay.clear();
			MinHoursForFullDay.sendKeys("08:00");
			UpdateButton.click();
		}
		public void DeleteAttendancePolicy() throws Exception {
			DeletePolicy.click();
			Thread.sleep(3000);
			DeleteButton.click();
			ConfirmDelete.click();
		}
}
		