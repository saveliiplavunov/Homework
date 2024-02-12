package FacebookHM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHomework {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
		WebElement emailBox = driver.findElement(By.id("email"));
		emailBox.sendKeys("Automation");
		
		WebElement passwordBox = driver.findElement(By.id("pass"));
		passwordBox.sendKeys("Automation");
		
		WebElement LogInButton = driver.findElement(By.name("login"));
		LogInButton.click();
	}

}
