package loginTests;

import org.junit.Test;

import base.BaseTests;
import jpetstorePages.LoginPage;
import jpetstorePages.MonCompte;
import jpetstorePages.PageAccueil;

public class ConnexionTests extends BaseTests {
	
	@Test
	public void testConnexion () {
		System.out.println("Début du test ");
		PageAccueil pageAccueil = new PageAccueil (driver);
		LoginPage loginpage = pageAccueil.clickLogin(driver);
		System.out.println("Saisi le nom d'utilisateur ");
		loginpage.saisirUsername("j2ee");
		
		System.out.println("Saisi du mot de passe ");
		loginpage.saisirPassword("j2ee");
		loginpage.cliquerlogin();
		MonCompte maPage = loginpage.cliquerlogin();
		String texte = maPage.getTextBienvenu();
		System.out.println(texte);
		
	}

}
