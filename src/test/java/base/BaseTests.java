package base;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jpetstorePages.PageAccueil;

public class BaseTests {
	
	private WebDriver driver;
	protected PageAccueil pageAccueil;
	
	@Before
	
	public void SetUp () {
		System.setProperty("webdriver.chrome.driver" , "C:\\dev\\webdrivers\\chrome\\81\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.get("https://jpetstore.cfapps.io/catalog");
		driver.manage().window().maximize();
		pageAccueil = new PageAccueil (driver);
		
	}

	@After
	public void theardown( ) {
		driver.quit();
	}
}
