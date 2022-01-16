package de.Stockie.Selenium;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import de.Stockie.SingletonDriver.DriverHelper;



public class TcCheckAvailable extends DriverHelper {
	
WebDriver driver;
	
	@Test
	@Parameters({"browserName"})
	public void testTitle(String browserName ) throws MalformedURLException {
		System.out.println("initialisiere Webdriver");
		System.out.println("Start TcCheckAvailable");
			
		driver = getDriver(browserName);
		
		
		
		driver.get("http://185.188.250.67/");
		
		String expect = "Stockie";
		assertEquals(expect, driver.getTitle());
		
		System.out.println("Test abgeschlossen. - Webdriver wird beendet");
		driver.quit();
	}

}
