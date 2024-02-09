package pageObjectModel;

import page.EbayPage;
import utils.Driver;
import utils.PropertiesReader;

public class EbayPageObjectDemo {

	public static void main(String[] args) {
	
	}
	
	public static void ebayPage() {
		
		EbayPage page = new EbayPage();
		//go to website
		Driver.getDriver().get(PropertiesReader.getProperty("ebay_url"));
		//type in search box
		page.searchBox.sendKeys(PropertiesReader.getProperty("item_name"));
		//click searchBtn
		page.searchBtn.click();
		//find items price and print out
		page.performActionOnItemList();
		
		
	}

}
