package objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLogin {

	WebDriver driver;
	
	public RediffLogin(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By username = By.id("login1");
	By password = By.name("passwd");
	By Sigin = By.name("proceed");
	
	
	public WebElement Email() {
		return driver.findElement(username);
	}
	
	public WebElement Password() {
		return driver.findElement(password);
	}
	
	public WebElement SignIn() {
		return driver.findElement(Sigin);
	}
	
}
