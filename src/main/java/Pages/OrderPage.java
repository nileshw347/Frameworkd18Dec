package Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class OrderPage extends TestBase{

	@FindBy(xpath = "//span[text()='Orders']") private WebElement clickOrderLink;
	@FindBy(xpath = "//span[text()='GTT']") private WebElement clickGTTLink;
	@FindBy(xpath = "//button[text()='New GTT ']") private WebElement newGTTBtn;
	@FindBy(xpath = "(//input[@type='text'])[2]") private WebElement searchTextBox;
	@FindBy(xpath = "//li[@class='search-result-item selected']") private WebElement clickInfy;
	@FindBy(xpath = "(//button[@class='button-outline button-blue'])[1]") private WebElement createGttBtn;
	@FindBy(xpath = "(//input[@type='number'])[1]") private WebElement triggerPriceBox;
	@FindBy(xpath = "(//input[@type='number'])[3]") private WebElement qtyTextBox;
	@FindBy(xpath = "(//input[@type='number'])[4]") private WebElement priceTextBox;
	@FindBy(xpath = "//button[@class='place button-blue1']") private WebElement placeOrderBtn;
	
	public OrderPage() throws IOException
	{
		super();
		PageFactory.initElements(driver, this);
	}
	public void clickOrderLink()
	{
		clickOrderLink.click();
	}
	public void clickGTTLink()
	{
		clickGTTLink.click();
	}
	public void placeOrder() throws InterruptedException, EncryptedDocumentException, IOException
	{
		newGTTBtn.click();
		Thread.sleep(1000);
		searchTextBox.sendKeys(Utility.Util1.readExcel(3, 1));
		Thread.sleep(1000);
		clickInfy.click();
		Thread.sleep(1000);
		createGttBtn.click();
		Thread.sleep(1000);
		triggerPriceBox.clear();
		Thread.sleep(1000);
		triggerPriceBox.sendKeys(Utility.Util1.readExcel(3, 2));
		Thread.sleep(1000);
		qtyTextBox.clear();
		qtyTextBox.sendKeys(Utility.Util1.readExcel(3, 3));
		Thread.sleep(1000);
		priceTextBox.clear();
		priceTextBox.sendKeys(Utility.Util1.readExcel(3, 4));
		Thread.sleep(1000);
		placeOrderBtn.click();
		
	}
	
}
