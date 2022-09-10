package myProject;

import java.util.List;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class MyClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\aykurdi\\Desktop\\old data D\\backup-aya\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://127.0.0.1:5500/index.html");
		
	    List <WebElement> items = driver.findElements(By.cssSelector(".container td:nth-of-type(3)"));
	   
	    int sum=0;
	    for (int i=0 ; i < items.size() ; i++)
	    {
	    	
	    	Integer value = Integer.parseInt(items.get(i).getText());
	    	sum = sum + value;
	   
	    }
	    
	   // System.out.println("Total is: " + sum);
	   
	  
	System.out.println(
			driver.findElement(By.id("total")).
			getText().split(": ")[1].trim());
	}



}
