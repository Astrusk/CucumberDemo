package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FrontSteps {
	WebDriver driver;

	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void after() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver.get("http://demo.frontaccounting.eu/");
	}

	@When("user enters username as {string} & password as {string} & click on login")
	public void user_enters_username_as_password_as_click_on_login(String user, String pass) {

		driver.findElement(By.name("user_name_entry_field")).clear();
		driver.findElement(By.name("user_name_entry_field")).sendKeys(user);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("SubmitUser")).click();
	}

	@Then("login {string} be happen")
	public void login_be_happen(String status) {
		if (status.equals("should")) {
			if (driver.getTitle().equals("Main Menu")) {
				System.out.println("Positive test pass");
			} else {
				System.out.println("Positive test fail");
				Assert.fail("Positive test fail");}
		} else if (status.equals("shouldNot")) {
			if (driver.getTitle().equals("Main Menu")) {
				System.out.println("Negative test fail");
			} else
				System.out.println("Negative test pass");
		}
	}
}
