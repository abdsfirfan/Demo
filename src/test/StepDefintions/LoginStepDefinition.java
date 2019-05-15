package StepDefintions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class LoginStepDefinition {
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91860\\Desktop\\chrome driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://classic.crmpro.com/index.html");
		
		
	}
	
	@When("^user enters username and password$")
	public void user_enters_username_and_password() {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abdsfirfan");		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abdulsafia");
		
	    throw new PendingException();
	}

	@When("^clicks on login button$")
	public void clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	    throw new PendingException();
	}

	@Then("^user should navigate to home page$")
	public void user_should_navigate_to_home_page() {
		String title=driver.getTitle();
		System.out.println(title);
	    throw new PendingException();
	}

}
