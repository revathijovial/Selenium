package demo;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class youtube {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\greva\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.youtube.com/");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		WebElement serch = driver.findElement(By.xpath("//input[@id=\"search\"]"));
		serch.sendKeys("ayyappan ramasamy interview");
		
		driver.findElement(By.id("search-icon-legacy")).click();
		
		//WebElement ayyapan = driver.findElement(By.xpath("(//a[@id='video-title'])[3]"));
		//js.executeScript("arguments[0].scrollIntoview();",ayyapan);
		
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,7000);");
		
		WebElement ayyapan = driver.findElement(By.xpath("(//a[@id='video-title'])[3]"));
		Actions as = new Actions (driver);
		as.contextClick(ayyapan).build().perform();
		as.click(ayyapan).build().perform();
		
		
		
		
		
		
		

		
		
		
	}

}
