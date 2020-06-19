package base;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {
	
	private WebDriver driver;
	protected PageAccueil pageAccueil;
	
	@BeforeClass
	
	public void SetUp () {
		System.setProperty("webdriver.chrome.driver" , "C:\\dev\\webdrivers\\chrome\\81\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.get("https://jpetstore.cfapps.io/catalog");
		
	}

}
