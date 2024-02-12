package HmPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demoqa {
	public static void main(String[] args) throws InterruptedException {
		//demoqaSecond();
		demoqaFirst();
	}
	
	public static void demoqaFirst() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("confirmButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert object1 = driver.switchTo().alert();
		
		System.out.println(object1.getText());
		
		if (object1.getText().equalsIgnoreCase("Do you confirm action?")) {
			object1.dismiss();
		}
		else {
			System.out.println("Something isnt right");
		}
		String confirmation = driver.findElement(By.id("confirmResult")).getText();
		if (confirmation.equals("You selected Cancel")) {
			System.out.println("Test is Pass");
		}
		
		
	}
	public static void demoqaSecond() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("promtButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert inputField = driver.switchTo().alert();
		inputField.sendKeys("PrimeTech");
		inputField.accept();
		
		String confirmationMsg =driver.findElement(By.id("promptResult")).getText();
		if (confirmationMsg.equals("You entered PrimeTech")) {
			System.out.println("Confirmation message is : " +  confirmationMsg );
		}
		else {
			System.out.println("FAIL");
		}

		
		
		
		
		
	}
}
