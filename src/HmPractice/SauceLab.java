package HmPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLab {
	
	public static void main(String[]args) {
		
		saucedemo();
	}
	
	public static void saucedemo() {
		
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://saucedemo.com");
	
	WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
	username.sendKeys("standard_user");
	
	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("secret_sauce");
	
	WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
	login.click();
	
	  //find all the results and get them in a list, and print the size of the list
	
	List<WebElement> listOfElements = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
	int size = listOfElements.size();
	System.out.println("The amount of items on the page: " +size);
	
//	  find all the results. 
//	     print the price of each result. 
//	     Hint: loop through the list, get index and get text
	List <WebElement> priceOfItems = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
	WebElement p;
	for (int i = 0;i<priceOfItems.size();i++) {
		p = priceOfItems.get(i);
		System.out.println(p.getText());
		
	}
	
	driver.quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}