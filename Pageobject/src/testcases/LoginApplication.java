package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepo.RediffLogin;

public class LoginApplication {

//@Test
	public static void main(String[] args) {	
//public void Login() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya.rangadal\\OneDrive - Accenture\\Documents\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	RediffLogin login = new RediffLogin(driver);
	login.Email().sendKeys("Hello");
	login.Password().sendKeys("hello");
	login.SignIn().click();
	
}

}
