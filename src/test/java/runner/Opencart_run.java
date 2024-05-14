package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\User\\eclipse-workspace2\\opencartpage\\src\\test\\java\\opencart_Features",
		glue="org.steps",
		dryRun=true
		
		
		)


public class Opencart_run {
	public static WebDriver driver;

	@BeforeClass

	public static void browser() {

		driver = new ChromeDriver();
	}
	
	@AfterClass
	public static void broclose() {
		driver.quit();

	}
	
	
	
	
	
	

}
