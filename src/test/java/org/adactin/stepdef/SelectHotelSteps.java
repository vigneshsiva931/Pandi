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

public class SelectHotelSteps {
	@Given("Enter Valid Detail Search Hotel")
	public void enter_Valid_Detail_Search_Hotel() {
	}
	
	
	WebDriver driver;
	@When("verify continue Enable proceed")
	public void verify_continue_Enable_proceed() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.adactin.com/HotelApp/");
		 WebElement userName = driver.findElement(By.id("username"));
		 userName.sendKeys("VigneshPandi1");
		 WebElement passWord = driver.findElement(By.id("password"));
		 passWord.sendKeys("Pandi@321");	
		 WebElement Submit = driver.findElement(By.id("login"));
		 Submit.click();  
		 String title = driver.getTitle();
		 Assert.assertTrue(title.contains("Search Hotel"));
		 System.out.println("Sucessful Login");
		 WebElement location=driver.findElement(By.id("location")); 
		 location.sendKeys("Sydney");
		 WebElement hotels=driver.findElement(By.id("hotels")); 
		 hotels.sendKeys("Hotel Creek");
		 WebElement room_type=driver.findElement(By.id("room_type")); 
		 room_type.sendKeys("Standard");
		 WebElement room_nos=driver.findElement(By.id("room_nos")); 
		 room_nos.sendKeys("1 - One");
		 WebElement submit=driver.findElement(By.xpath("//input[@type='submit']")); 
		 submit.click();
	    WebElement radiobutton_0 = driver.findElement(By.id("radiobutton_0"));
	    if (radiobutton_0.isEnabled())
	    {
	    	radiobutton_0.click();
	    	WebElement cont = driver.findElement(By.id("continue"));
	    	cont.click();
	    }
	}

	@Then("Check all Options Enable")
	public void check_all_Options_Enable() {
	    String title45 = driver.getTitle();
	    System.out.println(title45);
	    Assert.assertTrue(title45.contains("Book A Hotel"));
	}

}
