package StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hooks {
public static WebDriver driver;
	@Before
	public void StartTest() {
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	@After
	public void TearDown() {
		driver.quit();
	}
}
