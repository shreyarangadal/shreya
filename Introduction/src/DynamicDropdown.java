import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya.rangadal\\OneDrive - Accenture\\Documents\\driver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		/*driver.get("https://spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		driver.findElement(By.xpath("(//a[@value='HBX'])[2]")).click();*/
		System.setProperty("webdriver.edge.driver", "C:\\Users\\shreya.rangadal\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		/*WebElement statdrop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s = new Select(statdrop);
		s.selectByIndex(3);
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByVisibleText("INR");
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByValue("AED");
		System.out.println(s.getFirstSelectedOption().getText());
		
		driver.findElement(By.cssSelector(".paxinfo")).click();
		Thread.sleep(5000);
		for(int i=0;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}*/
		//driver.get("https://spicejet.com");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector(".ui-menu-item"));
		for(WebElement option :options) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
				
			}
		}
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		//driver.findElement(By.cssSelector(".paxinfo")).click();
		
		
		
	}

}
