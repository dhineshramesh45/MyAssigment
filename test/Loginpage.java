package week2.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//class creation
public class Loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// launch the browser
		ChromeDriver driver=new ChromeDriver();
		//upload the url
		driver.get("https://www.saucedemo.com/v1/");
		//manage screen
		driver.manage().window().fullscreen();
		//wait to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//find the element in dom  id for user name
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//find the element in dom id for password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//find the element in dom id for login
		driver.findElement(By.id("login-button")).click();
		
		

	}

}
