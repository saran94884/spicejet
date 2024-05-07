package spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nine {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		// Initialize ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Open the browser and navigate to SpiceJet website
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("(//*[name()='svg'][@data-testid='svg-img'])[7]")).click();
		driver.findElement(By.xpath("//input[@placeholder='e.g. W3X3H8']")).sendKeys("john");
		driver.findElement(By.xpath("//input[@placeholder='john.doe@spicejet.com']")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu']"))
				.click();

		driver.findElement(By.xpath("(//*[name()='svg'][@data-testid='svg-img'])[8]")).click();
		driver.findElement(By.xpath("//div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e']")).click();
		driver.findElement(By.xpath(
				"// div[@class='css-76zvg2 css-bfa6kz r-1862ga2 r-1gkfh8e']//following::div[contains(text(),'Tomorrow')]"))
				.click();

		driver.findElement(By.xpath(
				"(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]"))
				.clear();

		driver.findElement(By.xpath(
				"(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]"))
				.sendKeys("delhi");

		driver.findElement(By.xpath(
				"(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]"))
				.clear();

		driver.findElement(By.xpath(
				"(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]"))
				.sendKeys("chennai");
		driver.findElement(By.xpath(
				"(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]"))
				.sendKeys("chennai");
		driver.findElement(By.xpath("//div[contains(text(),'manage booking')]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@placeholder='e.g. W3X3H8']")).sendKeys("we53ew5343");
		driver.findElement(By.xpath("//input[@placeholder='john.doe@spicejet.com / Doe']")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("(//div[contains(text(),'Search Booking')]//parent::div)[1]")).click();

		// Close the browser
		driver.quit();
	}
}
