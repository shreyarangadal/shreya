import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya.rangadal\\OneDrive - Accenture\\Documents\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
	driver.findElement(By.cssSelector(".blinkingText")).click();
	Set<String> windows= driver.getWindowHandles();
	Iterator<String> It = windows.iterator();
	String parentId = It.next();
	String childId = It.next();
	driver.switchTo().window(childId);
	System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0]);
    String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
    System.out.println(emailId);
	
	driver.switchTo().window(parentId);driver.findElement(By.xpath("//img[@alt='Cart']")).click();
	driver.findElement(By.id("username")).sendKeys(emailId);
	}

}
