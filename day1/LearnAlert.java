package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//h5[text()=' Alert (Simple Dialog)']//following::span")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']//following::span")).click();
		Alert confirmalert=driver.switchTo().alert();
		System.out.println(confirmalert.getText());
		//confirmalert.dismiss();
		confirmalert.accept();
		String result=driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println(result);
		
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']//following::span")).click();
		Alert prompt=driver.switchTo().alert();
		prompt.sendKeys("Hello i am new user");
		prompt.accept();
		String  pr=driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(pr);
		
		driver.findElement(By.xpath("//h5[text()='Sweet Alert (Simple Dialog)']//following::span")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']"));
		driver.close();
		
		
		
		
		
		
	}

}
