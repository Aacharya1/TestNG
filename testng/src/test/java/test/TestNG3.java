package test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNG3 {
	WebDriver driver;
	
	@BeforeMethod

	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//WebDriver
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/101/");
	}

	@Test

	public void allMonthAreAbleToSee() throws InterruptedException {
				driver.findElement(By.xpath("//select[@name='due_month']")).click();
				Thread.sleep(3000);
		WebElement listofallmonth =driver.findElement(By.xpath("//select[@name='due_month']/descendant::option[contains(text(),'None')]"));
				listofallmonth.click();
		boolean all_the_month= listofallmonth.isDisplayed();
		Assert.assertTrue("All the month arenot displayed in dropdown list", all_the_month);

//		@AfterMethod
//		public void close {
//		driver.close();
//		driver.quit();
//		}
	
//	private void close() {
//			}

}}
