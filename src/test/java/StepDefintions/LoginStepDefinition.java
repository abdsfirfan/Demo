package StepDefintions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	
	public static WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\chrome driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://classic.crmpro.com/index.html");
	    driver.manage().window().maximize();    
	}	

	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws InterruptedException {
		System.out.println("driver=" + driver);		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10);
		driver.findElement(By.name("username")).sendKeys("abdsfirfan");
		driver.findElement(By.name("password")).sendKeys("abdulsafia");
	}

	@When("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("^user should navigate to home page$")
	public void user_should_navigate_to_home_page() throws Throwable {
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
