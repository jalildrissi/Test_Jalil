package jpetstorePages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.*;

public class InscriptionPage {
	
	@FindBy(xpath = "//h3[contains(text(),'User Information')]")
	public WebElement texte_info_utilisateur;
	
	
	@FindBy(xpath = "//input[@name='username']")
	public WebElement champ_userId;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement champ_password;
	
	@FindBy(xpath = "//input[@name='repeatedPassword']")
	public WebElement champ_repeat_password;
	
	@FindBy(xpath = "//h3[contains(text(),'Account Information')]")
	public WebElement information_compte_titre;
	
	@FindBy(xpath = "//input[@name='account.firstName']")
	public WebElement champ_first_name;
	
	@FindBy(xpath = "//input[@name='account.lastName']")
	public WebElement champ_last_name;
	
	@FindBy(xpath = "//input[@name='account.email']")
	public WebElement champ_email;
	
	@FindBy(xpath = "//input[@name='account.phone']")
	public WebElement champ_phone;
	
	@FindBy(xpath = "//input[@name='account.address1']")
	public WebElement champ_adresse_1;
	
	@FindBy(xpath = "//input[@name='account.address2']")
	public WebElement champ_adresse_2;
	
	@FindBy(xpath = "//input[@name='account.city']")
	public WebElement champ_city;
	
	@FindBy(xpath = "//input[@name='account.state']")
	public WebElement champ_state;
	
	@FindBy(xpath = "//input[@name='account.zip']")
	public WebElement champ_code_postal;
	
	@FindBy(xpath = "//input[@name='account.country']")
	public WebElement champ_pays;
	
	@FindBy(xpath = "//h3[contains(text(),'Profile Information')]")
	public WebElement texte_profil_information;
	
	@FindBy(xpath = "//input[@name='newAccount']")
	public WebElement enregistrer_info_compte;

	////Saisir les informations de l'utilisateur (Id, password )
	public void  saisir_info_user(WebDriver driver, String username, String password) {

		champ_userId.clear();
		champ_userId.sendKeys(username);
		champ_password.clear();
		champ_password.sendKeys(password);
		champ_repeat_password.sendKeys(password);

	}
	//Saisir les informations du compte
	
	public void  saisir_information_compte (WebDriver driver, String firstname, String lastname, String email, String phone) {
		
		champ_first_name.clear();
		champ_first_name.sendKeys(firstname);
		champ_last_name.clear();
		champ_last_name.sendKeys(lastname);
		champ_email.clear();
		champ_email.sendKeys(email);
		champ_phone.clear();
		champ_phone.sendKeys(phone);
		
	}
	
	//Saisir l'adresse postale
	
	public void  saisir_adresse (WebDriver driver, String adresse1, String adresse2, String city, String state, String zip, String pays) {
		
		champ_adresse_1.clear();
		champ_adresse_1.sendKeys(adresse1);
		champ_adresse_2.clear();
		champ_adresse_2.sendKeys(adresse2);
		champ_city.clear();
		champ_city.sendKeys(city);
		champ_state.clear();
		champ_state.sendKeys(state);
		champ_code_postal.clear();
		champ_code_postal.sendKeys(zip);
		champ_pays.clear();
		champ_pays.sendKeys(pays);
		
	}
	
	// Enregistrer les information du compte et aller vers la page MonCompte 

	public PageAccueil cliquer_enregistrer_info_compte (WebDriver driver) {
		
		enregistrer_info_compte.click();
		
		return PageFactory.initElements(driver, PageAccueil.class);
	}


	
	

	
	//TODO
	/*
	public PageAccueil quitterCompte (	WebDriver driver) {
		driver.findElement(quitterMonCompte).click();
		
		return 	PageFactory.initElements(driver, PageAccueil.class);
	}
	*/
}
