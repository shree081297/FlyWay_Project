package StepDefs;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class FlywayStepDefinition {
	WebDriver driver = Hooks.driver;

//	@Given("I have launched the application")
//	public void i_have_launched_the_application() {
//		driver.get("http://localhost:8081/FlyAway/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
//
//	}
//
//	@When("I have to click on Login\\/signup button")
//	public void i_have_to_click_on_Login_signup_button() {
//		WebElement signupbtn = driver.findElement(By.xpath("//a[text()='Login/Signup']"));
//		signupbtn.click();
//	}
//
//	@When("I have to validate the FLYAWAY - MEMBER LOGIN page is displayed")
//	public void i_have_to_validate_the_FLYAWAY_MEMBER_LOGIN_page_is_displayed() {
//		WebElement page = driver.findElement(By.xpath("//h3[text()=' FLYAWAY - MEMBER LOGIN ']"));
//		String actPage = page.getText();
//		String ExpPage = " FLYAWAY - MEMBER LOGIN ";
//		if (actPage.equals(ExpPage)) {
//			System.out.println("User landed on  FLYAWAY - MEMBER LOGIN page");
//		} else {
//			System.out.println("User unable to land on  FLYAWAY - MEMBER LOGIN page");
//		}
//
//	}
//
//	@When("I have to click on Not a Member? Signup button")
//	public void i_have_to_click_on_Not_a_Member_Signup_button() {
//		WebElement NotaMemberBtn = driver.findElement(By.xpath("//a[text()='Not a member? Signup']"));
//		NotaMemberBtn.click();
//	}
//
//	@Then("I have to land on FLYAWAY - MEMBER REGISTRATION page validate the title of the page")
//	public void i_have_to_land_on_FLYAWAY_MEMBER_REGISTRATION_page_validate_the_title_of_the_page() {
//		WebElement pagename = driver.findElement(By.xpath("//h3[text()=' FLYAWAY - MEMBER REGISTRATION ']"));
//		String actname = pagename.getText();
//		String Expname = " FLYAWAY - MEMBER REGISTRATION ";
//		if (actname.equals(Expname)) {
//			System.out.println("User entered to  FLYAWAY - MEMBER REGISTRATION  page");
//		} else {
//			System.out.println("user unable to enter  FLYAWAY - MEMBER REGISTRATION  page");
//		}
//	}
//
//	@Then("I have to enter Signup details")
//	public void i_have_to_enter_Signup_details(DataTable dataTable)  {
//
//		List<Map<String, String>> testdata = dataTable.asMaps(String.class, String.class);
//		System.out.println(testdata);
//		for (Map<String, String> e : testdata) {
//			WebElement email = driver.findElement(By.xpath("//input[@name='email_id']"));
//			email.sendKeys(e.get("Email"));
//			WebElement pwd = driver.findElement(By.xpath("//input[@name='pwd']"));
//			pwd.sendKeys(e.get("Password"));
//			WebElement confirmpwd = driver.findElement(By.xpath("//input[@name='pwd2']"));
//			confirmpwd.sendKeys(e.get("Confirm_Password"));
//			WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
//			name.sendKeys(e.get("Name"));
//			WebElement address = driver.findElement(By.xpath("//input[@name='address']"));
//			address.sendKeys(e.get("Address"));
//			WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
//			city.sendKeys(e.get("City"));
//
//		}
//	}

//	@Then("After clicking on signup button click on Login to continue checking flights")
//	public void after_clicking_on_signup_button_click_on_Login_to_continue_checking_flights() {
//
//	}
//
//	@Then("I have to land on LoginPage")
//	public void i_have_to_land_on_LoginPage() {
//
//	}
//
//	@Then("After I enter login details")
//	public void after_I_enter_login_details(io.cucumber.datatable.DataTable dataTable) {
//
//	}
//
//	@Then("I have to land on Homepage")
//	public void i_have_to_land_on_Homepage() {
//
//	}
//
//	@Then("I have to click on Home")
//	public void i_have_to_click_on_Home() {
//
//	}
//
//	@Then("Select the flights from Bangalore to Chennai and click on submit button")
//	public void select_the_flights_from_Bangalore_to_Chennai_and_click_on_submit_button() {
//
//	}
//
//	@Then("Flights shout be displayed on the screen")
//	public void flights_shout_be_displayed_on_the_screen() {
//
//	}
//
//	@Then("click on Book Flight")
//	public void click_on_Book_Flight() {
//
//	}
//
//	@Then("Click on complete booking")
//	public void click_on_complete_booking() {
//
//	}
//
//	@Then("click on See your bookings")
//	public void click_on_See_your_bookings() {
//
//	}
//
//	@Then("I have to land on Your bookings page")
//	public void i_have_to_land_on_Your_bookings_page() {
//
//	}
//
//	@Then("validate the Airline and cost")
//	public void validate_the_Airline_and_cost() {
//
//	}

}
