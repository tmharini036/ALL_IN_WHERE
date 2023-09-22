package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class cartafterlogin {
	
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
		driver.findElement(By.id("search_product")).sendKeys("women");
		driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
		driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart')[1]]")).click();
		driver.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'])[3]")).click();
		driver.findElement(By.xpath("//a[@href='/view_cart'][1]")).click();
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.xpath("//a[@href='/view_cart'][1]")).click();
		
		

}
}