package loginTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import base.BaseTests;
import jpetstorePages.InscriptionPage;
import jpetstorePages.LoginPage;
import jpetstorePages.MonComptePage;
import jpetstorePages.PageAccueil;

public class CreerNouveauCompteTest extends BaseTests {
	
	@Test
	public void creerNouveauCompteTest() {
	PageAccueil pageAccueil = PageFactory.initElements(driver, PageAccueil.class);

	LoginPage loginPage = pageAccueil.clickLogin(driver);
	
	InscriptionPage inscription = loginPage.click_register_now(driver);
	
	System.out.println("Saisir info user");
	inscription.saisir_info_user(driver, "marion", "123456");
	
	System.out.println("Saisir info compte");
	inscription.saisir_information_compte(driver, "marion", "dodo", "testdodo@gmail.com", "0021265852");
	
	System.out.println("Saisir info adresse");
	inscription.saisir_adresse(driver, "abscd", "23", "clamart", "haut de seine", "92140", "France");
	
	System.out.println("Enregistrer les infos du compte");
	pageAccueil = inscription.cliquer_enregistrer_info_compte(driver);
	
	pageAccueil.clickLogin(driver);
	
	System.out.println("Se connecter au nouveau compte");
	MonComptePage moncompte =loginPage.cliquer_login(driver, "marion", "123456");
	
	String texte = moncompte.getTextBienvenue();
	
	System.out.println(texte);
	
	assertEquals("Erreur dans le texte de bienvenue de la page d'accueil", "Welcome marion!", texte);
	
	moncompte.quitter_mon_compte(driver);
	


	
}
}
