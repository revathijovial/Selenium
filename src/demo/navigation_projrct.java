package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation_projrct {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\greva\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.flipkart.com/");
		
		String title = driver.getTitle();
	    System.out.println(title);
	    
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
	    
	    Thread.sleep(2000);
	    
	    driver.navigate().back();
	    
	    String title2 = driver.getTitle();
	    System.out.println(title2);
	    
	    String currentUrl2 = driver.getCurrentUrl();
	    System.out.println(currentUrl2);
	    
	    Thread.sleep(2000);
	    
	    driver.navigate().forward();
	    
	    Thread.sleep(2000);
	    
	    driver.navigate().to("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D1007809%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwtsCgBhDEARIsAE7RYh18YtkUSdyY8JbWprLbtmgaO1OJ9onTRr7tZx-HsnEqAXshP6GqYQAaAm63EALw_wcB");
	    
	    String title3 = driver.getTitle();
	    System.out.println(title3);
	    
	    String currentUrl3 = driver.getCurrentUrl();
	    System.out.println(currentUrl3);
	    
	    driver.navigate().refresh();
	    
		
	}

}
