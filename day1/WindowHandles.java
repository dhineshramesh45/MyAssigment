package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		 driver.findElement(By.xpath("//span[text()='Open']")).click();
		 // to handle more than one window use driver.getwindowhandles()
		 Set<String> windowhandle=driver.getWindowHandles();
		 List<String> windowlist=new ArrayList<String>(windowhandle);
		 driver.switchTo().window(windowlist.get(1));
		 String newwindowurl = driver.getCurrentUrl();
		 System.out.println("New URL of main window: " +newwindowurl );
		 String text=driver.findElement(By.xpath("//div[text()='Office Walk-ins']")).getText();
		 System.out.println("Text from new window:"+text);
		 driver.close();
		 driver.switchTo().window(windowlist.get(0));
		 String currentUrl = driver.getCurrentUrl();
		 System.out.println("Current URL of main window: " + currentUrl);
	}

}
