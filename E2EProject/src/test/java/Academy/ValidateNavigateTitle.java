package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class ValidateNavigateTitle extends base{
	 WebDriver driver;
	 @BeforeTest
	 public void initialize() throws IOException {
		 driver=initializebrowser();
		 driver.get("http://qaclickacademy.com");
	 }
	 
	 @Test
		public void basePageNavigation(){
				//creating object of that class and invoke the methods of it
				LandingPage l = new LandingPage(driver);
				Assert.assertTrue(l.getNavTitle().isDisplayed());//isdispalyed method return boolean values true or false
		}		
	 
	 @AfterTest
	 public void teardown() {
		 driver.close();
	 }

}