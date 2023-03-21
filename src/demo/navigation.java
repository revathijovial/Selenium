package demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {
	
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\greva\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		
		Thread.sleep(2000);

		driver.navigate().back();
		
		Thread.sleep(2000);

	    driver.navigate().forward();
	    
	    String title = driver.getTitle();
	    
	    System.out.println(title);
	    
	    String url = driver.getCurrentUrl();
	    
	    System.out.println(url);
		
		
	}

}
