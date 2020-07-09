package jpetstorePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DalmationPage {
	
	
	@FindBy(xpath =  "//h2[contains(text(),'Dalmation')]")
	public WebElement titre_Dalmation;
	
	@FindBy(xpath =  "//table[1]/tbody[1]/tr[2]/td[1]")
	public WebElement Spotless_Male_Puppy_lien;
	
	@FindBy(xpath =  "//table[1]/tbody[1]/tr[2]/td[3]")
	public WebElement Spotless_Male_Puppy_Description;
	
	@FindBy(xpath =  "//table[1]/tbody[1]/tr[2]/td[4]")
	public WebElement Spotless_Male_Puppy_Price;
	
	@FindBy(xpath =  "//table[1]/tbody[1]/tr[2]/td[5]")
	public WebElement Spotless_Male_Puppy_Btn_Add;
	
	
	public String getTitrePage () {
		String titre = titre_Dalmation.getText();
		return titre;
	}
	
	public String getDescription_spotless_male () {
		String description = Spotless_Male_Puppy_Description.getText();
		return description;
	}
	//recuperer le prix du chien
	public String getPrice_spotless_male () {
		
		String price = Spotless_Male_Puppy_Price.getText();
		
		return price;
	}
	
	//Ajouter le chien male dans le panier et aller sur la page de shopping
	public Shopping_Cart_Page click_Add_spotless_male (WebDriver driver) {
		
		Spotless_Male_Puppy_Btn_Add.click();
		
		return PageFactory.initElements(driver, Shopping_Cart_Page.class);
		
	}
	//Cliquer sur le lien pour aller sur la page du chien
	public Spotless_Male_Puppy_Dalmation_Page cliquer_lien_spotless_male (WebDriver driver) {
		
		Spotless_Male_Puppy_lien.click();
		
	return PageFactory.initElements(driver, Spotless_Male_Puppy_Dalmation_Page.class);
	}
	
	

}
