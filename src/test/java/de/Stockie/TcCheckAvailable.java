package de.Stockie;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class TcCheckAvailable {

WebDriver driver;
	
	@Before
	public void initTests() throws MalformedURLException {
		System.out.println("initialisiere Webdriver");
		System.out.println("Start TcCheckAvailable");
		
		
		URL linkHub = new URL("http://localhost:4444/wd/hub");
		driver = new RemoteWebDriver(linkHub, DesiredCapabilities.firefox());
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//driver = new ChromeDriver();
		driver.get("http://185.188.250.67/");	
	}
	
	@After
	public void afterTest() {
		System.out.println("Test abgeschlossen. - Webdriver wird beendet");
		driver.quit();
		
	}
	
	@Test
	public void testTitle() {
		String expect = "Stockie";
		assertEquals(expect, driver.getTitle());
	}

}
