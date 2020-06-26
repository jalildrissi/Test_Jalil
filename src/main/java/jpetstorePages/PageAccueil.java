package jpetstorePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageAccueil {
	
	//WebDriver driver;
	// private By login = By.xpath("//a[contains(text(),'Sign In')]");
	
	@FindBy(xpath = "//a[contains(text(),'Sign In')]")
	public WebElement btn_login;

	
	@FindBy(xpath = "//div[@id='WelcomeContent']//div[1]")
	public WebElement textBienvenue;

	public LoginPage clickLogin (WebDriver driver) {
		btn_login.click();
		return PageFactory.initElements(driver, LoginPage.class);
	}
	
	public String getTextBienvenue () {
		String texte;
		texte = textBienvenue.getText();
		return texte;
	}
	
	/* TO DO
	public void clickElement (WebElement element) {
		
	}
*/
}
