package day1Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWorkFacebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		WebElement createNewAcc = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
		createNewAcc.click();
		Thread.sleep(1000);
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Authomation");
		
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Authomation");
		
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("Authomation");
		
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("Authomation");
		
		WebElement submitBtn = driver.findElement(By.name("websubmit"));
		submitBtn.click();
	}
}
