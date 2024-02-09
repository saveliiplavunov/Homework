package utils;

import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

	
	static WebDriver driver;
	
	public static WebDriver getDriver() {
		
		String browser = System.getProperty("browser");
		
		if (browser==null) {
			browser = PropertiesReader.getProperty("browser_type");
		}
		if (driver==null) {
			switch(browser) {
			case "chrome":
				driver = new ChromeDriver();
			break;
			case "chrome-headless":
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("-headless");
				chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
				driver = new ChromeDriver(chromeOptions);
			break;
			case "firefox":
				driver = new FirefoxDriver();
			break;
			case "firefox-headless":
				FirefoxOptions firefoxOptions = new FirefoxOptions();
				firefoxOptions.addArguments("-headless");
				firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
				driver = new FirefoxDriver(firefoxOptions);
			break;
			case "safari":
				driver = new SafariDriver();
			break;
			case "edge":
				driver = new EdgeDriver();
			break;
			default :
				driver = new ChromeDriver();
			break;
			}
		}
		return driver;
	}
}
		
		
		
		
		
		
		
		
		
		
		
		

