package Seleniumsessions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class popuptest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrgun\\Work\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi/");
		//driver.wait(5000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("proceed")).click();
		
		//Thread.sleep(5000);
		
		driver.switchTo().alert();  // switching to popup alert window
		
		Alert alert = driver.switchTo().alert();  // store this window in Alert class & alert obj refe
		
		alert.getText();
		
		System.out.println(alert.getText());
		
		String almsg = alert.getText();
		
		if (almsg.equals("Please enter a valid user name")) {
			System.out.println("correct msg...test pass");
			 
		}
            
		else {
			System.out.println("in-correct msg..test fail");
		}

		
		
		
	}

}
