package com.qa.mewurk.attendance.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.mewurk.attendance.testutil.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException {
		try {
			prop=new Properties();
			//FileInputStream ip =new FileInputStream("C:\\Users\\Chaitra.P\\eclipse-workspace\\AttendancePolicy\\src\\main\\java\\com\\qa\\mewurk\\attendance\\config\\Config.properties");
			FileInputStream ip =new FileInputStream("C:\\Users\\Devangi.Panchal\\Desktop\\Workspace\\AttendancePolicy\\com\\qa\\mewurk\\attendance\\config\\Config.properties");
			prop.load(ip);
		}
		catch(FileNotFoundException e) {
		e.printStackTrace();
		}	
		catch(IOException e) {
			e.printStackTrace();
			}	
	}
	public static void intialization() {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"));{
			//System.setProperty("webdriver.chrome.driver","E:\\DriverExecutables\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver","webdriver.chrome.driver\",\"C:\\Users\\Devangi.Panchal\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			  driver = new ChromeDriver();
			}
		
		if(browserName.equals("FF")){
				//System.setProperty("webdriver.gecko.driver","E:\\DriverExecutables\\chromedriver.exe");
			    System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
				  driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}



}
