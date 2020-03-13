import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expilcitwait {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrgun\\Work\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
				
		//dynamic wait ;1.Pageloadtimeout:making selenium wait for max 20 secs to load the page.
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		
		
		
		driver.get("https://www.facebook.com/");
		clickon(driver,driver.findElement(By.xpath("//input[@value='Log In']")),20);

	}
	
	  //never combine implicit & explicit wait
     //creating a new method clickon for Explicit wait outsideof main method.
	 //WebDriverWait is a class avialable in selenium & we r creating an object new WebDriverWait(driver,timeout).it takes 2  parameters.
	 //&ignore stale element exception until expected condition met i.e elementToBeClickable with that locator
	// u will pass locator values 
	//in ExpectedConditions there r somany diff actions avilable based on ur element type ex;button,links(clickble),ex:dropdowns(may be selectedoption)
	
	public static void clickon(WebDriver driver,WebElement locator,int timeout) {
	new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class)
	.until(ExpectedConditions.elementToBeClickable(locator));
	locator.click();
		
	}
	
	
	
	
}
