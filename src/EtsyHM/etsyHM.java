package EtsyHM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class etsyHM {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.etsy.com/");
		Thread.sleep(5000);
		
		WebElement SignIn = driver.findElement(By.xpath("/html/body/div[2]/div/header/div[4]/nav/ul/li[1]/button"));
		SignIn.click();
		Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div/div/div/div/div[2]/form/div[1]/div/div[2]/input"));
		email.sendKeys("authomation");
		
		WebElement password = driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div/div/div/div/div[2]/form/div[1]/div/div[3]/input"));
		password.sendKeys("authomation");
		
		WebElement signIn = driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div/div/div/div/div[2]/form/div[1]/div/div[7]/div/button"));
		signIn.click();
	}
	
}
