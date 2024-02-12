package HmPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class indeed {

	public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://indeed.com");
		
		//check if the search fields are enabled and displayed
		
		WebElement jobTitleField = driver.findElement(By.xpath("//input[@id='text-input-what']"));
		Boolean actualResultDisplayed = jobTitleField.isDisplayed();
		Boolean actualResultEnabled = jobTitleField.isEnabled();
		System.out.println(actualResultDisplayed);
		System.out.println(actualResultEnabled);
		
		driver.quit();
		
		
		
		
		
	}

	
}
