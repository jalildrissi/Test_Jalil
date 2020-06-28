package loginTests;

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
	inscription.saisir_info_user(driver, "test", "123");
	
	inscription.saisir_information_compte(driver, "amar", "dodo", "testdodo@gmail.com", "0021265852");
	inscription.saisir_adresse(driver, "abscd", "23", "clamart", "haut de seine", "92140", "France");
	
	MonComptePage monCompte = inscription.cliquer_enregistrer_info_compte(driver);
	
	monCompte.quitter_mon_compte(driver);

	
}
}
