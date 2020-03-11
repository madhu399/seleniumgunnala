package Seleniumsessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cleartrip {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrgun\\Work\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		//dynamic wait ;
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );//for each element to load in  page.
		
		
		driver.get("https://www.cleartrip.com");
		
		driver.manage().window().fullscreen();
		
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//i[@class='icon ir datePicker']")).click();
		
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ']")).click();
		
		Select s1 = new Select (driver.findElement(By.xpath("//select[@id='Adults']")));
		
		Select s2 = new Select (driver.findElement(By.xpath("//select[@id='Childrens']")));
		
		
		   s1.selectByIndex(1);
		   s2.selectByIndex(2);
		   
		   driver.findElement(By.xpath(" //a[@id='MoreOptionsLink']")).click();
		   
	    Select s3 = new Select (driver.findElement(By.xpath("//select[@id='Class']")));
		 
	       s3.selectByIndex(1);
		
	       
	       driver.findElement(By.xpath("//input[@name='airline']")).sendKeys("SpiceJet (SG)");
	       
	       driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
	      
	    		   
	      //driver.findElement(By.xpath("//input[@name='airline']")).sendKeys("SpiceJet (SG)");
	       
	       driver.findElement(By.xpath("//div[@class='closeit']")).click();
	       	       
	       String text = driver.findElement(By.xpath("//div[@id='homeErrorMessage']")).getText();
	       
	       System.out.println(text);
	       
	      Alert alert = driver.switchTo().alert();
	      
	      String b = alert.getText();
	      
	      System.out.println(b);
	      
	     //div[@class='closeit']
	       
	      // driver.
		 //a[@id='MoreOptionsLink']
		  
		 //select[@id='Class']
		   
		 //input[contains(text(),'Preferred Airline')]
		   
		   
		
	
	}

}
