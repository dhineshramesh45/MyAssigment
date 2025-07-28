package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown3{

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.leafground.com/select.xhtml");

		WebElement automationTool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));// 30-1

		Select obj = new Select(automationTool);
		// obj.selectByIndex(0)
		// obj.selectByValue(null);
		// obj.selectByVisibleText(null);

		obj.selectByIndex(1);

		obj.selectByVisibleText("Playwright");

		driver.findElement(By.xpath("//label[@class='ui-selectonemenu-label ui-inputfield ui-corner-all']")).click();

		driver.findElement(By.xpath("//li[text()='Germany']")).click();

	}
}