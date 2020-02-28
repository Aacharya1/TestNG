package test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@Test
	public void userIsAbleToAddCategory(){
		
		//Random rnd = new Random();
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/101/");
		
		WebElement ADD_CATAGORY= driver.findElement(By.xpath("//input[@name='categorydata']"));
		
		ADD_CATAGORY.sendKeys("abc");  //+ rnd.nextInt(999)
		
				driver.findElement(By.xpath("//input[@value='Add category']")).click();
		
				//driver.close();
				//driver.quit();
				
				
	}
	
	
	
	

}
