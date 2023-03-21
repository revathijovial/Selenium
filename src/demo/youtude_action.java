package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class youtude_action {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\greva\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	    driver.get("https://www.youtube.com/ ");
	    
		Robot rod = new Robot();
		Actions act = new Actions (driver);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		
		Thread.sleep(2000);
	    
		WebElement serch = driver.findElement(By.xpath("//input[@id=\"search\"]"));
		serch.sendKeys("ayyappan ramasamy issue");
		rod.keyPress(KeyEvent.VK_ENTER);
		rod.keyRelease(KeyEvent.VK_ENTER);
	    
		
		js.executeScript("window.scrollBy(0,7000);");
		
		Thread.sleep(2000);
		
		WebElement go = driver.findElement(By.xpath("(//a[@id='video-title'])[4]"));
		act.contextClick(go).build().perform();
		
		
		rod.keyPress(KeyEvent.VK_DOWN);
		rod.keyRelease(KeyEvent.VK_DOWN);
		rod.keyPress(KeyEvent.VK_ENTER);
		rod.keyRelease(KeyEvent.VK_ENTER);
		
     		
		
		
		
		    
			
		}
		
	}


