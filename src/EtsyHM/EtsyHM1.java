package EtsyHM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyHM1 {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.etsy.com/");
		
		Thread.sleep(5000);
		//WebElement signIn = driver.findElement(By.xpath("//div[@class='wt-flex-shrink-xs-0']"));
		WebElement signIn = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin header-button']"));
		signIn.click();
		Thread.sleep(2000);
		
		WebElement registerMain = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--secondary wt-btn--small inline-overlay-trigger register-header-action select-register']"));
		registerMain.click();
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='join_neu_email_field']"));
		email.sendKeys("jon.dow@gmail.com");
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='join_neu_first_name_field']"));
		firstName.sendKeys("Savelii");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='join_neu_password_field']"));
		password.sendKeys("Savelii");
		
		WebElement registerBtn1 = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--primary wt-width-full']"));
		registerBtn1.click();
		Thread.sleep(2000);
		
		WebElement errorMsg = driver.findElement(By.xpath("//div[@id='aria-join_neu_email_field-error']"));
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
