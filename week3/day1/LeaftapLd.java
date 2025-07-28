package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LeaftapLd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Id
		WebElement element = driver.findElement(By.id("username")); //30-1 29
		element.sendKeys("demo");//30-25 5
		element.clear();//30 0.1
		
		Thread.sleep(3000);
		element.sendKeys("demosalesmanager");//30
		
		
		// name
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

		// tag name
		String text = driver.findElement(By.tagName("label")).getText();

		System.out.println(text);
		// classname linkText partiala linkText tagname xpath css

		driver.findElement(By.className("decorativeSubmit")).click();

		// partialLinktext

		driver.findElement(By.partialLinkText("CR")).click();

		// linkText
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("RDX");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhinesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ramesh");
		WebElement options=driver.findElement(By.xpath("//select[@name='dataSourceId']"));
	    Select obj=new Select(options);
	    obj.selectByIndex(4);  // select the index 
	    
	    WebElement mc=driver.findElement(By.xpath("//select[@name='marketingCampaignId']"));
	    Select mar=new Select(mc);
	    mar.selectByVisibleText("Automobile"); //select the text 
	    
	    WebElement owner=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
	    Select oe=new Select(owner);
	    oe.selectByValue("OWN_CCORP"); //select the value
	    
	    driver.findElement(By.className("smallSubmit")).click();
	    
		String title = driver.getTitle();

		System.out.println(title);
		if (title.contains("view")) {
			System.out.println("verified");

		}

		String url = driver.getCurrentUrl();

		System.out.println(url);
		
		
		driver.quit();


	    
//		String un=driver.findElement(By.id("viewLead_firstName_sp")).getText();
//		if(un.contains("Dhinesh"))
//		{
//			System.out.print("verified");
//		}
//		

	}

}

