package com.qa.attendance.allpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.mewurk.attendance.base.TestBase;

public class LoginForAttendance extends TestBase{
	 
		
		@FindBy(xpath = "//input[@name='email']")
	    WebElement UserName;
		@FindBy(xpath = "//input[@name='password']")
	    WebElement Password;
		@FindBy(xpath = "//button[normalize-space()='Login']")
	    WebElement Login;
		
		@FindBy(xpath = "//h4[normalize-space()='Login to access your account!']")
	    WebElement label;
		
		//h4[contains(text()='Login to access your account!')]
		public LoginForAttendance() throws Exception{
			//super();
		    PageFactory.initElements(driver, this);
		}
		
		public String validatelabel() {
			return label.getText();
		
		}
		
		public HomePageAttendance login(String un,String pwd) throws Exception {
			UserName.sendKeys(un);
			Password.sendKeys(pwd);
			Login.click();
			return new HomePageAttendance();
			
		}



}
