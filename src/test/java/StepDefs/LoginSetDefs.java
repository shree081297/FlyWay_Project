package StepDefs;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class LoginSetDefs {
	WebDriver driver = Hooks.driver;


@Given("I have landed on Loginpage of the application")
public void i_have_landed_on_Loginpage_of_the_application() {
    driver.get("http://localhost:8081/FlyAway/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
}

@When("I have to click on Sigup\\/Login button")
public void i_have_to_click_on_Sigup_Login_button() {
	WebElement loginBtn=driver.findElement(By.xpath("//a[text()='Login/Signup']"));
	loginBtn.click();
}

@When("I have to validate the Title")
public void i_have_to_validate_the_Title() {
    String actTitle=driver.getTitle();
    System.out.println(actTitle);
    String expTitle="Fly Away - Login";
    if(actTitle.equals(expTitle)) {
    	System.out.println("Title matched");
    }else {
    	System.out.println("Title mismatched");
    }
}

@When("I have to enter Valid Email and Valid password and click on Login button")
public void i_have_to_enter_Valid_Email_and_Valid_password_and_click_on_Login_button(io.cucumber.datatable.DataTable dataTable) {
	List<Map<String, String>> testdata = dataTable.asMaps(String.class, String.class);
	System.out.println(testdata);
	for (Map<String, String> e : testdata) {
		WebElement email=driver.findElement(By.xpath("//input[@name='email_id']"));
		email.sendKeys(e.get("Email"));
		WebElement pwd=driver.findElement(By.xpath("//input[@name='pwd']"));
		pwd.sendKeys(e.get("Password"));
		WebElement lgnBtn=driver.findElement(By.xpath("//button[text()='Login']"));
		lgnBtn.click();
		
	}
}

@Then("I have to land on Dashboard page")
public void i_have_to_land_on_Dashboard_page() {
   WebElement ActPage=driver.findElement(By.xpath("//h3[text()=' FLYAWAY - DASHBOARD ']"));
   String actPage=ActPage.getText();
   String ExpPage=" FLYAWAY - DASHBOARD ";
   if(actPage.equals(ExpPage)) {
	   System.out.println("User landed on DashBoard page");
   }else {
	   System.out.println("User ua=nable to land on DashBoard page");
   }
}

//@When("I have to click on Sigup\\/Login button for Invalid scenario")
//public void i_have_to_click_on_Sigup_Login_button_for_Invalid_scenario(io.cucumber.datatable.DataTable dataTable1) {
//	List<Map<String, String>> testdata1 = dataTable1.asMaps(String.class, String.class);
//	System.out.println(testdata1);
//	for (Map<String, String> e : testdata1) {
//		WebElement email1=driver.findElement(By.xpath("//input[@name='email_id']"));
//		email1.sendKeys(e.get("InValidEmail"));
//		WebElement pwd1=driver.findElement(By.xpath("//input[@name='pwd']"));
//		pwd1.sendKeys(e.get("InValidPassword"));
//		WebElement lgnBtn1=driver.findElement(By.xpath("//button[text()='Login']"));
//		lgnBtn1.click();
//	}
//}

@Given("I have landed on Loginpage of the application for invalid scenario")
public void i_have_landed_on_Loginpage_of_the_application_for_invalid_scenario() {
	 driver.get("http://localhost:8081/FlyAway/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
}
@When("I have to click on Sigup\\/Login button for Invalid scenario")
public void i_have_to_click_on_Sigup_Login_button_for_Invalid_scenario() {
	WebElement loginBtn=driver.findElement(By.xpath("//a[text()='Login/Signup']"));
	loginBtn.click();

}
@When("I have to validate the Title with invalid scenario")
public void i_have_to_validate_the_Title_with_invalid_scenario() {
	WebElement loginBtn=driver.findElement(By.xpath("//a[text()='Login/Signup']"));
	loginBtn.click();
}

@When("I have to enter InValid Email and InValid password and click on Login button")
public void i_have_to_enter_InValid_Email_and_InValid_password_and_click_on_Login_button(io.cucumber.datatable.DataTable dataTable1) {
	List<Map<String, String>> testdata1 = dataTable1.asMaps(String.class, String.class);
	System.out.println(testdata1);
	for (Map<String, String> e : testdata1) {
		WebElement email1=driver.findElement(By.xpath("//input[@name='email_id']"));
		email1.sendKeys(e.get("InValidEmail"));
		WebElement pwd1=driver.findElement(By.xpath("//input[@name='pwd']"));
		pwd1.sendKeys(e.get("InValidPassword"));
		WebElement lgnBtn1=driver.findElement(By.xpath("//button[text()='Login']"));
		lgnBtn1.click();
	}
}
@Then("I have to validate an error message")
public void i_have_to_validate_an_error_message() {
    //WebElement errorMess=driver.findElement(By.xpath("/html/body/text()[3]"));
    String actMess=driver.getTitle();
    String ExpMess="Fly Away - Login";
    if(actMess.equals(ExpMess)) {
    	System.out.println("User able to get error mess with invalid cred");
    }else {
    	System.out.println("user unable to get error mess");
    }
}

}
