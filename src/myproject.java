import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myproject {
	WebDriver driver = new ChromeDriver();
	String url = "http://www.demo.guru99.com/V4/";

	@BeforeTest
	public void mystub() {
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void login() {

		WebElement UserID = driver.findElement(By.name("uid"));
		UserID.sendKeys("mngr596171");
		WebElement Password = driver.findElement(By.name("password"));
		Password.sendKeys("sErasUb");
		driver.findElement(By.name("btnLogin")).click();
		String expectedTitle = "Guru99 Bank Manager HomePage";
		String actualTitle = driver.getTitle();
		 Assert.assertEquals(actualTitle, expectedTitle);
		

	}
}
