import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindowHandle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya.rangadal\\OneDrive - Accenture\\Documents\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://way2automation.com/demo.html");	
	//WebDriverWait w= new WebDriverWait(driver,4);
	//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("div[@class='meshim_widget_widgets_IconFont icon_font close'")));
	
	//driver.manage.i(driver,5);
	//List<WebElement> s = driver.findElements(By.xpath("//div[@class='linkbox margin-bottom-20']//h1[@class='heading']']"));
	List<WebElement> s = driver.findElements(By.xpath("//div[@class='linkbox margin-bottom-20']/h1"));
	List<WebElement> t= driver.findElements(By.xpath("//div[@class='linkbox margin-bottom-20']/h1/following-sibling::ul/li"));
	//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

	for(int i=0;i<s.size();i++){		
		String S1 = s.get(i).getText();		
		//driver.findElements(By.xpath("h1[@class='heading']/following-sibling::ul/li"));
		System.out.println(t.get(i).getText());		
		//List<String> count = s.stream().filter(t->t.getText().contains(S1)).map(t->getcount(t)).collect(Collectors.toList());
		//System.out.println(count);		
	}			
	//div[@class='linkbox margin-bottom-20']/h1/following-sibling::ul/li
	}	
	//public static String getcount(WebElement s) {	
	//	System.out.println(s);
	///	return ((WebElement) s.findElements((By.xpath("following-sibling::ul/li")))).getText();		
	//}
}
