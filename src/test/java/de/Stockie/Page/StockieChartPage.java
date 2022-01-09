package de.Stockie.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class StockieChartPage {

	private WebDriver driver;
	
	private By searchbarText = By.xpath("//input[@id='__BVID__7']");
	private By searchbarButton = By.xpath("//div[@class='input-group-text']");
	private By assetName = By.xpath("//div[@class='company']");
	private By assetCurrency = By.xpath("//div[@class='currency']");
	
	public StockieChartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchAsset(String asset) {
		this.driver.findElement(searchbarText).sendKeys(asset);
		this.driver.findElement(searchbarButton).click();
	}
	
	public String getAssetName() {
		return this.driver.findElement(assetName).getText();
	}
	
	public String getAssetCurrency() {
		return this.driver.findElement(assetCurrency).getText();
	}
	
}
