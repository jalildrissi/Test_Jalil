package jpetstorePages;

import org.openqa.selenium.*;

public class LoginPage {
	
	WebDriver driver;
	String username;
	String password;
	WebElement champ_username = driver.findElement(By.xpath("//input[@name='username']"));
	WebElement champ_password = driver.findElement(By.xpath("//input[@name='username']"));
	WebElement bouton_login = driver.findElement(By.xpath("//input[@id='login']"));
	
	// geter and seter 
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	


	// Saisir le nom d'utilisateur et le mdp
	
	public void saisirUsername(String user_name) {
		champ_username.sendKeys(user_name);
	}
	
	public void saisirPassword (String password) {
		champ_password.sendKeys(password);
	}
	
	public MonCompte cliquerlogin() {
		bouton_login.click();
		return new MonCompte (driver);
	}
}
