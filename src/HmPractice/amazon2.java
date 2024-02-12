package HmPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazon2 {

	public static void main (String[]args) throws InterruptedException {
//amazon1();	
amazon();
	}
	public static void amazon() throws InterruptedException{
		
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://amazon.com");
	Thread.sleep(5000);
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	Select selectOpt = new Select(dropdown);
	List<WebElement> departments = selectOpt.getOptions();
	System.out.println("Available departments to choose : " +departments.size());
	System.out.println(dropdown.getText());
	}
	public static void amazon1() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://amazon.com");
		
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select letsSelect = new Select(dropdown);
		
		String defaultSelect = letsSelect.getFirstSelectedOption().getText();
		
		if (defaultSelect.equalsIgnoreCase("All Departments")) {
			System.out.println("Dropdown verifed");
		}
		else {
			System.out.println("something is wrong");
		}
		
		letsSelect.selectByVisibleText("Home & Kitchen");
		
		String searchCriteria = "coffee mug";
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys(searchCriteria);
		
		WebElement searchBtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchBtn.click();
		
		driver.getTitle();
		
		if (driver.getTitle().contains(searchCriteria)) {
			System.out.println("Title verified");
		}
		else {
			System.out.println("something went wrong");
		}
		
		WebElement newDropDown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select newSelect = new Select(newDropDown);
		
		
		String selectedOpt = newSelect.getFirstSelectedOption().getText();
		if (selectedOpt.equalsIgnoreCase("Home & Kitchen")) {
			System.out.println("Departement has been verified");
		}
		else {
			System.out.println("FAIL");
		}
	
	
	}
}
