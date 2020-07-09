package jpetstorePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageAccueil {

	// WebDriver driver;
	// private By login = By.xpath("//a[contains(text(),'Sign In')]");

	@FindBy(linkText  = "Sign In")
	public WebElement btn_login;
	
	@FindBy(xpath = "//a[2]/img[1]")
	public WebElement dogs_lien;

	

	public LoginPage clickLogin(WebDriver driver) {
		btn_login.click();
		return PageFactory.initElements(driver, LoginPage.class);
	}
	
	public DogsnPage click_Dogs_lien(WebDriver driver) {
		dogs_lien.click();
		return PageFactory.initElements(driver, DogsnPage.class);
	}
	
	
}
