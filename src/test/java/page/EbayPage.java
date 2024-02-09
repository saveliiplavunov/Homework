package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class EbayPage {
	
	
	public EbayPage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}
//	private WebDriver driver; //initializing driver 
	
	//collecting WebElement
	@FindBy(xpath="//input[@id='gh-ac']")
	public WebElement searchBox;
	
	@FindBy(xpath="//input[@id='gh-btn']")
	public WebElement searchBtn;
	
	@FindBy(xpath = "//span[@class='s-item__price']")
    private List<WebElement> itemList;

	public void performActionOnItemList() {
        for (WebElement prices : itemList) {
           System.out.println(prices.getText());
        }
    }
	
	
	
}
