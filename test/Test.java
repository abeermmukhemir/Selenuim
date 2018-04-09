package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class Test {
	static WebDriver driver;

	@Before
	public void setUp() throws Exception{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abeer\\Downloads\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	
	@After
	public void teardown() throws Exception{
	//	driver.quit();
	}
	
	@org.junit.jupiter.api.Test
	public void test() {
	//	fail("Not yet implemented");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abeer\\Downloads\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("a_mukhemir_1997@hotmail.com");;
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("a12 a4 a1997");;
		driver.findElement(By.xpath("//*[@id=\"u_0_u\"]")).click();;
	}

}
