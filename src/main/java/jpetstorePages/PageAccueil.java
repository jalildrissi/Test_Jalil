package jpetstorePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageAccueil {
	
	WebDriver driver;
	// private By login = By.xpath("//a[contains(text(),'Sign In')]");
	
	@FindBy(xpath = "//a[contains(text(),'Sign In')]")
	WebElement btn_login;
	
	public PageAccueil (WebDriver driver) {
		
		this.driver = driver;
	}
	


	public LoginPage clickLogin (WebDriver driver) {
		btn_login.click();
		return new LoginPage(driver);
	}
	
	/* TO DO
	public void clickElement (WebElement element) {
		
	}
*/
}
