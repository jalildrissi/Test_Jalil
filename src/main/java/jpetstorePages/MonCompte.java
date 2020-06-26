package jpetstorePages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.*;

public class MonCompte {
	WebDriver driver;

	public MonCompte (WebDriver driver) {
		this.driver = driver;
	}
	String textBienvenue;
	private By  bienvenue = By.xpath("//div[@id='WelcomeContent']//div[1]");
	private By quitterMonCompte = By.xpath("//a[contains(text(),'Sign Out')]");
	
	
	public String getTextBienvenu () {
		driver.findElement(bienvenue).getText();
		return textBienvenue;
	}
	
	public PageAccueil quitterCompte (	WebDriver driver) {
		driver.findElement(quitterMonCompte).click();
		
		return 	PageFactory.initElements(driver, PageAccueil.class);
	}
}
