package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\greva\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("alertbox")).click();
		Thread.sleep(2000);
        driver.switchTo().alert().accept();
        
        driver.findElement(By.xpath("//button[text()='Confirm Alert Box']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        
        driver.findElement(By.xpath("//button[@onclick='myFunctionThree()']")).click();
        Thread.sleep(2000);
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
        driver.switchTo().alert().sendKeys("yes");
        driver.switchTo().alert().accept();
        

        
        
		
	}
}
