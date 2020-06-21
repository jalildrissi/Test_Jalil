package jpetstorePages;

import org.openqa.selenium.*;

public class LoginPage {
	
	WebDriver driver;
	String username;
	String password;
	WebElement UserName = driver.findElement(By.xpath("//input[@name='username']"));
	WebElement PassWord = driver.findElement(By.xpath("//input[@name='username']"));
	WebElement Login = driver.findElement(By.xpath("//input[@id='login']"));
	
	// geter and seter 
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void setUserName(String username) {
		this.username= username;
	}
	public void setPassord(String password) {
		this.password= password;
	}
	public String  getPassord() {
		return password;
	}
	public String  getUserName() {
		return username;
	}

	// Saisir le nom d'utilisateur et le mdp
	
	public void SaisirUsername(String username) {
		UserName.sendKeys(username);
	}
	
	public void SaisirPassord (String password) {
		PassWord.sendKeys(password);
	}
	
	public MonCompte cliquerlogin() {
		Login.click();
		return new MonCompte (driver);
	}
}
