package Seleniumsessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snhu2 {

	public static void main(String[] args)throws InterruptedException {
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrgun\\Work\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS) ;

			driver.get("https://www.snhu.edu/program-finder");

			Thread.sleep(3000);

			List <WebElement> ch1 = driver.findElements(By.xpath("//*[@id='main_0_narrowa_0_uxDegreeLevel']//label"));      

			       ch1.size();

			       System.out.println(ch1.size());

			       for (int i =0;i<=ch1.size();i=i+2 ) {

			       String text = driver.findElements(By.xpath("//*[@id='main_0_narrowa_0_uxDegreeLevel']//label")).get(i).getText();

			       if(text.contains("Bachelor's")) {

			           ch1.get(i).click();
			           
			        break;

			       }

			    }

			}
		
		
}	
		
		
		

	


