package SeleniumPractice;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class sel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya.rangadal\\OneDrive - Accenture\\Documents\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click on column to sort the data
		/*
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//capture all webelements into list
		List<WebElement> elementList= driver.findElements(By.xpath("//tr/td[1]"));
		
		//capture text of all elements into new (original)list
		List<String> originList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort the original list
		List<String> sortedList = originList.stream().sorted().collect(Collectors.toList());		
		Assert.assertTrue(originList.equals(sortedList));
		
		//scan the column name with gettext ->Beans print the price
		//List<String> price  = elementList.stream().filter(s->s.getText().contains("Rice")).map(s->getVeggiePrice(s)).
		//		collect(Collectors.toList());
		//System.out.println(price);//this will print in list[67]
		List<String> price;
		//price.forEach(a->System.out.println(a));//67
		do {
			List<WebElement> pages= driver.findElements(By.xpath("//tr/td[1]"));
			 price  = pages.stream().filter(s->s.getText().contains("Rice")).map(s->getVeggiePrice(s)).
					collect(Collectors.toList());
			 
				price.forEach(a->System.out.println(a));
				if(price.size()<1) {
					driver.findElement(By.cssSelector("[aria-label='Next']")).click();
				}
		}while(price.size()<1);
		
		
	}
	public static String getVeggiePrice(WebElement s) {
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}
	*/
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> veggies= driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> filteredList = veggies.stream().filter(a->a.getText().contains("Rice")).collect(Collectors.toList());
		Assert.assertEquals(veggies.size(), filteredList.size());
		
		
	}
}
