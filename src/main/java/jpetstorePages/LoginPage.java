package jpetstorePages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement champ_username;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement champ_password;
	
	@FindBy(xpath = "//input[@id='login']")
	private WebElement bouton_login;
	
	//WebElement champ_username = driver.findElement(By.xpath("//input[@name='username']"));
	//WebElement champ_password = driver.findElement(By.xpath("//input[@name='username']"));
	//WebElement bouton_login = driver.findElement(By.xpath("//input[@id='login']"));
	
	public PageAccueil logIn (WebDriver driver, String username, String password) {
		
		champ_username.clear();
		champ_username.sendKeys(username);
		champ_password.clear();
		champ_password.sendKeys(password);
		bouton_login.click();
		
		return PageFactory.initElements(driver, PageAccueil.class);
		
		
	}


	
	
}
