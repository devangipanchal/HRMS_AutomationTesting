package com.qa.attendance.allpage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.mewurk.attendance.base.TestBase;



public class HomePageAttendance extends TestBase{
		
		public HomePageAttendance() throws Exception{
		PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath ="//h6[@class='page-title']")  WebElement Hp_title;
		
		@FindBy(xpath = "//span[normalize-space()='Settings']") WebElement settings;

		
		//ul[@id='side-menu']/li[8]/a
		////li[@class='mm-active']
		//li[@class='mm-active']//a[@class='waves-effect']
		
		public String validatehomepageTitle() {
			return driver.getTitle();
		}
		
		public SettingsForAttendance clickonsettings() throws Exception {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", settings);
			settings.click();
			return new SettingsForAttendance();
	}
		
		
		
		}

