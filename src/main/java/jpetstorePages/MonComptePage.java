package jpetstorePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonComptePage {
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Sign Out')]")
	public WebElement btn_quitter_mon_compte;
	
	@FindBy(xpath = "//a[contains(text(),'My Account')]")
	public WebElement btn_mon_compte;

	public InscriptionPage modifier_info_de_mon_compte(WebDriver driver) {
		btn_mon_compte.click();
		return PageFactory.initElements(driver, InscriptionPage.class);
	}
	
	public PageAccueil quitter_mon_compte (WebDriver driver) {

		btn_quitter_mon_compte.click();

		return PageFactory.initElements(driver, PageAccueil.class);
		
	}

}
	
