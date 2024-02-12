package handsOnLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoPractice {

	public static void main(String[] args) throws InterruptedException {
		SauceDemoTestCase1();
		
	}
		public static  void SauceDemoTestCase1() throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			
			String loginPageTitle = driver.getTitle();
			String loginPageURL = driver.getCurrentUrl();
			System.out.println(loginPageTitle);
			System.out.println(loginPageURL);
			
			WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
			username.sendKeys("standard_user");
			
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			password.sendKeys("secret_sauce");
			
			WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));
			loginBtn.click();
			Thread.sleep(2000);
			
			WebElement produtcs = driver.findElement(By.xpath("//span[@class='title']"));
			String productText = produtcs.getText();
			if (productText.equals("Products")) {
				System.out.println("Product text is present");
			}
			Thread.sleep(1000);
			
			String productPageTitle = driver.getTitle();
			System.out.println(productPageTitle);
			
			if (!productPageTitle.equals(loginPageTitle)) {
			System.out.println("Product Page title is not equal to Login Page Title");
			}
			else {
			System.out.println("Product Page title is equal to Login Page Title");
			}
			
			String productPageURL = driver.getCurrentUrl();
			System.out.println(productPageURL);
			
			if (!productPageURL.equalsIgnoreCase(loginPageURL)) {
				System.out.println("Product page URL is not equal to Login Page URL");
			}
			else {
				System.out.println("Product page URL is equal to Login Page URL");
			}
			
			driver.quit();
			
			
		
			
		}

	

}
