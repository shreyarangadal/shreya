import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya.rangadal\\OneDrive - Accenture\\Documents\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://google.com");
		//System.out.println(driver.getTitle());//Validate the header title of the webpage
		//System.out.println(driver.getCurrentUrl());//Validate the url which is landed 
		//driver.navigate().to("http://yahoo.com");//navigate to different url
		//driver.navigate().back();//navigate back or click on back from the current webpage
		//driver.navigate().forward();
		driver.get("https://facebook.com");
		//driver.findElement(By.id("email")).sendKeys("This is my first code");
		//driver.findElement(By.id("pass")).sendKeys("123456");
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.close();//It closes the current browser
		//driver.quit();//It closes all the browsers opened by selenium script
		driver.findElement(By.cssSelector("#email")).sendKeys("emailid");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\'u_0_a_Iw\']/div[3]/a")).click();
	}

}
