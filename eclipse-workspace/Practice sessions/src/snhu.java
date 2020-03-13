import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snhu {

	public static void main (String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//C:\Users\mrgun\Downloads\chromedriver_win32// chrome driver path
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrgun\\Work\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();

				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				driver.get("https://www.snhu.edu/program-finder");
				
				//driver.manage().window().fullscreen();
				
		   //getting count of all checkboxes in a webpage
		 
	      List <WebElement> ch	=  driver.findElements(By.cssSelector("input[type='checkbox']"));
	      ch.size();
		  System.out.println(ch.size());
		
		  
		
		  ////getting count of all individual set of checkboxes list in a webpage
		 /* List <WebElement> ch1 = driver.findElements(By.xpath("//input[contains(@id,'main_0_narrowa_0_uxDegreeLevel')]"));
		  ch1.size();
		  System.out.println(ch1.size());
		
		  for (WebElement checkbox:ch1 ) {
	        	 
		     	 
	        	 System.out.println(checkbox.getText());
	         }*/
		  
		  
		  
		  //to get 1 single text from selection
		   //WebElement text1 = driver.findElement(By.xpath("//label[contains(text(),'Select All Degree Levels')]"));
	   	  //System.out.println(text1.getText());
		
		
	   	//WebElement text2 = driver.findElement(By.xpath("//label[starts-with(text(),'Bachelo')]"));
	   	//text2.click();
	   	  
	   	  //System.out.println(text2.getText());
	   	  
		
		//IMP :to get all values in checkbox selection
	   	 
	   	  //driver.findElements(By.xpath("//div[@id='main_0_narrowa_0_uxFilter']//div//div[1]"));
	   	  
	   	  //create a List webelelmnt & call in for loop:
	   	List <WebElement> ch2 = driver.findElements(By.xpath("//span[contains(@id,'main_0_narrowa_0_uxDegreeLevel')]//label"));

	       

	       ch2.size();

	       System.out.println(ch2.size());

	       for (int i =0;i<=ch2.size();i++ ) {

	         ch2.get(i).click();
         }
         
        		 
        		 
        	 //System.out.println(checkbox.getText());
         }
		
         
                  
}
		  
	  
			  
	
        	 
         
      
        		
		
		

		
		
	


	


