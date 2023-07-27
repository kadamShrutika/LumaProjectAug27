package com.luma.testLayer;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.luma.pageLayer.HomePage;
import com.luma.pageLayer.LoginPage;
import com.luma.testBase.TestBase;

public class LoginPageTest extends TestBase {
	
	@Test
	
	public void VerifyLoginTest() throws InterruptedException 
	{
		
		String expeted_result = "Welcome "; 
		
		 
		home_obj.clickOnLoginLink();
		
	
		login_obj.enterUsername("testacc3");
		login_obj.enterpassWord("test");
		login_obj.clickOnLoginbtn();
		Thread.sleep(4000);
		logger.info("User logged in system");
		String actual_result = login_obj.getLoginStatus();
		
		//System.out.println(actual_result);
		
		Assert.assertEquals(actual_result, expeted_result);
	}
	

}
