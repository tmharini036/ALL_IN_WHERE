package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Automationprjct {

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
		driver.findElement(By.name("name")).sendKeys("Harini",Keys.ENTER);
		driver.findElement(By.name("email")).sendKeys("tmharini036@gmail.com",Keys.ENTER);
		driver.findElement(By.className("btn btn-default")).click();
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("password")).sendKeys("Harini@2625",Keys.ENTER);
		driver.findElement(By.id("days")).sendKeys("26",Keys.ENTER);
		driver.findElement(By.id("months")).sendKeys("July",Keys.ENTER);
		driver.findElement(By.id("years")).sendKeys("1998",Keys.ENTER);
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.name("first_name")).sendKeys("Harini",Keys.ENTER);
		driver.findElement(By.id("last_name")).sendKeys("shashi",Keys.ENTER);
		driver.findElement(By.id("company")).sendKeys("wistron",Keys.ENTER);
		driver.findElement(By.id("address1")).sendKeys("thimmanayakanahalli",Keys.ENTER);
		driver.findElement(By.id("address2")).sendKeys("gaddobanahalli",Keys.ENTER);

		WebElement ele = driver.findElement(By.name("country"));
		
		Select select = new Select(ele);
		
		select.selectByValue("India");
		
		driver.findElement(By.name("country")).click();	
		driver.findElement(By.id("state")).sendKeys("karnataka",Keys.ENTER);
		driver.findElement(By.id("city")).sendKeys("tumkur",Keys.ENTER);
		driver.findElement(By.id("zipcode")).sendKeys("572101",Keys.ENTER);
		driver.findElement(By.id("mobile_number")).sendKeys("7833563280",Keys.ENTER);
		driver.findElement(By.className("btn btn-default")).click();
		
	

}
}
