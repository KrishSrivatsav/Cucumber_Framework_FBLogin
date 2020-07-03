package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefination {

	WebDriver driver;
	
	 @Given("^Initialize the browser with chrome$")
	    public void initialize_the_browser_with_chrome() throws Throwable {
		 	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
			
		 	driver=new ChromeDriver();
	    }


	 @And("^Navigate to \"([^\"]*)\" site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {
	     
		driver.get(strArg1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	 @When("^User enters username (.+) and password (.+) and logs in$")
	    public void user_enters_username_and_password_and_logs_in(String username, String password) throws Throwable {
		 	driver.findElement(By.xpath("//*[@name='email']")).sendKeys("krackerkrish@gmail.com");
			driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("vaalukrish");
			
			driver.findElement(By.xpath("//*[@type='submit']")).click();
	    }

	 @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
		 System.out.println(driver.getTitle());
	    }

	 @And("^Verify that user is sucessfully logged in$")
	    public void verify_that_user_is_sucessfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(driver.getCurrentUrl());
	}

}