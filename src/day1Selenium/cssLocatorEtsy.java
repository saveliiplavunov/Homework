package day1Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssLocatorEtsy {

	public static void main(String[] args) throws InterruptedException {
		
		cssLocatorsEtsy();
	}
	public static void cssLocatorsEtsy() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.etsy.com/");
		Thread.sleep(3000);
		
		WebElement signIn = driver.findElement(By.cssSelector(".select-signin"));
		signIn.click();
		Thread.sleep(2000);
		
		WebElement registerMain = driver.findElement(By.cssSelector(".register-header-action"));
		registerMain.click();
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.cssSelector("input[id=join_neu_email_field]"));
		email.sendKeys("jon.dow@gmail.com");
		
		WebElement firstName = driver.findElement(By.cssSelector("input[id=join_neu_first_name_field]"));
		firstName.sendKeys("Savelii");
		
		WebElement password = driver.findElement(By.cssSelector("input[id=join_neu_password_field]"));
		password.sendKeys("Savelii");
		
		WebElement registerBtn1 = driver.findElement(By.cssSelector("button[value=register]"));
		registerBtn1.click();
		Thread.sleep(2000);
		
		WebElement errorMsg = driver.findElement(By.cssSelector("div[id=aria-join_neu_email_field-error]"));
		String msg = errorMsg.getText();
		
		String errorMsgText = "Sorry, the email you have entered is already in use.";
		if (msg.equalsIgnoreCase(errorMsgText)) {
			System.out.println("Sorry, the email you have entered is already in use.");
		}
		else {
			System.out.println("Welcome");
		}
		
	}

}
