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
		System.setProperty("webdriver.chrome.driver" , "C:\\dev\\webdrivers\\chrome\\83\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.get("https://jpetstore.cfapps.io/catalog");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		pageAccueil = new PageAccueil ();
		
	}

	@After
	public void theardown( ) {
		driver.quit();
	}
}
