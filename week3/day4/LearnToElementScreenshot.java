package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnToElementScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		//Specfic element to take Screen shot
		WebElement element= driver.findElement(By.xpath("//img[@alt='Facebook']"));
		
		File source=element.getScreenshotAs(OutputType.FILE);
		File dst=new File("./img/fb.png");
		FileUtils.copyFile(source, dst);
		driver.quit();
		

	}

}
