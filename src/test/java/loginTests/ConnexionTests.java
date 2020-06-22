package loginTests;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.BaseTests;
import jpetstorePages.LoginPage;
import jpetstorePages.MonCompte;

public class ConnexionTests extends BaseTests {
	
	WebDriver driver;
	
	@Test
	public void testConnexion () {
		System.out.println("Début du test ");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		LoginPage loginpage = pageAccueil.clickLogin();
		System.out.println("Saisi le nom d'utilisateur ");
		loginpage.SaisirUsername("j2ee");
		
		System.out.println("Saisi du mot de passe ");
		loginpage.SaisirPassord("j2ee");
		loginpage.cliquerlogin();
		MonCompte maPage = loginpage.cliquerlogin();
		String texte = maPage.getTextBienvenu();
		System.out.println(texte);
		
	}

}
