package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LanuchBrowser {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String s=driver.getTitle();
		System.out.println(s);
		if(s.contains("HRM")) {
			System.out.println("Title verified");
		}
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		System.out.println("Title After login:"+driver.getTitle());
		Thread.sleep(3000); // OR use WebDriverWait for better control

		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Admin");

		// 2. Wait a moment for suggestions to appear
		Thread.sleep(2000); // Can be replaced with explicit wait if needed

		// 3. Click the matching Performance link from suggestions
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		Thread.sleep(2000); // Wait for the form to appear

		// 4. Optional: Print current URL or title to confirm redirection
		System.out.println("Redirected to: " + driver.getCurrentUrl());
		
	
		}

}
