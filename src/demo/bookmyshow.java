package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bookmyshow {
	
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\greva\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.bookmyshow.com/explore/home/chennai");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[text()='Dada']")).click();
	    
		Thread.sleep(3000);

	    driver.findElement(By.xpath("(*//span[text()='Book tickets'])[1]")).click();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("(//a[@class='showtime-pill'])[6]")).click();
	    
	    Thread.sleep(3000);

	    driver.findElement(By.id("btnPopupAccept")).click();
	    
	    Thread.sleep(4000);

	    driver.findElement(By.id("proceed-Qty")).click();
	    
	    Thread.sleep(3000);
	    
	    //driver.findElement(By.xpath("//a[@class='_available _selected']")).click();
	    
	    


	    
	    
	    
	    
	    
	}
	

}
