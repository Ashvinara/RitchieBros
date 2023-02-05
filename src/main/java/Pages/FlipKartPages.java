package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import interviewEsteeLauder.CommonElements;

public class FlipKartPages {
	
	
	@FindBy(how = How.XPATH, using = CommonElements.searchItems1)
	WebElement searchItems1;

	@FindBy(how = How.XPATH, using = CommonElements.productSelect1)
	WebElement productSelect1;

	@FindBy(how = How.XPATH, using = CommonElements.cart1)
	WebElement cart1;

	@FindBy(how = How.XPATH, using = CommonElements.coverageSelect)
	WebElement coverageSelect;

	@FindBy(how = How.XPATH, using = CommonElements.placeOrder)
	WebElement placeOrder;

	public void FlipKartShopping(String chooseProduct1) throws InterruptedException {
		searchItems1.sendKeys(chooseProduct1);
		Thread.sleep(2000);
		productSelect1.click();
		Thread.sleep(2000);
		cart1.click();
		Thread.sleep(2000);
		placeOrder.click();
		
			
		System.out.println(placeOrder.getText());
	
	
	}
}
