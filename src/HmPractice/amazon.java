package HmPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		WebElement signIn = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		signIn.click();
		
		WebElement signInPage = driver.findElement(By.xpath("//input[@id='ap_email']"));
		System.out.println("Email field is diplayed: " + signInPage.isDisplayed());
		
		driver.navigate().back();
		driver.navigate().forward();
		
		WebElement signInPage2 = driver.findElement(By.xpath("//input[@id='ap_email']"));
		System.out.println("Email field is diplayed: " + signInPage2.isDisplayed());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement createAcc = driver.findElement(By.xpath("//span[@id='auth-create-account-link']"));
		createAcc.click();
		
		WebElement createAccPage = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
		System.out.println("Field for the name is displayed: "+ createAccPage.isDisplayed());
		
		driver.navigate().back();
		
		WebElement signInPage3 = driver.findElement(By.xpath("//input[@id='ap_email']"));
		System.out.println("Email field is diplayed: " + signInPage3.isDisplayed());
		
		driver.navigate().forward();
		
		WebElement createAccPage2 = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
		System.out.println("Field for the name is displayed: "+ createAccPage2.isDisplayed());
		
		WebElement continueBtn = driver.findElement(By.xpath("//input[@id='continue']"));
		continueBtn.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement error = driver.findElement(By.xpath("//div[@id='auth-customerName-missing-alert']"));
		String errorName = error.getText();
		System.out.println(errorName);
		
		WebElement error2 = driver.findElement(By.xpath("//div[@id='auth-email-missing-alert']"));
		String errorEmail = error2.getText();
		System.out.println(errorEmail);
		
		WebElement error3 = driver.findElement(By.xpath("//div[@id='auth-password-missing-alert']"));
		String errorPassword = error3.getText();
		System.out.println(errorPassword);
		
		driver.quit();
		
		
	}
}
