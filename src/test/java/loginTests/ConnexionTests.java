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
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		System.out.println("Cliquer sur le bouton Login");
		
		LoginPage loginPage = pageAccueil.clickLogin(driver);
		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		System.out.println("Entrer le nom d'utilisateur et le mot de passe"); 
		pageAccueil = loginPage.logIn(driver, "j2ee", "j2ee");
		
		text = pageAccueil.getTextBienvenue();
		
		System.out.println("Vérifier le contenu du text d'accueil");
		
		assertEquals("Erreur dans le texte de bienvenue de la page d'accueil", "Welcome ABC!", text);
		
		System.out.println(text);
		
		System.out.println("Test réussi ! ");
		
		
	}

}
