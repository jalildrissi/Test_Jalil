package jpetstorePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DogsnPage {
	
	@FindBy(xpath =  "//h2[contains(text(),'Dogs')]")
	public WebElement titre;
	
	@FindBy(xpath =  "/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/th[1]")
	public WebElement product_Id;
	
	@FindBy(xpath =  "/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/th[2]")
	public WebElement product_Name;
	
	@FindBy(xpath =  "/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[4]/td[1]")
	public WebElement dalmation_code_catg;
	
	@FindBy(xpath =  "/html[1]/body[1]/div[2]/div[2]/table[1]/tbody[1]/tr[4]/td[2]")
	public WebElement dalmation_catg;
	
	
	public DalmationPage click_Dogs_lien(WebDriver driver) {
		dalmation_code_catg.click();
		return PageFactory.initElements(driver, DalmationPage.class);
	}
	
	

}
