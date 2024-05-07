package spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Three {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		// Initialize ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Open the browser and navigate to SpiceJet website
		driver.get("https://www.spicejet.com/");

		// Click on the Login button on top of the page
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar']")).click();

		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1234567891");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123@dfg");
		driver.findElement(By.xpath("//div[@data-testid='login-cta']")).click();
		// Wait for the login popup to appear
		try {
			Thread.sleep(2000); // Sleep for 2 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Find and fill out the email and password fields
		WebElement emailField = driver
				.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_TextBoxUserID"));
		emailField.sendKeys("dummy@example.com");

		WebElement passwordField = driver
				.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_PasswordFieldPassword"));
		passwordField.sendKeys("password123");

		// Click on the Login button within the popup
		WebElement loginPopupButton = driver
				.findElement(By.id("ControlGroupLoginView_MemberLoginView2LoginView_ButtonLogIn"));
		loginPopupButton.click();

		// Wait for some time to see the result
		try {
			Thread.sleep(5000); // Sleep for 5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Close the browser
		driver.quit();
	}
}
