package demo;

//import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hotelproject {
	
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\greva\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
//		WebElement data1 = driver.findElement(By.xpath("//a[text()='New User Register Here']"));		 
//		data1.click();
//		
//		WebElement data2 = driver.findElement(By.name("username"));
//		data2.sendKeys("Revathijovi");
//		
//		WebElement data3 = driver.findElement(By.id("password"));
//		data3.sendKeys("Revathi@27");
//		
//		Thread.sleep(1000);
//		
//		WebElement data4 = driver.findElement(By.xpath("(//input[@class='reg_input'])[3]"));
//		data4.sendKeys("Revathi@27");
//		
//		WebElement data5 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		data5.sendKeys("Revathi gurusamy");
//		
//		WebElement data6 = driver.findElement(By.xpath("(//input[@class='reg_input'])[5]"));
//		data6.sendKeys("revathijovial27@gmail.com");
//		
//		String str = JOptionPane.showInputDialog("enter your capcha");
//		WebElement data7 = driver.findElement(By.name("captcha"));
//		data7.click();
//		data7.sendKeys(str);
//		
//		WebElement data8 = driver.findElement(By.xpath("//input[@type='checkbox']"));
//		data8.click();
//		
//		WebElement data9 = driver.findElement(By.xpath("//input[@value='Register']"));
//		data9.click();
		
		WebElement data10 = driver.findElement(By.xpath("//input[@type='text']"));
		data10.sendKeys("Revathijovi");
		
		WebElement data11 = driver.findElement(By.xpath("(//input[@class='login_input'])[2]"));
	    data11.sendKeys("Revathi@27");
	    
	    WebElement data12 = driver.findElement(By.xpath("//input[@type='Submit']"));
		data12.click();
		
		WebElement data13 = driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]"));
		Select drop1 = new Select (data13);
		drop1.selectByIndex(2);
		
		WebElement data14 = driver.findElement(By.id("hotels"));
		Select drop2 =  new Select(data14);
		drop2.selectByValue("Hotel Sunshine");
		
		WebElement data15 = driver.findElement(By.name("room_type"));
		Select drop3 = new Select (data15);
		drop3.selectByVisibleText("Super Deluxe");
		
		WebElement data16 = driver.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
		Select drop4 = new Select (data16);
		drop4.selectByValue("3");
		
		WebElement data17 = driver.findElement(By.name("datepick_in"));
		data17.sendKeys("16/03/2023");
		
		WebElement data18 = driver.findElement(By.id("datepick_out"));
		data18.sendKeys("19/03/2023");
		
		WebElement data19 = driver.findElement(By.xpath("(//select[@class='search_combobox'])[5]"));
	    Select drop5 = new Select (data19);
	    drop5.selectByValue("2");
	    
	    WebElement data20 = driver.findElement(By.name("child_room"));
	    Select drop6 = new Select (data20);
	    drop6.selectByVisibleText("0 - None");
	    
	    WebElement data21 = driver.findElement(By.xpath("//input[@type='submit']"));
	    data21.click();
	    
	    WebElement data22 = driver.findElement(By.xpath("//input[@type='radio']"));
	    data22.click();
	    
	    WebElement data23 = driver.findElement(By.name("continue"));
	    data23.click();
	    
	    WebElement data24 = driver.findElement(By.name("first_name"));
	    data24.sendKeys("revathi");
	    
	    WebElement data25 = driver.findElement(By.id("last_name"));
	    data25.sendKeys("jovial");
	    
	    WebElement data26 = driver.findElement(By.name("address"));
	    data26.sendKeys("10/13 varaganery,agraharam,trichy-8");
	    
	    Thread.sleep(2000);
	   WebElement data27 = driver.findElement(By.id("cc_num"));
	   data27.sendKeys("1234567890123456");
	    
	    WebElement data28 = driver.findElement(By.name("cc_type"));
	    Select drop7 = new Select (data28);
	    drop7.selectByVisibleText("VISA");
	    
	    WebElement data29 = driver.findElement(By.name("cc_exp_month"));
	    Select drop8 = new Select(data29);
	    drop8.selectByValue("2");
	    
	    WebElement data30 = driver.findElement(By.id("cc_exp_year"));
	    Select drop9 = new Select(data30);
	    drop9.selectByVisibleText("2022");
	    
	    WebElement data31 = driver.findElement(By.name("cc_cvv"));
	    data31.sendKeys("2567");
	    
	    WebElement data32 = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
	    data32.click();
	 
	   
	    
	}

}
