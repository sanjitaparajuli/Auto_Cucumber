package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChangeBackgroundColorPage {

	WebDriver driver;

	public ChangeBackgroundColorPage() {
		this.driver = driver;
	}

	// Element Library
	
	@FindBy(how = How.XPATH, using = "//button[@type='button' and @onclick='myFunctionSky()']")
	WebElement SET_SKY_BLUE_BACKGROUND_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//button[@type='button' and @onclick='myFunctionWhite()']")
	WebElement SET_SKYWHITE_BACKGROUND_ELEMENT;
	

	// Methods to interact with the elements
	
		public void clicksSET_SKY_BLUE_BACKGROUND_ELEMENT() {
			SET_SKY_BLUE_BACKGROUND_ELEMENT.click();
	}
		
		public void clicksSET_SKYWHITE_BACKGROUND_ELEMENT() {
			SET_SKYWHITE_BACKGROUND_ELEMENT.click();
	}	
	
	public String getPageTitle() {
		return driver.getTitle();
	}

}
