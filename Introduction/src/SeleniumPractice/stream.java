package SeleniumPractice;
import java.util.ArrayList;
import java.util.stream.Stream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stream {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya.rangadal\\OneDrive - Accenture\\Documents\\driver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");		
		//ArrayList<String> name=new ArrayList<String>();
		/*
		name.add("Shreya");
		name.add("Adam");
		name.add("Andrea");
		name.add("Annum");
		int count=0;
		for(int i=0;i<name.size();i++) {
			String actual = name.get(i);
			if(actual.startsWith("A")) {
				count++;				
			}
		}
		
		System.out.println(count);*/
		
		//long c = name.stream().filter(s->s.startsWith("A")).count();
	//	System.out.println(c);
		
		long d=Stream.of("Andam","crytal","nivi","").filter(c->
		{
			c.startsWith("A");		
			return true;			
		}).count();
		System.out.println();
		
		Stream.of("Andam","crytalla","nivi","").filter(c->c.length()>4).forEach(c->System.out.println(c));
		
	}

}
