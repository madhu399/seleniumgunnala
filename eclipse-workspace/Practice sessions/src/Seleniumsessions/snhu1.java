package Seleniumsessions;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snhu1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrgun\\Work\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS) ;
		
		driver.get("https://www.snhu.edu/program-finder");
		
		
		//List <WebElement> ch1 = driver.findElements(By.xpath("//input[contains(@id,'main_0_narrowa_0_uxDegreeLevel')]"));
	   	  
		/*WebElement text2 = driver.findElement(By.xpath("//label[starts-with(text(),'Master')]"));
	  	text2.click();
	   	
	   System.out.println(text2.getText());*/
		
				
	   	  //create a List webelelmnt & call in for loop:
	   
	  /* List <WebElement> ch1 = driver.findElements(By.xpath("//div[@class='checkbox-group'][1]"));
       
		  ch1.size();   
		  System.out.println(ch1.size());
		  
	      for (WebElement checkbox:ch1 ) {
      	 
	     	 
      	 System.out.println(checkbox.getText());
       }*/
	  
		/*WebElement text2 = driver.findElement(By.xpath("//label[starts-with(text(),'Bachelo')]"));
	   	text2.click();
	   	WebElement text3 = driver.findElement(By.xpath("//label[starts-with(text(),'Master')]"));
	    text3.click();
		
	    WebElement text4 = driver.findElement(By.xpath("//label[starts-with(text(),'Online')]"));
	   	text4.click();*/
		
		
			     
		List <WebElement> ch2 = driver.findElements(By.xpath("//*[@id='main_0_narrowa_0_uxDegreeLevel']//label"));
	    
	     
	     	for (int i = 0;i<ch2.size();i=i+2) {
	     		ch2.get(i).click();
	     		System.out.println(ch2.get(i).getText());	
	     		//
	     		//ch2.get(i).getScreenshotAs(OutputType<img>madhavi);
	     		//driver.getScreenshotAs(");
	     		
	     	// Now you can do whatever you need to do with it, for example copy somewhere
	     	
	     		//FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));	
	     		//Random rm = new Random(); 
	     			     		
	      //String text = driver.findElements(By.xpath("//*[@id='main_0_narrowa_0_uxDegreeLevel']//label")).get(i).getText();
   		
	     	
	      //System.out.println(text);
			//if (text.contains("Master's")) {
				//ch2.get(i).click();
				//break;
			}
		
		
		
      	    }
		
	}
//}

	

