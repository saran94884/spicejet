package spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Eight {
	public static void main(String[] args) {
		// Set the path to the ChromeDriver executable
		WebDriverManager.chromedriver().setup();

		// Initialize ChromeDriver
		WebDriver driver = new ChromeDriver();


		try {
			Thread.sleep(5000); // Sleep for 5 seconds (adjust as needed)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Check for the booking confirmation message on the resulting web page
		WebElement confirmationMessage = driver.findElement(By.xpath("//div[contains(text(), 'Booking confirmed')]"));

		// Verify if the confirmation message is displayed
		if (confirmationMessage.isDisplayed()) {
			System.out.println("Booking was successful. Confirmation message found.");
		} else {
			System.out.println("Booking was unsuccessful. Confirmation message not found.");
		}

		// Close the browser
		driver.quit();
	}
}
