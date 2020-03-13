package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rahulshettypractice {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrgun\\Work\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		 		
		WebElement ch1 =	driver.findElement(By.xpath("//*[@id=\'checkBoxOption1\']"));
		ch1.click();
		
		if (ch1.isSelected()) {
			System.out.println("true--chekbox1 is selected.");
		}
		else {
			System.out.println("chekbox1 is not selected.");
			
		}
			
		ch1.click();
		
		boolean b1 = ch1.isSelected();
		
		System.out.println("false--checkbox1 is not selected.");
		
		/*List <WebElement> chbox = driver.findElements(By.xpath("//parent::div[@id='checkbox-example']//input[@type='checkbox']"));
		
		chbox.size();
		System.out.println(chbox.size());
		
		for (int i= 0;i<= chbox.size();i++) {
				
			chbox.get(i).click();	
			
			}*/
			
		
		boolean b2 = driver.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
		
		System.out.println(b2);
		
		
        }
			
			
			
		
		
}


