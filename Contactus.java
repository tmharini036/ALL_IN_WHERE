package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Contactus {
	
WebDriver driver;
	
	@BeforeTest
	void open_browser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Harini T M/eclipse-workspace/daily/driver/chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(500);
		driver.manage().window().maximize();
	}
	
	@SuppressWarnings("null")
	@Test
	public void test1() {
		
		driver.get("http://automationexercise.com");
		driver.findElement(By.linkText("/login"));
		driver.findElement(By.name("email")).sendKeys("tmharini036@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Harini2625");
		driver.findElement(By.className("btn btn-default")).click();
		driver.findElement(By.linkText("Contact_US")).click();
		driver.findElement(By.className("form-control")).sendKeys("shashi",Keys.ENTER);
		driver.findElement(By.className("form-control")).sendKeys("i want a leave",Keys.ENTER);
		driver.findElement(By.className("form-control")).sendKeys("ganigowda@123",Keys.ENTER);
		driver.findElement(By.id("message")).sendKeys("hai",Keys.ENTER);
		WebElement browse = null;
		browse.sendKeys("C:/Users/Harini/Desktop/Files/Harini.txt"); 
		   System.out.println("File is Uploaded Successfully");
		driver.findElement(By.name("submit")).click();   
		
	}

}
