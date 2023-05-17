package Innomate;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class automate {
	WebDriver driver;
	  @BeforeTest
	  public void beforeTest() {
		  driver=new ChromeDriver();
		driver.manage().window().maximize();
		  System.out.println("Browser open sucessfully");
		  
	  }
//locate by id
	  //locate by name
	  //locate by css selector
	  //locate by xpath
  @Test(enabled=false)
  public void Login () {
	  driver.get("http://10.21.21.210/Innomate_UBL/");
	  driver.findElement(By.id("UserID")).sendKeys("admin");
	  driver.findElement(By.id("Password")).sendKeys("admin");
	  driver.findElement(By.id("TestLogin")).click();
	  driver.findElement(By.id("endSession")).click();
	  System.out.println("login successfully");
	  
	  
	  
	  
	  
  }
@Test(enabled= false)
public void Monitoring() {
	
	driver.findElement(By.linkText("Monitoring")).click();
}

  @AfterTest
  public void afterTest() {
	  driver.quit();
	  System.out.println("Browser close");
	 
  }

}
