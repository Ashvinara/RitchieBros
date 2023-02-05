package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import interviewEsteeLauder.CommonElements;

public class AmazonPages {

	@FindBy(how = How.XPATH, using = CommonElements.searchItems)
	WebElement searchItems;

	@FindBy(how = How.XPATH, using = CommonElements.productSelect)
	WebElement productSelect;

	@FindBy(how = How.XPATH, using = CommonElements.cart)
	WebElement cart;

	@FindBy(how = How.XPATH, using = CommonElements.coverageSelect)
	WebElement coverageSelect;

	@FindBy(how = How.XPATH, using = CommonElements.cartConfirmation)
	WebElement cartConfirmation;

	public void AmazonShopping(String chooseProduct) throws InterruptedException {
		searchItems.sendKeys(chooseProduct);
		Thread.sleep(2000);
		productSelect.click();
		Thread.sleep(2000);
		cart.click();
		Thread.sleep(2000);
		coverageSelect.click();
		
		System.out.println(cartConfirmation.getText());

	}
}
