package com.luma.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.luma.testBase.TestBase;

public class UtilClass extends TestBase{

	public UtilClass()
	{
		PageFactory.initElements(driver, this);
	} 
	
	public void acceptAlert()
	{
		driver.switchTo().alert().accept();
	}
	public static void takess(String filename) {// becz if use nonstatic shows null point exception
		
		String path = "C:\\Users\\ASUS\\eclipse-workspace\\LumaProject27Aug\\Screenshots\\";
		
		try {
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File des = new File(path+filename+".png");
			FileHandler.copy(src,des);
			
		} catch (IOException e) {
			System.out.println("file not found-Please provide correct path");
			e.printStackTrace(); 
		}
		
	}
}
