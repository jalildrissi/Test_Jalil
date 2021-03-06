package jpetstorePages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//input[@name='username']")
	private WebElement champ_username;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement champ_password;

	@FindBy(xpath = "//input[@name='signon']")
	private WebElement bouton_login;

	@FindBy(xpath = "//a[contains(text(),'Register Now!')]")
	public WebElement Register_Now;

	// WebElement champ_username =
	// driver.findElement(By.xpath("//input[@name='username']"));
	// WebElement champ_password =
	// driver.findElement(By.xpath("//input[@name='username']"));
	// WebElement bouton_login =
	// driver.findElement(By.xpath("//input[@id='login']"));

	public MonComptePage cliquer_login(WebDriver driver, String username, String password) {

		champ_username.clear();
		champ_username.sendKeys(username);
		champ_password.clear();
		champ_password.sendKeys(password);
		bouton_login.click();

		return PageFactory.initElements(driver, MonComptePage.class);

	}
/*
	public MonComptePage se_connecter_mon_compte (WebDriver driver, String username, String password ) {
		
	}
	*/
	
	public InscriptionPage click_register_now(WebDriver driver) {
		Register_Now.click();
		return PageFactory.initElements(driver, InscriptionPage.class);
	}

}
