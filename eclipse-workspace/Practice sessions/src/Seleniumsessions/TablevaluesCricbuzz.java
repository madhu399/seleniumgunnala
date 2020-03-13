package Seleniumsessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablevaluesCricbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//C:\Users\mrgun\Downloads\chromedriver_win32// chrome driver path
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrgun\\Work\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/26592/pak-vs-ban-1st-test-bangladesh-tour-of-pakistan-2020");
				
		  WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		  
		  
		 // System.out.println(table.getText());
		  
		 // int rowcount = table.findElements(By.cssSelector("#innings_1 > div:nth-child(1) > div:nth-child(3)"));
		  
		  
		  
		int recount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-col-33']")).size();
		
		 //System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-col-33']")).get(rowcount);
		
			int count1 = table.findElements(By.cssSelector("//div[@id='innings_1']//div[1]//div[3]//div[3]")).size();	
		
	//		System.out.println(table.getText());
			
		for (int i=0;i<recount;i++) {
				
		System.out.println(table.findElements(By.cssSelector("//div[@id='innings_1']//div[1]//div[3]//div[3]")).get(i).getText());
			
		}
				
	
	}
			
		
		//driver.manage().window().maximize();
		
		
	}
