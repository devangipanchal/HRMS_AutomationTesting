package com.qa.attendance.allpage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.mewurk.attendance.base.TestBase;

public class ChooseTemplateForPolicy extends TestBase{ 
	
	public ChooseTemplateForPolicy() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h4[normalize-space()='Choose from available templates']")
	WebElement Choosetemplatelabel;

	
	@FindBy(xpath = "//input[@id='1']")
	//li[@class='templateActive']
	WebElement Fixedtemplate;

	@FindBy(xpath = "//input[@id='2']")
	//div[@class='row']//li[2]
	WebElement flexitemplate;
	
	
	
	@FindBy(xpath = "//input[@id='3']")
	//div[@class='row']//li[3]
	WebElement Withoutshift;
	
	@FindBy(xpath = "//input[@id='4']")
	//div[@class='row']//li[4]
	WebElement Withshift;
	
	@FindBy(xpath = "//input[@id='5']")
	//div[@class='row']//li[5]
	WebElement SinglePunch;
	
	@FindBy(xpath = "//input[@id='6']")
	//div[@class='row']//li[6]
	WebElement Noattendance;
	
	@FindBy(xpath = "//input[@id='7']")
	//div[@class='row']//li[7]
	WebElement CustomPolicy;

	@FindBy(xpath = "//button[normalize-space()='Next']")
	WebElement NextButton;
	////button[contains(text(),'Next') and @class='me-Button me-BtnPrimary btn btn-primary']

	
	
	
	/*public String validateLabel() {
		//String labelText = System.out.print(Choosetemplatelabel.getText());
		//Choose from available templates
	}*/
	
	public CreateFixedPolicy Fixedtemplate() throws Exception {
		//Thread.sleep(3000);
		Fixedtemplate.click();
		try {
		     driver.findElement(By.xpath("//button[contains(text(),'Next') and @type='button']")).click();
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[contains(text(),'Next') and @type='button']")));
		  }
		//NextButton.click();
		return new CreateFixedPolicy();
}
	
	public CreateFlexiPolicy ClickOnFlexiTemplate() throws Exception {
		flexitemplate.click();
		try {
		     driver.findElement(By.xpath("//button[contains(text(),'Next') and @type='button']")).click();
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[contains(text(),'Next') and @type='button']")));
		  }
		//NextButton.click();
		return new CreateFlexiPolicy();
		//return  null;
}
	/*public CreateWithoutshiftPolicy  Withoutshifttemplate() throws Exception {
		Withoutshift.click();
		return new CreateWithoutshiftPolicy ();
}*/
	public CreateSinglepunchPolicy Singlepunchtemplate() throws Exception {
		SinglePunch.click();
		try {
		     driver.findElement(By.xpath("//button[contains(text(),'Next') and @type='button']")).click();
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[contains(text(),'Next') and @type='button']")));
		  }
		//NextButton.click();
		return new CreateSinglepunchPolicy ();
}
	public NoAttendancePolicy Noattendancetemplate() throws Exception {
		Noattendance.click();
		try {
		     driver.findElement(By.xpath("//button[contains(text(),'Next') and @type='button']")).click();
		  } catch (Exception e) {
		     JavascriptExecutor executor = (JavascriptExecutor) driver;
		     executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[contains(text(),'Next') and @type='button']")));
		  }
		//NextButton.click();
		return new NoAttendancePolicy();
	
	}

}	
	


	


