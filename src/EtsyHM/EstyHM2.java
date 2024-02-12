package EtsyHM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EstyHM2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.etsy.com/");
		Thread.sleep(5000);
		WebElement signInBtn = driver.findElement(By.xpath("//button[contains(@class,'wt-btn wt-btn--small')]"));
		signInBtn.click();
		Thread.sleep(2000);
		
		WebElement registerBtn = driver.findElement(By.xpath("//button[contains(@class,'wt-btn wt-btn--secondary')]"));
		registerBtn.click();
		Thread.sleep(2000);
		
		WebElement emailField = driver.findElement(By.xpath("//input[contains(@id,'join_neu_email')]"));
		emailField.sendKeys("jon.dow@gmail.com");
		
		WebElement firstName = driver.findElement(By.xpath("//input[contains(@id,'join_neu_first')]"));
		firstName.sendKeys("Savelii");
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@id,'join_neu_password')]"));
		password.sendKeys("Savelii");
		
		WebElement registerBtn1 = driver.findElement(By.xpath("//button[contains(@class,'wt-btn wt-btn--primary wt-width')]"));
		registerBtn1.click();
		Thread.sleep(2000);
		
		WebElement errorMsg = driver.findElement(By.xpath("//div[contains(@id,'aria-join_neu_email')]"));
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
