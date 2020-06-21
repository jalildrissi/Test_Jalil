package jpetstorePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MonCompte {

	WebDriver driver;
	String textBienvenue;
	
	public MonCompte (WebDriver driver) {
		this.driver = driver;
	}
	
	//WebElement compte = driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
	WebElement quitterMonCompte = driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
	WebElement bienvenue = driver.findElement(By.xpath("//div[@id='WelcomeContent']//div[1]"));
	
	
	public String getTextBienvenu () {
		bienvenue.getText();
		return textBienvenue;
	}
	
	public PageAccueil quitterCompte () {
		quitterMonCompte.click();
		
		return new PageAccueil (driver);	
	}
}
