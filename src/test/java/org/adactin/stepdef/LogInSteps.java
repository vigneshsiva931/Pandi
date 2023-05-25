package org.adactin.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LogInSteps  {
	WebDriver driver;
	@Given("User Launch Addactin Login")
	public void user_Launch_Addactin_Login() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
	}

	@When("User Enter UserName and PassWord")
	public void user_Enter_UserName_and_PassWord() {
		 WebElement userName = driver.findElement(By.id("username"));
		   userName.sendKeys("VigneshPandi1");
		   WebElement passWord = driver.findElement(By.id("password"));
		   passWord.sendKeys("Pandi@321");
	}

	@When("Click Login button")
	public void click_Login_button() {
		 WebElement Submit = driver.findElement(By.id("login"));
		 Submit.click();  
	}
	
	
	
	@When("User Enter {string} and {string}")
	public void user_Enter_and(String s1, String s2) {
		 WebElement userName = driver.findElement(By.id("username"));
		   userName.sendKeys(s1);
		   WebElement passWord = driver.findElement(By.id("password"));
		   passWord.sendKeys(s2);
	}
	    

	@Then("check login sucessful")
	public void check_login_sucessful() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("Search Hotel"));
		System.out.println("Sucessful Login");
	}

}
