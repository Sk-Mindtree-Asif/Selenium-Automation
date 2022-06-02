package SeleniumTesting.Assessment;

import java.awt.Desktop.Action;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class TestNew1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindsdet302\\Downloads\\MychromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//hit the url of google.com.
		driver.get("http://google.com");
		
		//vaidate the title page is corrrect
	    System.out.println(driver.getTitle());
	    
	   //validate to landed on current url.
	    System.out.println(driver.getCurrentUrl());
	   
	    //navigate to urbanladder.com
	   driver.navigate().to("https://www.urbanladder.com/");
	   
	   Actions a=new Actions(driver);
	   
	   //click on track order icon
	   Thread.sleep(2000L);
	   driver.findElement(By.xpath("//a[@title='Track Order']")).click();
	  
	   //send the order number here
	   Thread.sleep(2000L);
	   driver.findElement(By.xpath("//input[@placeholder='Order Number']")).sendKeys("432876590");

	   //send the phone number here
	   Thread.sleep(2000L);
	   driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9002012345");
	   
	   //press on the sign up the button
	   Thread.sleep(2000L);
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	   Thread.sleep(2000L);
	   String str=driver.findElement(By.className("_33bg3")).getText();
	   
	   System.out.println(str);
	}

}
