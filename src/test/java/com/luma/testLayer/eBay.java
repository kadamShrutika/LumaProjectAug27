package com.luma.testLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class eBay {
  @Test
  public void ebayTest() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().deleteAllCookies();
	  Thread.sleep(2000);
	  driver.close();
	  
  }
}
