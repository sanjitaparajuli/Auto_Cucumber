package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.ChangeBackgroundColorPage;
import page.TestBase;

public class Webelement_Step_Defn extends TestBase {
	ChangeBackgroundColorPage changeBackgroundColorPageObj;

	@Before
	public void beforeRun() {
		initDriver();
		changeBackgroundColorPageObj = PageFactory.initElements(driver, ChangeBackgroundColorPage.class);
	}

	@Given("^User is on the TechFios page$")
	public void user_is_on_the_TechFios_page() throws Throwable {
		driver.get("https://techfios.com/test/101/");
	}

	@Given("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists() throws InterruptedException {
		changeBackgroundColorPageObj.clicksSET_SKY_BLUE_BACKGROUND_ELEMENT();
		Thread.sleep(2000);
	}

	@When("^I click on first button$")
	public void I_click_on_first_button() {
		changeBackgroundColorPageObj.clicksSET_SKY_BLUE_BACKGROUND_ELEMENT();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		/*
		 * String expectedTitle = "Set SkyBlue Background"; String actualTitle =
		 * changeBackgroundColorPageObj.getPageTitle();
		 * Assert.assertEquals(expectedTitle, actualTitle);
		 */
		changeBackgroundColorPageObj.clicksSET_SKY_BLUE_BACKGROUND_ELEMENT();
	}

	@Given("^Set SkyWhite Background button exists$")
	public void set_SkyWhite_Background_button_exists() {
		changeBackgroundColorPageObj.clicksSET_SKYWHITE_BACKGROUND_ELEMENT();
	}

	@When("^I click on second button$")
	public void I_click_on_second_button() {
		changeBackgroundColorPageObj.clicksSET_SKYWHITE_BACKGROUND_ELEMENT();
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable {
		/*
		 * String expectedTitle = "Set White Background"; String actualTitle =
		 * changeBackgroundColorPageObj.getPageTitle();
		 * Assert.assertEquals(expectedTitle, actualTitle);
		 */
		changeBackgroundColorPageObj.clicksSET_SKYWHITE_BACKGROUND_ELEMENT();
		Thread.sleep(4000);
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();

	}

}
