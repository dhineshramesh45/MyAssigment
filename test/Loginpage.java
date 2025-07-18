package week2.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//class creation
public class Loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialize Chrome browser instance

		ChromeDriver driver=new ChromeDriver();
		// Navigate to the application URL
		driver.get("https://www.saucedemo.com/v1/");
		// Set implicit wait timeout for locating elements
		driver.manage().window().fullscreen();
		// Set implicit wait timeout for locating elements

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Enter username using element identified by ID
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		// Enter password using element identified by ID
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		// Click the login button identified by ID
		driver.findElement(By.id("login-button")).click();
		
		

	}

}
