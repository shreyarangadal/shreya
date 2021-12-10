package Academy;

import java.io.IOException;
//import org.apache.logging.log4j.*;
//import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class ValidateText extends base{
	//public static Logger log = LogManager.getLogger(base.class.getName());
	
	 WebDriver driver;
	 @BeforeTest
	 public void initialize() throws IOException {
		 driver=initializebrowser();
		 driver.get("http://qaclickacademy.com");
		 //log.info("driver is initialized");
	 }
	 @Test
		public void basePageNavigation() throws IOException, InterruptedException{

				//creating object of that class and invoke the methods of it
				LandingPage l = new LandingPage(driver);
				Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");	
		}
	 @AfterTest
	 public void teardown() {
		 driver.close();
	 }
		}