package com.luma.testLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class meesho {
  @Test
	  public void EC_123_meshoo() throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.meesho.com/");
		  driver.manage().deleteAllCookies();
		  Thread.sleep(2000);
		  driver.close();
  }
}
 