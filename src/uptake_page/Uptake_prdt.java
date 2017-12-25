package uptake_page;

import org.openqa.selenium.*;

public class Uptake_prdt {
	
	private static WebElement element = null;
	
	public static WebElement prd (WebDriver driver) {
		element= driver.findElement(By.className("hero-heading__heading"));
		return element;
	}

}
