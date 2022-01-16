package de.Stockie.Selenium;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import de.Stockie.Page.StockieChartPage;
import de.Stockie.SingletonDriver.DriverHelper;

public class TcCheckAssetSector extends DriverHelper {

	WebDriver driver;

  @Test
  @Parameters({"assetName","expectedSector", "browserName"})
  public void start(String assetName, String expectedSector, String browserName ) throws MalformedURLException, InterruptedException {

	  
	  
	  System.out.println("initialisiere Webdriver");
	  System.out.println("Start TcCheckAssetSector");
		
	  driver = getDriver(browserName);
		
	  driver.get("http://185.188.250.67/");
	  
	  Thread.sleep(5 * 1000);
	  StockieChartPage pages = new StockieChartPage(driver);
	  pages.searchAsset(assetName);
	  
	  Thread.sleep(5 * 1000);
	  String nameOfAsset = pages.getAssetSector();
	  assertEquals(nameOfAsset, expectedSector);
	  driver.quit();
		
		
  }
}
