package Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class StartInvesting extends TestBase {

	@FindBy(xpath = "//button[text()='Start investing ']") private WebElement srtInvBtn;
	@FindBy(xpath = "(//input[@type='text'])[2]") private WebElement searchStockBox;
	@FindBy(xpath = "//li[@class='search-result-item selected']") private WebElement TCSstock;
	@FindBy(xpath = "//button[text()='Buy ']") private WebElement buyBtn;
	@FindBy(xpath = "//input[@step='1']") private WebElement qtyBox;
	@FindBy(xpath = "(//input[@type='number'])[2]") private WebElement priceBox;
	@FindBy(xpath = "//label[@for='switch-140']") private WebElement toggleBuySell;
	@FindBy(xpath = "//button[@class='button-outline cancel']") private WebElement cancleBtn;
	
	public StartInvesting() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void clickStartInv() throws InterruptedException
	{
		srtInvBtn.click();
		Thread.sleep(1000);
	}
	public void buyStock() throws EncryptedDocumentException, IOException, InterruptedException
	{
		searchStockBox.sendKeys(Utility.Util1.readExcel(1, 1));
		Thread.sleep(1000);
		TCSstock.click();
		Thread.sleep(1000);
		buyBtn.click();
		Thread.sleep(1000);
		qtyBox.clear();
		Thread.sleep(1000);
		qtyBox.sendKeys(Utility.Util1.readExcel(1, 3));
		Thread.sleep(1000);
		priceBox.clear();
		Thread.sleep(1000);
		priceBox.sendKeys(Utility.Util1.readExcel(1, 4));
		Thread.sleep(1000);
		cancleBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
