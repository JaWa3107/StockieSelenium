package de.Stockie.Selenium;


import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import de.Stockie.Page.StockieChartPage;

public class TcCheckAlertBox {

	WebDriver driver;

  @Test
  @Parameters({"assetName"})
  public void start(String assetName) throws MalformedURLException, InterruptedException {

	  
	  
	  System.out.println("initialisiere Webdriver");
	  System.out.println("Start TcCheckAssetSector");
		
	  URL linkHub = new URL("http://localhost:4444/wd/hub");
	  driver = new RemoteWebDriver(linkHub, DesiredCapabilities.chrome());
		
	  //System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  //driver = new ChromeDriver();
		
	  driver.get("http://185.188.250.67/");
	  
	  Thread.sleep(5 * 1000);
	  StockieChartPage pages = new StockieChartPage(driver);
	  pages.searchAsset(assetName);
	  
	  Thread.sleep(5 * 1000);
	  String nameOfAsset = pages.getAlertBoxText();
	  assertTrue(nameOfAsset.contains("Available assets"));
	  driver.quit();
		
		
  }
}
