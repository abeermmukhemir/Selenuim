package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class TestFacebook {
	static WebDriver driver;
//comment
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abeer\\Downloads\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).sendKeys("MyName");
		Select sel=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		sel.selectByIndex(3);
		driver.findElement(By.xpath("//*[@id=\"u_0_p\"]")).click();

	}

}
