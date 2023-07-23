package com.qa.mewurk.attendance.testutil;

import org.openqa.selenium.support.PageFactory;

import com.qa.mewurk.attendance.base.TestBase;



public class TestUtil extends TestBase {
	
	 		
			public static long PAGE_LOAD_TIMEOUT=70;
			public static long IMPLICIT_WAIT=80;

			public TestUtil() throws Exception{
				PageFactory.initElements(driver, this);
				}

}
