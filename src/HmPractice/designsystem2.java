package HmPractice;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class designsystem2 {

	public static void main (String[]args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://designsystem.digital.gov/components/checkbox/");
		
		List<WebElement> componentsIsEnabled = driver.findElements(By.xpath("//input[@class='usa-checkbox__input']"));
		WebElement ce = null;
		for (int i=0;i<componentsIsEnabled .size();i++) {
			ce = componentsIsEnabled .get(i);}
		
		if (ce.isEnabled()) {
			System.out.println("Radio buttons are enabled");
		}
		else {
			System.out.println("Not all of the radio buttons are enabled");
		
		}
		
		List<WebElement> componentsIsDisplayed = driver.findElements(By.xpath("//fieldset[@class='usa-fieldset']"));
		WebElement cd = null;
		for (int i=0;i<componentsIsDisplayed.size();i++) {
			cd = componentsIsDisplayed.get(i);}
		
		if (cd.isDisplayed()) {
			System.out.println("All Radio buttons are displayed");
		}
		else {
			System.out.println("Not all of the radio buttons are dispayed");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement selected = driver.findElement(By.xpath("//input[@value='sojourner-truth']"));
		System.out.println(selected.isSelected());
	
		driver.quit();
	}
}
