package org.steps;

import org.helper_class.Base_class;
import org.opencart_pom.Opencart_pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import runner.Opencart_run;


public class Step_def extends Base_class {
	
	
	WebDriver driver = Opencart_run.driver;
	
	Opencart_pom op = new Opencart_pom(driver);

	@Given("launch the url")
	public void launch_the_url() {
		
		maxWindow(driver);
		launchUrl(driver, "https://www.opencart.com/");
	}

	@Given("User click the feature button")
	public void user_click_the_feature_button() {
		 toClickButton(driver, op.getFeature());
		
	}

	@Given("User Scrolldown the page")
	public void user_scrolldown_the_page() {
		toScrollDown(driver, op.getScroll());
	}

	@Given("User click the unlimited everything")
	public void user_click_the_unlimited_everything() {
		
		toClickButton(driver, op.getClick_unlimited());
		
	}

}
