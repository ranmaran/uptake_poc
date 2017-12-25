package uptake_page;

import org.openqa.selenium.*;

public class Uptake_home {
	
	private static WebElement element = null;
	

	public static WebElement hme(WebDriver driver)
		{
			element= driver.findElement(By.className("hero-heading__heading"));
			return element;
		}

}
