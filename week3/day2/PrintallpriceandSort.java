package week3.day2;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintallpriceandSort {
// This class demonstrates how to find all phone prices on Amazon, sort them, and print the second largest price.
	public static void main(String[] args) throws InterruptedException, IOException {
// Create an instance of the ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		// Maximize the browser window
		driver.manage().window().maximize();
		// Set an implicit wait of 20 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Navigate to the Amazon India website
		driver.get("https://www.amazon.in/");
		// Refresh the page to ensure all elements are loaded
		driver.navigate().refresh();
		// Find the search box element by its ID and enter the search term "phones"
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		// Enter the search term "phones" and simulate pressing the Enter key
		element.sendKeys("phones", Keys.ENTER);
		Thread.sleep(2000); // Wait for 2 seconds to ensure all prices are loaded
		// Find all elements that match the XPath for phone prices
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		// Create a list to store the phone prices as integers
		List<Integer> phonePrice = new ArrayList<Integer>();
		// Iterate through the list of price elements
		for (int i = 0; i < price.size(); i++) {
			// Get the text of each price element
			String text = price.get(i).getText();
			text = text.replace(",", ""); // Remove commas from the price text
			// Check if the text is not empty
			if (!text.isEmpty()) {
				// Try to parse the text as an integer and add it to the phonePrice list
				try {
					// Parse the text to an integer
					int intPrice = Integer.parseInt(text);
					// Add the parsed integer price to the phonePrice list
					phonePrice.add(intPrice);
					// Catch any NumberFormatException that occurs if the text cannot be parsed as
					// an integer
				} catch (NumberFormatException e) {
				}

			}

		}
		// Sort the list of phone prices in ascending order
		Collections.sort(phonePrice);
		// print the sorted list of phone prices
		System.out.println(phonePrice);
		
		int largest=phonePrice.get(phonePrice.size()-1);
		System.out.println(largest);
		// Close the browser
		driver.quit();
	}
}
