package org.adactin.stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class SearchHotelSteps  {
	WebDriver driver;
	
	@Given("User Launch Addactin Login using Username Password")
	public void user_Launch_Addactin_Login_using_Username_Password() {
		
	}

	@When("Enter Valid Details Requiremnets")
	public void enter_Valid_Details_Requiremnets(DataTable d) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.adactin.com/HotelApp/");
		List<String> li = d.asList();
		 WebElement userName = driver.findElement(By.id("username"));
		 userName.sendKeys(li.get(0));
		 WebElement passWord = driver.findElement(By.id("password"));
		 passWord.sendKeys(li.get(1));	
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
	   
	}


	@Then("check Details valid")
	public void check_Deatails_valid() {
		String title12 = driver.getTitle();
	   Assert.assertTrue(title12.contains("Select Hotel"));
	   
		
	}
	
	
}