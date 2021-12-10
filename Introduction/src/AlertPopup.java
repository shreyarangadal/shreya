import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopup {
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya.rangadal\\OneDrive - Accenture\\Documents\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://qaclickacademy.com/practice.php");
			driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();
			String opt = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
			//WebDriverWait w = new WebDriverWait(driver,5);
			WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
			Select s = new Select(dropdown);
			s.selectByVisibleText(opt);
			System.out.println(opt);
			
			driver.findElement(By.id("alertbtn")).click();
			String txt = driver.switchTo().alert().getText();
			System.out.println(txt);
			driver.switchTo().alert().accept();
		
			/*driver.findElement(By.id("travel-date")).click();
			driver.findElement(By.xpath(".//*[@id='travel_date']")).click();


			while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
			{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
			}


			List<WebElement> dates= driver.findElements(By.className("day"));
			//Grab common attribute//Put into list and iterate
			int count=driver.findElements(By.className("day")).size();

			for(int i=0;i<count;i++)
			{
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("21"))
			{
			driver.findElements(By.className("day")).get(i).click();
			break;
			}

			}*/
			}
}
