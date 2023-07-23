package com.qa.attendance.allpage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.mewurk.attendance.base.TestBase;

public class NoAttendancePolicy extends TestBase{
	
	public NoAttendancePolicy() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='title']")
	WebElement NoAttendanceTitle;
	
	@FindBy(xpath = "//div[@class='form-check']")
	WebElement DefaultPresent;
	
	@FindBy(xpath = "//button[normalize-space()='Create']")
	WebElement NoattendanceCreateButton;
	
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	WebElement NoattendanceCancelButton;
	
	@FindBy(xpath = "//button[normalize-space()='Save Without Criteria']")
	WebElement SaveWithoutCriteria;
	
	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement ContinueForCancel;
	
	@FindBy(xpath = "//span[@class='error-msg']")
	WebElement ErrorMessageForExistingTitle;
	
	 
	
	
	

  public void CreateNoattendance() throws Exception {
	  NoAttendanceTitle.sendKeys("New_Noattendance_policy_Aug22");  
	  NoattendanceCreateButton.click(); 
	  SaveWithoutCriteria.click();
	  if(ErrorMessageForExistingTitle.isDisplayed()) {
		  System.out.println("This title is alredy exist");
	  }
	  else {
		  NoAttendanceTitle.sendKeys("New_updatedNoattendance_policy_Aug22");  
		  NoattendanceCreateButton.click(); 
		  SaveWithoutCriteria.click();
	  }
  }
	  
	  
	  public void CancelNoattendance() throws Exception {
		  NoAttendanceTitle.sendKeys("New_cancel_policy_Aug22");  
		  NoattendanceCancelButton.click();
		  ContinueForCancel.click();
	  }
	  
	  public void DeleteNoattendance() throws Exception {
		  NoAttendanceTitle.sendKeys("New_cancel_policy_Aug22");  
		  NoattendanceCancelButton.click();
		  ContinueForCancel.click();
	  }
	  
	/*  if (DefaultPresent.isSelected()) {
		  NoattendanceCreateButton.click(); 
		  SaveWithoutCriteria.click();
	  }
	  else {
		  NoattendanceCancelButton.click();
	  }
	  ContinueForCancel.click();*/
	  
  }