package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
  WebDriver driver;
 //after clicking on login enter email address
 By email=By.cssSelector("input[id='user_email']");
 By password = By.cssSelector("input[type='password']");
 By Login = By.cssSelector("input[value='Log In']");
 By forgotPassword = By.cssSelector("[href*='password']");
  
 //constructor
public LoginPage(WebDriver driver) {
	this.driver=driver;
}
//click on forgotpassword button
public ForgotPassword forgotpassword() {
	  driver.findElement(forgotPassword).click();
	  return new ForgotPassword(driver);
	   
}

//to enter email address
public WebElement getEmail() {
	  return driver.findElement(email);
  }

//to enter password
public WebElement getPassword() {
	  return driver.findElement(password);
}

//to click on login button
public WebElement getLogin() {
	  return driver.findElement(Login);
}

}
