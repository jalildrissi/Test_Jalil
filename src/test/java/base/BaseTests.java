package base;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jpetstorePages.PageAccueil;

public class BaseTests {
	
	public WebDriver driver;
	protected PageAccueil pageAccueil;
	
	@Before
	
	public void SetUp () {
		System.setProperty("webdriver.chrome.driver" , "C:\\dev\\webdrivers\\chrome\\81\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.get("https://jpetstore.cfapps.io/catalog");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		pageAccueil = new PageAccueil (driver);
		
	}

	@After
	public void theardown( ) {
		driver.quit();
	}
}
