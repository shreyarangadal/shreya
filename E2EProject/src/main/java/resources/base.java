package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class base {
	
	protected WebDriver driver;
	public Properties prop;
	public WebDriver initializebrowser() throws IOException {
		prop = new Properties();
		//once the properties object is created it goes and gets the file data properties file
		//changing from hardcoded path to dynamic path of file location
		//FileInputStream fis =new FileInputStream("C:\\Users\\shreya.rangadal\\eclipse-workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
		FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		//this doesn't have knowledge of the property file to connect to that
        //here it loads the file
		prop.load(fis);
		String browserName = prop.getProperty("browser");//browser detail will be available in the properties file
	    //if(browserName =="chrome") { to fetch the value from an object equals keyword is used
		/*if(browserName.equals("chrome")){
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya.rangadal\\OneDrive - Accenture\\Documents\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			
	    }*/
		if(browserName.contains("chrome")){
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shreya.rangadal\\OneDrive - Accenture\\Documents\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		if(browserName.contains("headless")){
		options.addArguments("headless");
		}
    	driver = new ChromeDriver(options);
		
		}
	    else if(browserName.equals("firefox")){
	    	
	    }
	    else if(browserName.equals("IE")){
	    	
	    }
      else if(browserName.equals("Edge")){
    	  System.setProperty("webdriver.edge.driver", "C:\\Users\\shreya.rangadal\\Downloads\\edgedriver_win64\\msedgedriver.exe");
 		 driver = new EdgeDriver();
	    }
		
	   //implicit wait applied for the whole project
		//if the driver object code is not executed then this driver will not have life then it will throw a null pointer exception
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  return driver;
	}

	
	public String getScreenShotPath(String testcasename,WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File fs = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testcasename+".png";
		FileUtils.copyFile(fs,new File(destinationFile));
		return destinationFile;
	}

}
