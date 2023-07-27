package com.luma.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.luma.pageLayer.CartPage;
import com.luma.pageLayer.ConfirmationPage;
import com.luma.pageLayer.HomePage;
import com.luma.pageLayer.LoginPage;
import com.luma.pageLayer.ProductPage;
import com.luma.utilities.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;

	public static Logger logger;
	public HomePage home_obj;
	public ProductPage product_obj;
	public UtilClass util_obj;
	public CartPage cart_obj;
	public ConfirmationPage confirm_obj;
	public LoginPage login_obj;
	
	@BeforeClass
	public void start() {
		logger =  Logger.getLogger("Demoblaze Automation framework");
		PropertyConfigurator.configure("log4j.properties");
		logger.info("framework Execution Started");
	}
	@AfterClass
	public void stop() {
		 logger.info("framework execution stop");
	}
	
	@BeforeMethod
	public void setUp()
	{
		String br = "Edge";

		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please provide current browser name");
		}

		driver.get("https://demoblaze.com/index.html#");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		logger.info("Browser launch,maximize,waits");
		

		//--------------- Obj Creation ---------------
		home_obj = new HomePage();
		product_obj = new ProductPage();
		util_obj = new UtilClass();
		cart_obj = new CartPage();
		confirm_obj = new ConfirmationPage();
		login_obj = new LoginPage();
		logger.info("Object Creation");
	}

	@AfterMethod
	public void tearDown()
	{ 
		//		driver.quit();
		logger.info("browser close");
	}
 






}
