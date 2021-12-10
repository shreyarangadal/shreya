import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class waitdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\shreya.rangadal\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		//driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		//addItems(driver,itemsNeeded);
		//Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		WebElement w1 = driver.findElement(By.xpath("//img[@alt='Cart']"));
	Actions a1= new Actions(driver);
	a1.moveToElement(w1).contextClick().build().perform();
	
	}
	/*public static  void addItems(WebDriver driver,String[] itemsNeeded)

	{

	int j=0;

	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

	for(int i=0;i<products.size();i++)
	{

	//Brocolli - 1 Kg

	//Brocolli,    1 kg

	String[] name=products.get(i).getText().split("-");

	String formattedName=name[0].trim();

	//format it to get actual vegetable name

	//convert array into array list for easy search

	//  check whether name you extracted is present in arrayList or not-

	List itemsNeededList = Arrays.asList(itemsNeeded);

	if(itemsNeededList.contains(formattedName))

	{

	j++;

	//click on Add to cart

	driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

	if(j==itemsNeeded.length)

	{

	break;

	}

	}

	}

	}*/
}
