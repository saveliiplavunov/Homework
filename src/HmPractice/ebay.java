package HmPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {

	public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ebay.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
		searchBox.sendKeys("cofee mug");
		
		WebElement searchBtn = driver.findElement(By.xpath("//input[@id='gh-btn']"));
		searchBtn.click();
		
		List<WebElement>prices = driver.findElements(By.xpath("//span[@class='s-item__price']"));
		WebElement p;
		for (int i=0;i<prices.size();i++) {
			p=prices.get(i);
			System.out.println(p.getText());
		}
		driver.quit();
	}
}
