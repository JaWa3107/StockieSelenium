package de.Stockie;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class TcCheckAvailable {

WebDriver driver;
	
	@Test
	public void testTitle() throws MalformedURLException {
		System.out.println("initialisiere Webdriver");
		System.out.println("Start TcCheckAvailable");
		
		URL linkHub = new URL("http://localhost:4444/wd/hub");
		driver = new RemoteWebDriver(linkHub, DesiredCapabilities.firefox());
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//driver = new ChromeDriver();
		driver.get("http://185.188.250.67/");
		
		String expect = "Stockie";
		assertEquals(expect, driver.getTitle());
		
		System.out.println("Test abgeschlossen. - Webdriver wird beendet");
		driver.quit();
	}

}
