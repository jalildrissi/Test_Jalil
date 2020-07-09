package dogs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import base.BaseTests;
import jpetstorePages.DalmationPage;
import jpetstorePages.DogsnPage;
import jpetstorePages.PageAccueil;
import jpetstorePages.Shopping_Cart_Page;

public class Add_Dalmation_MaleTo_shopping_cart_Test extends BaseTests{
	
	@Test
	public void ajouter_Dalmation_male() {
		
		PageAccueil pageAccueil = PageFactory.initElements(driver, PageAccueil.class);
		
		DogsnPage dogs = pageAccueil.click_Dogs_lien(driver);
		
		DalmationPage dalmation = dogs.click_Dogs_lien(driver);
	
		System.out.println(dalmation.getDescription_spotless_male());
		assertEquals("erreur dans la description", "Spotless Male Puppy Dalmation", dalmation.getDescription_spotless_male());
	
		Shopping_Cart_Page shop = dalmation.click_Add_spotless_male(driver);
		
		shop.modifierQuantite("2");
		
		shop.update_Cart_Quantities();
		
		assertEquals("erreur dans le total", "$37.00", shop.getTotalCost() );
		
		System.out.println("le total est de : " +shop.getTotalCost());
		
		
	}
	
	

}
