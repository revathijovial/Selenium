package demo;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\greva\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
       // driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
        
        WebElement single = driver.findElement(By.id("singleframe"));
        driver.switchTo().frame(single);
        
        WebElement data = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        data.sendKeys("Hai this is revathi");
        
        driver.switchTo().defaultContent();
        
        driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
        
        driver.switchTo().frame(1);
        driver.switchTo().frame(0);
        
//        WebElement frame1 = driver.findElement(By.xpath("//div[@class='container iframes-page-container']"));
//        driver.switchTo().frame("frame1");
//        
//        WebElement frame2 = driver.findElement(By.xpath("(//div[@class='container'])"));
//        driver.switchTo().frame(frame2);
        
        WebElement data2 = driver.findElement(By.xpath("(//input[@type='text'])"));
        data2.sendKeys("oiiiii get out");
        
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        
        driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[2]")).click();
        
        
	}

}
