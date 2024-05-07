package spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Four {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		// Initialize ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Open the browser and navigate to SpiceJet website
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]"))
				.clear();

		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]"))
				.sendKeys("chennai");
		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]"))
				.clear();
		driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]"))
				.sendKeys("delhi");

		driver.findElement(By.xpath("(//*[name()='svg'][@data-testid='svg-img'])[11]")).click();

		driver.findElement(By.xpath("(//*[name()='svg'][@data-testid='svg-img'])[13]")).click();

		driver.findElement(By.xpath("(//div[text()='18'])[2]")).click();
		driver.findElement(By.xpath("(//div[text()='25'])[2]")).click();
		driver.findElement(By.xpath(
				"//div[@data-testid='home-page-flight-cta']"))
				.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@data-testid='continue-search-page-cta']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@data-testid='first-inputbox-contact-details']")).sendKeys("john");
		driver.findElement(By.xpath("//input[@data-testid='last-inputbox-contact-details']")).sendKeys("M");
		driver.findElement(By.xpath("//input[@data-testid='contact-number-input-box']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@data-testid='emailAddress-inputbox-contact-details']"))
				.sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//input[@data-testid='city-inputbox-contact-details']")).sendKeys("chennai");
		driver.findElement(By.xpath("//input[@data-testid='traveller-0-first-traveller-info-input-box']"))
				.sendKeys("john");
		driver.findElement(By.xpath("//input[@data-testid='traveller-0-last-traveller-info-input-box']")).sendKeys("M");
		driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']"))
				.click();


	}


}
