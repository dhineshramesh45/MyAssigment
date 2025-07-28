package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindallLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		List<WebElement> elements=driver.findElements(By.xpath("//a"));
		for(int i=0;i<elements.size();i++) {
			System.out.println(elements.get(i).getText());
		}
		System.out.println("Total number of links: " + elements.size());

		driver.quit();
	}

}
