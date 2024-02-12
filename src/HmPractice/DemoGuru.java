package HmPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoGuru {
	public static void main(String[] args) throws InterruptedException {
		
		//demoqaDemoOne();
		iFrame();
		//demoqaDemo();
		//DemoGuru();
	}
	
	public static void DemoGuru() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/popup.php");
		
		String mainPg = driver.getTitle();
		
		String mainWindow = driver.getWindowHandle();
		
		WebElement clickHere = driver.findElement(By.xpath("//*[contains(text(),'Click Here')]"));
		clickHere.click();
		
		for (String newWindow : driver.getWindowHandles()) {
			driver.switchTo().window(newWindow);
		}
		WebElement email = driver.findElement(By.name("emailid"));
		email.sendKeys("1234567@gmail.com");
		
		driver.findElement(By.name("btnLogin")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/table/tbody/tr[4]/td[2]")));
		
		String userID = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]")).getText();
		
		String password = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[2]")).getText();
		
		System.out.println("UserID is : " + userID);
		System.out.println("Password is : " + password);
		
		String accessText = driver.findElement(By.xpath("//*[contains(text(),'This access is valid only for 20 days.')]")).getText();
		if (accessText.equalsIgnoreCase("This access is valid only for 20 days.")) {
			System.out.println("Message verified");
		}
		else {
			System.out.println("FAIL");
		}
		driver.close();
		
		driver.switchTo().window(mainWindow);
		
		System.out.println(driver.getTitle());
		
		if (driver.getTitle().equals(mainPg)) {
			System.out.println("Verifed");
		}
		else {
			System.out.println("FAIL");
		}
		
	}		
	
	public static void demoqaDemo() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demoqa.com/browser-windows");
		
		String mainWindowID = driver.getWindowHandle();
		
		System.out.println(mainWindowID + " This is a main winow ID");
		
		WebElement newTabBtn = driver.findElement(By.id("tabButton"));
		newTabBtn.click();
		
//		Set<String> windowIDs = driver.getWindowHandles();
//		 Get the first window ID from the Set and Verify it matches with the main window id in step 1.
	//   Then get the second window id and store it in variable called secondWindowId.
//		 Switch to the second window
//		for(String windowID : windowIDs) {
//			System.out.println(windowID);
//			if(windowID.equals(mainWindowID)) {
//				System.out.println("Main window ID match with first window ID");
//			}	else
//				driver.switchTo().window(windowID);
//			System.out.println("you switched to second window");
//		}
		
		
		for (String secondWindow :driver.getWindowHandles()) {
			driver.switchTo().window(secondWindow);
		}
		String secondWindowID = driver.getWindowHandle();
		System.out.println(secondWindowID + " This is second window ID");
		
		String secondWindowText = driver.findElement(By.id("sampleHeading")).getText();
		
		if (secondWindowText.equals("This is a sample page")) {
			System.out.println("Text has been verifed");
		}
		else {
			System.out.println("FAIL");
		}
		driver.close();
		
		driver.switchTo().window(mainWindowID);
		
		System.out.println(driver.getTitle());
		
		if (driver.getTitle().contains("DEMOQA")) {
			System.out.println("Home Page Title has been verified");
		}
		else {
			System.out.println("FAIL");
		}
	}
	
	public static void iFrame() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demoqa.com/nestedframes");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"framesWrapper\"]/div[1]")));
		String mainContetText = driver.findElement(By.xpath("//*[@id=\"framesWrapper\"]/div[1]")).getText();
		System.out.println(mainContetText);
		
		driver.switchTo().frame("frame1");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Parent frame')]")));
		String parentFrameText = driver.findElement(By.xpath("//*[contains(text(),'Parent frame')]")).getText();
		System.out.println(parentFrameText + " : is Parent frame text");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Child Iframe')]")));
		String childFrameText = driver.findElement(By.xpath("//*[contains(text(),'Child Iframe')]")).getText();	
		System.out.println(childFrameText + " : is Child frame text");
		
		driver.switchTo().parentFrame();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Parent frame')]")));
		String parentFrameText1 = driver.findElement(By.xpath("//*[contains(text(),'Parent frame')]")).getText();
		System.out.println(parentFrameText + " : is Parent frame text");
		
		driver.switchTo().defaultContent();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"framesWrapper\"]/div[1]")));
		String mainContetText1 = driver.findElement(By.xpath("//*[@id=\"framesWrapper\"]/div[1]")).getText();
		System.out.println(mainContetText);
		
}
	
	public static void demoqaDemoOne() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demoqa.com/browser-windows");
		
		String mainWindowTitle = driver.getTitle();
		
		String mainWindowID = driver.getWindowHandle();
		
		System.out.println(mainWindowID + " This is a main winow ID");
		
		WebElement newTabBtn = driver.findElement(By.id("tabButton"));
		newTabBtn.click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		for (String windowID : windowIDs) {
			if (windowID.equals(mainWindowID)) {
				System.out.println("Main window ID matching to first Window ID");
			}
			else {
				driver.switchTo().window(windowID);
				System.out.println("You switched to second window");
			}
		}
		String secondWindowID = driver.getWindowHandle();
		
		String text = driver.findElement(By.id("sampleHeading")).getText();
		
		if (text.equals("This is a sample page")) {
			System.out.println("Text is equals to :"+text);
		}
		else {
			System.out.println("FAIL");
		}
		driver.close();
		
		driver.switchTo().window(mainWindowID);
		
		if (driver.getTitle().equals(mainWindowTitle)) {
			System.out.println("You are on the main window");
		}
		else {
			System.out.println("FAIl");
		}
		
	}
}