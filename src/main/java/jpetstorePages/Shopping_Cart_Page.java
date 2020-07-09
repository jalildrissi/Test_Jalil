package jpetstorePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shopping_Cart_Page {
	
	@FindBy(xpath =  "//h2[contains(text(),'Shopping Cart')]")
	public WebElement titre_Shopping_cart;
	
	@FindBy(xpath =  "//form[1]/table[1]/tbody[1]/tr[2]/td[5]/input[1]")
	public WebElement input_quantity;
	
	@FindBy(xpath =  "//body//td[7]")
	public WebElement total_cost;
	
	@FindBy(name =  "updateCartQuantities")
	public WebElement updateCartQuantities;
	
	
	public void modifierQuantite (String quantite) {
		
		input_quantity.clear();
		input_quantity.sendKeys(quantite);
		
	}
	
	public void update_Cart_Quantities () {
		updateCartQuantities.click();
	}
	
	public String getTotalCost () {
		String total = total_cost.getText();
		return total;
		
	}


}
