package loginTests;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import base.BaseTests;
import jpetstorePages.LoginPage;
import jpetstorePages.MonCompte;
import jpetstorePages.PageAccueil;

public class ConnexionTests extends BaseTests {
	
	
	
	@Test
	public void testConnexion () {
		
		PageAccueil pageAccueil = PageFactory.initElements(driver, PageAccueil.class);
		
		LoginPage loginPage = pageAccueil.clickLogin(driver);
	
		MonCompte monCompte = loginPage.logIn(driver, "j2ee", "j2ee");
		
		String bienvenue = monCompte.getTextBienvenu();
		
		System.out.println(bienvenue);
	}

}
