package SeleniumTesting.Assessment;

import java.awt.Desktop.Action;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestNew2 {
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

	   //click on wishlist icon image
	   //Thread.sleep(2000L);
	   driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	   driver.findElement(By.className("header-icon")).click();
	   
	   //give the email id there
	   //Thread.sleep(2000L);
	   driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//input[@type='email']")).sendKeys("xyz@random.com");

	   //give the password there the password length is seven 
	   //Thread.sleep(2000L);
	   driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("xyz@123");
	   
	   //click on sign up button here
	   //Thread.sleep(2000L);
	   driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//input[@value='Sign Up']")).click();
	   
	   //error msg find.
	   //Thread.sleep(2000L);
	   driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	   String str=driver.findElement(By.xpath("//label[@class='error']")).getText();
	     
	 //error msg print.
	   System.out.println(str);
	}
}
