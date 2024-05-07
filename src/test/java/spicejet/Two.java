package spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Two {
	public static void main(String[] args) {
		// Set the path to the ChromeDriver executable
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Open the browser and navigate to the SpiceJet sign-up page
		driver.get("https://spiceclub.spicejet.com/signup");


		driver.findElement(By.id("first_name")).sendKeys("John");

		driver.findElement(By.id("last_name")).sendKeys("Doe");

		driver.findElement(By.id("email_id")).sendKeys("john@gmail.com");
	


		driver.findElement(By.xpath("//div[@class='position-relative']//input[@id='new-password']")).sendKeys("1234asdasd");
		driver.findElement(By.xpath("//div[@class='position-relative']//input[@id='c-password']"))
				.sendKeys("1234asdasd");
		driver.findElement(By.xpath("//div[@class='form-check']//input[@id='defaultCheck1']")).click();
		driver.findElement(By.xpath("//div[@class=' mt-40 px-sm-4 col-auto']//button[@class='btn btn-red']")).click();
		// Wait for some time to see the result
		try {
			Thread.sleep(5000); // Wait for 5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Close the browser
		driver.quit();
	}
	}
