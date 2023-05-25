package org.adactin.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class BookingAndOrderIdGeneration {
	
	@Given("User Launch Addactin LoginPage Login using Username Password")
	public void user_Launch_Addactin_LoginPage_Login_using_Username_Password() {
	  
	}
	@And("Enter Valid Details Required")
	public void enter_Valid_Details_Required() {
	    
	}
	
	@And("verify select Hotel")
	public void verify_select_Hotel() {
	    
	}
	
	WebDriver driver;
	
	
	@When("Enter All Valid Paymnet Details")
	public void enter_All_Valid_Paymnet_Details() throws InterruptedException {
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
	    WebElement first_name = driver.findElement(By.id("first_name"));
	    first_name.sendKeys("Vignesh Pandi");
		Thread.sleep(4000);
		WebElement last_name = driver.findElement(By.id("last_name"));
		last_name.sendKeys("A.S");
	    WebElement address = driver.findElement(By.id("address"));
	    address.sendKeys("Madurai");
	    WebElement cc_num = driver.findElement(By.id("cc_num"));
	    cc_num.sendKeys("1234567887654321");
	    WebElement cc_type = driver.findElement(By.id("cc_type"));
	    cc_type.sendKeys("VISA");
	    WebElement cc_exp_month = driver.findElement(By.id("cc_exp_month"));
	    cc_exp_month.sendKeys("January");
	    WebElement exp_year = driver.findElement(By.id("cc_exp_year"));
	    exp_year.sendKeys("2023");		
	    WebElement ccvnum = driver.findElement(By.id("cc_cvv"));
	    ccvnum.sendKeys("101");
	    WebElement book_now = driver.findElement(By.id("book_now"));
	    book_now.click();
		Thread.sleep(10000);
		
	    
}
		@Then("Check Order Id  Gernerated")
	public void check_Order_Id_Gernerated() {
	    WebElement order_no = driver.findElement(By.id("order_no"));
		 Assert.assertTrue(order_no.isDisplayed());
		String orderId = order_no.getAttribute("value");
	    System.out.println("OrderNo:"+orderId);
	   System.out.println("Hotel is Booked");
	    
	}
}
