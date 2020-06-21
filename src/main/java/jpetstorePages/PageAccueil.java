package jpetstorePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageAccueil {
	
	WebDriver driver;
	private By login = By.xpath("//a[contains(text(),'Sign In')]");
	
	public PageAccueil (WebDriver driver) {
		
		this.driver = driver;
	}
	
	public LoginPage clickLogin () {
		driver.findElement(login).click();
		return new LoginPage(driver);
	}
	
	/* TO DO
	public void clickElement (WebElement element) {
		
	}
*/
}
