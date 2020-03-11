package Seleniumsessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class naveen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrgun\\Work\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		//dynamic wait ;making/asking selenium to wait for max 20 secs to load all elements in a page.
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		
		//implicitly wait means asking driver to wait for each element to load for max 20 secs.
		//for each element driver will wait max for 20 secs & move on.if it finds an element in 5 secs it will move on.
		
		//explicit wait  should not combine with implicit wait.
		//will write separate code for it.
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );//for each element to load in  page.
		
		
		
		
		
		driver.get("https://www.youtube.com/watch?v=j2dkdqfzY9Y&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=1");
		
		
		
		//WebElement l1 =	driver.findElement(By.xpath("//h4[@class='style-scope ytd-playlist-panel-video-renderer']//span"));
		//l1.getText();
		
		//System.out.println(l1.getText());
		
		List <WebElement> li = driver.findElements(By.xpath(
				"//h4[@class='style-scope ytd-playlist-panel-video-renderer']//span"));
		
		
		
				
		li.size();
		
		System.out.println(li.size());
		
		for (int i=0;i<li.size();i++) {
			
			System.out.println(li.get(i).getText());
		}
		
	}

}

