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

public class TestNew3 {
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
	   
	   //goto search bar and pass the value as sofa.
	   //Thread.sleep(2000L);
	   driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//input[@id='search']")).sendKeys("sofa");
	   
	   //click on search icon
	   //Thread.sleep(2000L);
	   driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//button[@id='search_button']")).click();
	   
	   //click on a particular sofa item
	   //Thread.sleep(2000L);
	   driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//img[@title='Franco Sofa (Wine Italian Leather)']")).click();
	    System.out.println(driver.getCurrentUrl());
	    
	   //fetch the price from their.
	   //Thread.sleep(3000L);
	   driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	   String str=driver.findElement(By.xpath("//div[@class='right-components']//div[@itemprop='price']")).getText();
	   System.out.println(str);
	}
}
