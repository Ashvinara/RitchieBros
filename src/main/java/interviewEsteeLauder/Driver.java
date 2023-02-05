package interviewEsteeLauder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.AmazonPages;
import Pages.FlipKartPages;

public class Driver {
	static WebDriver driver;

	public static void getApplication(String url) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Java VJ\\Selenium Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\HP\\eclipse-workspace\\EcommerceEnd2End\\src\\main\\resources\\Ecommerce.properties");
		Properties pro = new Properties();
		pro.load(file);
		driver.get(pro.getProperty(url));
		driver.manage().window().maximize();
	}
	
	
	@BeforeMethod(enabled = false)
	public void launchApplication() throws IOException {
		
	}

	@Test
	public void orderPlacement() throws InterruptedException, IOException {
		getApplication("AmazonUrl");
		AmazonPages page = PageFactory.initElements(driver, AmazonPages.class);
				page.AmazonShopping("laptop" + Keys.ENTER);
	}

	@Test
	public void orderPlacement1() throws InterruptedException, IOException {
		getApplication("FlipKartUrl");
		FlipKartPages page = PageFactory.initElements(driver, FlipKartPages.class);
		page.FlipKartShopping("SAMSUNG Galaxy M12 Black 64 GB" + Keys.ENTER);
		
	}
	
	@AfterMethod(enabled = false)
	public void closeAppliction() {
		driver.quit();
	}

//@Test
//public void launchApplication1() throws IOException{
//	System.setProperty("webdriver.chrome.driver",
//			"D:\\Selenium Java VJ\\Selenium Downloads\\chromedriver_win32\\chromedriver.exe");
//
//	driver = new ChromeDriver();
//	FileInputStream file = new FileInputStream(
//			"C:\\Users\\HP\\eclipse-workspace\\EcommerceEnd2End\\src\\main\\resources\\Ecommerce.properties");
//	Properties pro1 = new Properties();
//	pro1.load(file);
//	driver.get(pro1.getProperty("FlipKartUrl"));
//	driver.manage().window().maximize();
//}
//
//@Test
//public void orderPlacement1() throws InterruptedException {
//	FlipKartPages page = PageFactory.initElements(driver, FlipKartPages.class);
//	page.FlipKartShopping("SAMSUNG Galaxy M12 Black 64 GB" + Keys.ENTER);
//	
//}
//
//@AfterTest
//public void closeAppliction1() {
//	driver.quit();
//	
//	
//}
}
