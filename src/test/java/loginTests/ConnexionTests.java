package loginTests;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

//import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import base.BaseTests;
import jpetstorePages.LoginPage;
//import jpetstorePages.MonComptePage;
import jpetstorePages.PageAccueil;

public class ConnexionTests extends BaseTests {
	
	
	
	@Test
	public void testConnexion () {
		String text;
		PageAccueil pageAccueil = PageFactory.initElements(driver, PageAccueil.class);
		
		LoginPage loginPage = pageAccueil.clickLogin(driver);
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		pageAccueil = loginPage.logIn(driver, "j2ee", "j2ee");
		
		 text = pageAccueil.getTextBienvenue(); 
		 
		assertEquals("Erreur dans le texte", "Welcome ABC !", text);
		
		System.out.println(text);
		
		System.out.println("Test réussi ! ");
		
		
	}

}
