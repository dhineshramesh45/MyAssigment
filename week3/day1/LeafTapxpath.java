package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class LeafTapxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// enter the username by using Attribute base xpath
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("demoSalesmanager");
		//enter password by using Attribute based xpath
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//login by using Attribute based xpath
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		// partial text based xpath
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		 //  text based xpath
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.close();
	}
}
