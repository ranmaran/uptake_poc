package uptake_poc;

import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import uptake_page.Uptake_home;
import uptake_page.Uptake_prdt;

public class Uptake_Nav {
	
	private static WebDriver driver = null;
	

	public static void main(String[] args) {
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranma\\Documents\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.uptake.com/");
		String HmeHeading = Uptake_home.hme(driver).getText();
		Boolean Hmecheck = HmeHeading.contains("TO BREAK");
		if (Hmecheck) {
			driver.get("https://www.uptake.com/products");
			String PrdHeading = Uptake_prdt.prd(driver).getText();
			Boolean Prdcheck = PrdHeading.contains("FASTER RESULTS");
			if (Prdcheck) {
				System.out.println("Homepage and Products page Loaded Successfully");
			}
			else
			{
				System.out.println("Products page not loaded");
			}
		}
		else
		{
			System.out.println("Homepage not loaded");
		}
			
		driver.quit();
		

	}

}
