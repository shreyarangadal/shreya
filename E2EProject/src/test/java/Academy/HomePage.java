package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	WebDriver driver;
	@BeforeTest
	 public void initialize() throws IOException {
		 driver=initializebrowser();
		 
	 }
	
@Test(dataProvider="getData")
public void basePageNavigation(String username,String password,String text) throws IOException, InterruptedException{
		//driver.get("http://qaclickacademy.com");
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		//l.getLogin().click(); this is called in the method itself for optimization
		LoginPage lp = l.getLogin();
		
		//LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getLogin().click();
		System.out.print(text);	
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		
		ForgotPassword fp = lp.forgotpassword();
		fp.getEmail().sendKeys("xxxx");
		fp.getsendmeInstruction().click();
		
}

//Parameterization using testNG
@DataProvider
public Object[][] getData() {
	//row is for how many different types of data should run
	//column stands for how many values per each test
	Object[][] data = new Object[2][3];//Multidimensional array
	
	data[0][0] ="nonrestricteduser@example.com";
	data[0][1]="123456";
	data[0][2]="nonrestricted user";
	
	data[1][0] ="restricteduser@example.com";
	data[1][1]="123456789";
	data[1][2]="restricted user";
	return data;
}
@AfterTest
public void teardown() {
	 driver.close();
}
}
