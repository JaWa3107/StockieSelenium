package de.Stockie;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class StockieTest {

WebDriver driver;
	
	@Before
	public void initTests() throws MalformedURLException {
		System.out.println("initialisiere Webdriver");
		
		//URL linkHub = new URL("http://localhost:4444/wd/hub");
		//driver = new RemoteWebDriver(linkHub, DesiredCapabilities.firefox());
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");	
	}
	
	@After
	public void afterTest() {
		System.out.println("Test abgeschlossen. - Aufr�umen");
		driver.quit();
		
	}
	
	@Test
	public void testTitle() {
		String expect = "Google";
		assertEquals(expect, driver.getTitle());
	}

}
