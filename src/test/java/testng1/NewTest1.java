

package testng1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTest1 {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.xpath("//*[@name='uname']")).sendKeys("admin");
	    driver.findElement(By.xpath("//*[@name='psw']")).sendKeys("pass");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "E:\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://ec2-18-191-91-179.us-east-2.compute.amazonaws.com:8090/TestWebapp/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(10000);
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
  }

}
