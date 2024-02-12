package IndeedHM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class indeedHM {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.indeed.com");
		
		String homeURL = driver.getCurrentUrl();
		
		String homeTitle = driver.getTitle();
		
		Thread.sleep(3000);
		WebElement what = driver.findElement(By.xpath("//*[@id=\"text-input-what\"]"));
		what.sendKeys("Software Engineer");
		
		WebElement searchBtn = driver.findElement(By.xpath("//*[@id=\"jobsearch\"]/div/div[2]/button"));
		searchBtn.click();
		
		String searchURL = driver.getCurrentUrl();
		
		String searchTitle = driver.getTitle();
		
		System.out.println(homeURL.equals(searchURL));
		
		System.out.println(homeTitle.equals(searchTitle));
		
		//We're storing the location search Box into the string
		WebElement locationSearchBox = driver.findElement(By.xpath("//*[@id='text-input-where']"));
		String location = locationSearchBox.getAttribute("value");
		System.out.println(location);
		

		Thread.sleep(2000);
		
		//Job title Box storing in the String
		WebElement whatBox = driver.findElement(By.xpath("//*[@id='text-input-what']"));
		String job = whatBox.getAttribute("value");
		System.out.println(job);
		
		
		//Finding elements for our actual result and storing in the String
		WebElement JobsInLocation = driver.findElement(By.xpath("//*[@id=\"jobsearch-JapanPage\"]/div/div[5]/div[1]/div[4]/h1"));
		String jobsInLocationField =JobsInLocation.getText();
		System.out.println(jobsInLocationField);
		
		//Since now we have 2 separate Strings of job title and location,we can compare them with actual result
		//Adding "jobs in " words so our left side can be exactly like right side.
		System.out.println((job + " jobs in " + location).equalsIgnoreCase(jobsInLocationField));
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
