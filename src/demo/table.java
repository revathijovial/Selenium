package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {
	
	public static void main(String[] args)  {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\greva\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> head = driver.findElements(By.xpath("(//table)[1]/tbody/tr/th"));
		
	    
	    
	    for (WebElement allhead : head) {
	    	
	    	String text = allhead.getText();
	    	System.out.println(text);
	    
	    
	    	
			
		}
	    
	List<WebElement> body = driver.findElements(By.xpath("(//table)[1]/tbody/tr[3]/td"));
	
	for (WebElement alldbody : body) {
		String text1 = alldbody.getText();
		System.out.println(text1);
	
	}
	
	
	
	List<WebElement> row = driver.findElements(By.xpath("(//table)[1]/tbody/tr/td[4]"));
			
	for (WebElement thatrow : row) {
		String text2 = thatrow.getText();
		System.out.println(text2);
		
	}
		}
		
	}
	



