package demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takescreenshort {
	
	public static void main(String[] args) throws IOException  {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\greva\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/maps/@21.125498,81.914063,5z");
	    
		driver.manage().window().maximize();
		
        TakesScreenshot s = (TakesScreenshot)driver;
		File f1 = s.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\greva\\eclipse-workspace\\Selenium\\img\\map.png");
	    FileHandler.copy(f1, f);
		
		
	}

}
