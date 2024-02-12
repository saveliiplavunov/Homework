package IndeedHM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndeedHM_2 {

	public static void main(String []args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.indeed.com");
		
		String expectedResult = "Jacksonville, FL";
		
		WebElement whereBox = driver.findElement(By.xpath("//input[@id='text-input-where']"));
		String actualResult =whereBox.getAttribute("value");
		
		if (expectedResult.equals(actualResult)) {
			System.out.println("The location is matching");
		}
		else {
			System.out.println("The location is not maching");
		}
		
		WebElement whereField = driver.findElement(By.xpath("//input[@id='text-input-where']"));
		String color = whereField.getCssValue("color");
		System.out.println(color);
		
		WebElement whereFieldTagName = driver.findElement(By.xpath("//input[@id='text-input-where']"));
		String tagName = whereFieldTagName.getTagName();
		
		if(tagName.equals("input")){
			System.out.println("Tag name is equals to : "+tagName);
		}
		else {
			System.out.println("Tag name is incorrect.Fail");
		}
		
		
	}

}
