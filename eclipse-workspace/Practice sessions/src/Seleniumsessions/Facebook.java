package Seleniumsessions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//C:\Users\mrgun\Downloads\chromedriver_win32// chrome driver path
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrgun\\Work\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		//dynamic wait ;making selenium wait for max 20 secs to load all elements in a page.
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		
		//implicitly wait means asking driver to wait for each element to load for max 20 secs.
		//for each element driver will wait max for 20 secs 7 move on.if it finds an element in 5 secs it will move on.
		//never combine implicit & explicit wait 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );//for each element to load in  page.
		
		
		driver.get("https://www.facebook.com/");
		
				
								
		//driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//*[@id=\'u_0_m\']")).sendKeys("drgj");
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("gunn");
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_r')]")).sendKeys("123@test.com");
		driver.findElement(By.xpath("//input[contains(@id,'u_0_w')]")).sendKeys("Blacky123");
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_u')]")).sendKeys("123@test.com");
		
		//select s new Select();//creating a new object select to keep all month variables 
		
		Select s = new Select(driver.findElement(By.id("month")));// keeping that web element in that object so we can select 
                                                           //any value from that object by objrefrence s.
		        
		//select method works only for static(fixed) drop downs
 		
		//s.selectByVisibleText("Nov");
		
		s.selectByValue("10");
		
		//s.selectByIndex(2);//
 		Select s1 = new Select(driver.findElement(By.id("day")));//creating diff object for each drop down ,s1 for day
 		Select s2 = new Select(driver.findElement(By.id("year")));//for year
 		s1.selectByIndex(2);
 		s2.selectByIndex(31);
 		//s.selectByValue("May");
 		
 		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
 		
 		driver.findElement(By.xpath("//input[@type='radio'][@value='1']")).click(); 
 		
 		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
 		
 		//driver.switchTo().alert().accept();
 		
 		driver.findElement(By.xpath("//button[@id='checkpointSubmitButton']")).click();
 		
 		//driver.switchTo().alert().accept();
 		
 		//driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
 		
 		//driver.findElement(By.xpath("))
 		//driver.switchTo().alert().accept();
 		
 		
 		
 		
 		  		
 				
			}

}
