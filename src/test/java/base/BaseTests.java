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
		System.out.println("Début  du test ");
		
		System.setProperty("webdriver.chrome.driver" , "D:\\Drivers\\Chrome\\83\\chromedriver.exe");
		
		driver = new ChromeDriver ();
		
		System.out.println("Ouvrir la page du site jpetsore ");
		
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		pageAccueil = new PageAccueil ();
		
	}

	@After
	public void theardown( ) {
		driver.quit();
		System.out.println("Fin du test ");
	}
}
