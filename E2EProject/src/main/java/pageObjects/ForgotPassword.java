package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
  WebDriver driver;
 //after clicking on login enter email address
 By email=By.cssSelector("input[id='user_email']");
 By sendmeInstruction = By.cssSelector("input[type='submit']");

  
 //constructor
public ForgotPassword(WebDriver driver) {
	this.driver=driver;
}

public WebElement getEmail() {
	  return driver.findElement(email);
  }
public WebElement getsendmeInstruction() {
	  return driver.findElement(sendmeInstruction);
}

}
