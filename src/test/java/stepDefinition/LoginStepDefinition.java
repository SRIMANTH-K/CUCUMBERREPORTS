package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;
	
	
	
	@Given("^User is login page$")
	public void user_is_login_page()  {
	    
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

		
		
		
		
		
	}

	@When("^title of the page is guruhomeapge$")
	public void title_of_the_page_is_guruhomeapge() {
	    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String title = driver.getTitle();
		System.out.println("This is Valid Test");
		System.out.println("Title of the webpage is :"+ title);
		Assert.assertEquals("OrangeHRM", "OrangeHRM1");
		
	}

	@Then("^enter the username and password$")
	public void enter_the_username_and_password() {
		driver.findElement(By.xpath("//*[@id='txtUsername']")).click();
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");

		driver.findElement(By.xpath("//*[@id='txtPassword']")).click();

		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	}

	@And("^close the browser$")
	public void close_the_browser()  {
	 
		driver.close();
		
		
		
		
	}

	
	
	
	
	
	
	
	
}
