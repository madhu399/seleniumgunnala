package Seleniumsessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readproperties {

	
	static WebDriver driver; //making driver object as static
	
	public static void main(String[] args) throws IOException {
		
		
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream(
				"/Users/mrgun/eclipse-workspace/Practice sessions/src/Seleniumsessions/config.properties");
		
		prop.load(ip);

		System.out.println(prop.getProperty("browsername"));
		
		String brwname = prop.getProperty("browsername");
		
		if (brwname.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrgun\\Work\\chromedriver.exe");
			 driver = new ChromeDriver(); //launch chrome
			 
		driver.get(prop.getProperty("url"));
			 
	driver.findElement(By.xpath(prop.getProperty("Fname_xpath"))).sendKeys(prop.getProperty("Firstname"));	
	driver.findElement(By.xpath(prop.getProperty("Lname_xpath"))).sendKeys(prop.getProperty("Lastname"));
			 
			 
	}

}
}