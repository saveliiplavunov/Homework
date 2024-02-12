package handsOnLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayAutomation {
	
	public static void main (String[]args) throws InterruptedException {
		ebaySearch();
	}
	public static void ebaySearch() throws InterruptedException	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ebay.com");
		
		String homePageTitle = driver.getTitle();System.out.println(homePageTitle);
		String homePageURL = driver.getCurrentUrl();System.out.println(homePageURL);
		
		Thread.sleep(1000);
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
		searchBox.sendKeys("cofee mugs");
		
		WebElement searchBtn = driver.findElement(By.xpath("//input[@id='gh-btn']"));
		searchBtn.click();
		
		String productPageTitle = driver.getTitle();System.out.println(productPageTitle);
		
		if (!productPageTitle.equals(homePageTitle)) {
			System.out.println("Product page title is not equals to Home Page Title");
		}
		else {
			System.out.println("Prodcut page title is equals to Home Page Title");
		}
		
		String productPageURL = driver.getCurrentUrl();
		
		if (!productPageURL.equals(homePageURL)) {
			System.out.println("Product page URL is not equals to Home Page URL");
		}
		else {
			System.out.println("Product page URL is equal to home Page URL");
		}
		
		WebElement newSearchBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));newSearchBox.clear();
		newSearchBox.clear();
		
		Thread.sleep(1000);
		
		newSearchBox.sendKeys("pretty cofee mugs");
		
		Thread.sleep(1000);
		
		WebElement newSearchBtn = driver.findElement(By.xpath("//input[@id='gh-btn']"));
		newSearchBtn.click();
		Thread.sleep(2000);
		
		WebElement searchTermsElement = driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']"));
		String searchTerms = searchTermsElement.getText();
		if (searchTerms.contains("pretty coffee mugs")) {
			System.out.println("Search terms contatins pretty coffee mugs");
		}
		else {
			System.out.println("Serach terms dosent contain pretty cofee mugs");
		}
		
	}
	
}
