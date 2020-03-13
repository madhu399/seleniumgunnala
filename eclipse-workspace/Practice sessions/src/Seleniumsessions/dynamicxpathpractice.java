package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dynamicxpathpractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrgun\\Work\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com");
		
		
		WebElement news = (driver.findElement(By.xpath("//div[@id='newsDropDown']")));
		news.click();
		
		Select s1 = new Select (news);
		s1.selectByIndex(4);
		
	//driver.findElement(By.xpath("//div[@id='newsDropDown']//nav[@class='cb-sub-navigation']//a[4]")).click();
		

	}

}
