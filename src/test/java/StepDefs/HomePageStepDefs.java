package StepDefs;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class HomePageStepDefs {
	WebDriver driver = Hooks.driver;

	@Given("user should land on Loginpage of the application")
	public void user_should_land_on_Loginpage_of_the_application() {
		driver.get("http://localhost:8081/FlyAway/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}

	@When("user should click on Sigup\\/Login button")
	public void user_should_click_on_Sigup_Login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Login/Signup']"));
		loginBtn.click();
	}

	@When("user should validate the Title")
	public void user_should_validate_the_Title() {
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		String expTitle = "Fly Away - Login";
		if (actTitle.equals(expTitle)) {
			System.out.println("Title matched");
		} else {
			System.out.println("Title mismatched");
		}
	}

	@When("user should enter Valid Email and Valid password and click on Login button")
	public void user_should_enter_Valid_Email_and_Valid_password_and_click_on_Login_button(
			io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> testdata = dataTable.asMaps(String.class, String.class);
		System.out.println(testdata);
		for (Map<String, String> e : testdata) {
			WebElement email = driver.findElement(By.xpath("//input[@name='email_id']"));
			email.sendKeys(e.get("Email"));
			WebElement pwd = driver.findElement(By.xpath("//input[@name='pwd']"));
			pwd.sendKeys(e.get("Password"));
			WebElement lgnBtn = driver.findElement(By.xpath("//button[text()='Login']"));
			lgnBtn.click();
		}
	}

	@Then("user should  land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {
		WebElement ActPage = driver.findElement(By.xpath("//h3[text()=' FLYAWAY - DASHBOARD ']"));
		String actPage = ActPage.getText();
		String ExpPage = " FLYAWAY - DASHBOARD ";
		if (actPage.equals(ExpPage)) {
			System.out.println("User landed on DashBoard page");
		} else {
			System.out.println("User ua=nable to land on DashBoard page");
		}
	}

	@When("user should  land on Dashboard page validate the login page")
	public void user_should_land_on_Dashboard_page_validate_the_login_page() {
		WebElement page = driver.findElement(By.xpath("//h3[text()=' FLYAWAY - DASHBOARD ']"));
		String actpage = page.getText();
		String expPage = "FLYAWAY - DASHBOARD";
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		if (actpage.equals(expPage)) {
			System.out.println("user landed on Homepage");
		} else {
			System.out.println("user unable to land on Homepage");
		}
	}

	@When("I have to click on Home")
	public void i_have_to_click_on_Home() {
		WebElement homebtn = driver.findElement(By.xpath("//a[text()='Home']"));
		homebtn.click();
	}

	@Then("Select the flights from Bangalore to Chennai and click on submit button")
	public void select_the_flights_from_Bangalore_to_Chennai_and_click_on_submit_button() {
		Select from=new Select(driver.findElement(By.xpath("//select[@name='source']")));
		from.selectByVisibleText("Bangalore");
		Select to=new Select(driver.findElement(By.xpath("//select[@name='destination']")));
		to.selectByVisibleText("Hyderabad");
		WebElement submitbtn=driver.findElement(By.xpath("//button[text()='Submit']"));
		submitbtn.click();
	}

	@Then("Flights shout be displayed on the screen")
	public void flights_shout_be_displayed_on_the_screen() {
		WebElement flights=driver.findElement(By.xpath("(//tr/td)[12]"));
		String actflight=flights.getText();
		String expFlight="Vistara";
		if(actflight.equals(expFlight)) {
			System.out.println("Flight displayed sucessfully");
		}else {
			System.out.println("Flight not displayed");
		}
	}

	@Then("click on Book Flight")
	public void click_on_Book_Flight() {
		WebElement bookflight=driver.findElement(By.xpath("//a[text()='Book Flight']"));
		bookflight.click();
	}

	@Then("Click on complete booking")
	public void click_on_complete_booking() {
		WebElement cmptBooking=driver.findElement(By.xpath("//a[text()='Click to complete booking']"));
		cmptBooking.click();
	}

	@Then("click on See your bookings")
	public void click_on_See_your_bookings() {
		WebElement seeBookings=driver.findElement(By.xpath("//a[text()='See Your Bookings']"));
		seeBookings.click();
	}

	@Then("I have to land on Your bookings page")
	public void i_have_to_land_on_Your_bookings_page() {
		WebElement ValidatePage=driver.findElement(By.xpath("//h3[text()=' FLYAWAY - YOUR BOOKINGS ']"));
		String actPage=ValidatePage.getText();
		String expPage="FLYAWAY - YOUR BOOKINGS";
		if(actPage.equals(expPage)){
			System.out.println("User landed on Your Booking page");
		}else {
			System.out.println("User unable to lan d on Your Booking page");
		}
	}

	@Then("validate the Airline and cost")
	public void validate_the_Airline_and_cost() {
		WebElement price=driver.findElement(By.xpath("//tr[2]/td[5]"));
		String actPrice=price.getText();
		String Expprice="2500.00";
		if(actPrice.equals(Expprice)) {
			System.out.println("Price matched");
		}else {
			System.out.println("Price mismatched");
		}
	}

}
