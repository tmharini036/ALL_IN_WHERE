package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class scrolldown {
	
WebDriver driver;
	
	@BeforeTest
	void open_browser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Harini T M/eclipse-workspace/daily/driver/chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(500);
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void test1() {
		
		driver.get("http://automationexercise.com");
		driver.findElement(By.linkText("/login"));
		driver.findElement(By.name("email")).sendKeys("tmharini036@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Harini2625");
		driver.findElement(By.className("btn btn-default")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath("//i[@class='fa fa-arrow-circle-o-right']")).click();
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,-250)", "");

}
}