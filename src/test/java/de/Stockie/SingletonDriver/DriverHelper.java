package de.Stockie.SingletonDriver;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

public class DriverHelper {
	
	private static void throwExceptionWhenNull(String browser) {
		
		if (browser == null) {
			throw new RuntimeException("Es wurde kein WebDriver angegeben.");
		}
		
	}
	

	public static WebDriver getDriver(String browser) throws MalformedURLException {
		
		throwExceptionWhenNull(browser);
		AvailableBrowser currentBrowser = AvailableBrowser.valueOf(browser.toUpperCase());
		WebDriver driver = currentBrowser.createDriver();
		return driver;
	}
	
}
