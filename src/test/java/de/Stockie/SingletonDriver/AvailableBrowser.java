package de.Stockie.SingletonDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public enum AvailableBrowser {

	FIREFOX {
		
		@Override
		public WebDriver createDriver() throws MalformedURLException {
			
			URL linkHub = new URL("http://localhost:4444/wd/hub");
			WebDriver driver = new RemoteWebDriver(linkHub, DesiredCapabilities.firefox());
			
			//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			
			return driver;
			
		}
	},
	
	CHROME {
		
		@Override
		public WebDriver createDriver() throws MalformedURLException {
			
			URL linkHub = new URL("http://localhost:4444/wd/hub");
			WebDriver driver = new RemoteWebDriver(linkHub, DesiredCapabilities.chrome());
			
			return driver;
			
		}
	},;
	
	public abstract WebDriver createDriver() throws MalformedURLException;
	
}
