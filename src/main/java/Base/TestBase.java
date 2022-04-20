package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException
	{
		prop = new Properties();
		FileInputStream file = new FileInputStream("E:\\software testing videos\\Automation\\Automation setup files\\eclipse\\Framework18Dec\\Config\\Config1.properties");
		prop.load(file);
	}
	
	public static void initialization() throws EncryptedDocumentException, IOException
	{
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver(Options);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
//		System.out.println(prop.getProperty("url"));
//		driver.get(Utility.Util1.readExcel(0, 0));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
