package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmXpath{

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// Attribute based xpath
		 WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		 username.sendKeys("Admin");
		 //partial attribute based xpath
		 driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')]")).sendKeys("admin123");
		 
		 Thread.sleep(2000);
		 //Textbased xpath
		 driver.findElement(By.xpath("//button[text()=' Login ']")).click();
			String title = driver.getTitle();

			System.out.println(title);
			if (title.contains("Orange")) {
				System.out.println("verified");

			}

			String url = driver.getCurrentUrl();

			System.out.println(url);
			
			
			driver.quit();

		 
		 
	}
}
