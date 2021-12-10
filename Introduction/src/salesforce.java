import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya.rangadal\\OneDrive - Accenture\\Documents\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://login.salesforce.com");
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("This is my first code");
		//driver.findElement(By.cssSelector("input[type='email']")).sendKeys("This is my first code");
		//driver.findElement(By.name("pw")).sendKeys("123456");
		//driver.findElement(By.xpath("//*[@id=\'Login\']")).click(); 
		//System.out.println(driver.findElement(By.xpath("//*[@id=\'error\']")).getText());
		driver.get("https://rediff.com");
		//driver.findElement(By.xpath("a[@title='Already a user? Sign in']")).click();
		driver.findElement(By.className("signin")).click();
		//driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		//driver.findElement(By.xpath("input[@name='login']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input#login1")).sendKeys("hello");
		driver.findElement(By.cssSelector("input#password")).sendKeys("123456");
		//driver.findElement(By.xpath("input[@name='passwd']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[value='Sign in']")).click();
	}

}
