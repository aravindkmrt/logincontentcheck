package org.login;

import java.io.IOException;

import org.baselogin.basemlogin;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class multipleloginsteps extends basemlogin {
	@Given("user have to enter into comunity matrimony page")
	public void user_have_to_enter_into_comunity_matrimony_page() {
		launchBrowser();
	}

	@When("user have to enter the login url")
	public void user_have_to_enter_the_login_url() throws Throwable {
		loadUrl("https://www.communitymatrimony.com/login/");
		Thread.sleep(4000); 
	}
	
	@When("user have to enter valid {string} and password and {string}")
	public void user_have_to_enter_valid_and_password_and(String username, String status) throws Throwable {
		driver.findElement(By.xpath("//*[@id='idEmail']")).sendKeys(username);
		WebElement pass = driver.findElement(By.xpath("//*[@id='password']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].setAttribute('value','cbstest')", pass);
		System.out.println(username);
		System.out.println(status);
		driver.findElement(By.xpath("(//*[@value='Login'])[2]")).click();
		Thread.sleep(4000); 
		getScreenshot(driver, username);
	}

	@When("user have to click the submit button")
	public void user_have_to_click_the_submit_button() throws Throwable {
		
		
		try {
			WebElement str = driver.findElement(By.xpath("//*[@class=\"nomsg mediumtxt  pad10 \"]"));
			boolean b = str.isDisplayed();
			if (b==true) {
				String s1 = str.getText();
				System.out.println(s1);	
			}
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Element is not found suspend");
		}
		Thread.sleep(4000); 
		try {
			WebElement str = driver.findElement(By.xpath("//*[@id=\"error\"]"));
			boolean b = str.isDisplayed();
			if (b==true) {
				String s1 = str.getText();
				System.out.println(s1);	
			}
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Element is not found id error");
		}
		try {
			WebElement str = driver.findElement(By.xpath("(//*[@class=\"font12 bld padt10\"])[2]"));
			boolean b = str.isDisplayed();
			if (b==true) {
				String s1 = str.getText();
				System.out.println(s1);	
			}
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Element is not found id mobile verification");
		}
		try {
			driver.findElement(By.xpath("//*[@class=\"linkb font13\"]")).click();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Element is not found logout");
		}
		
	}
	@When("user have to enter the login url two")
	public void user_have_to_enter_the_login_url_two() throws Throwable {
		waitingWeb();
		loadUrl("https://www.communitymatrimony.com/");
		Thread.sleep(4000); 
	}

	@When("user have to enter valid second {string} and password and {string}")
	public void user_have_to_enter_valid_second_and_password_and(String username, String status) throws Throwable  {
		waitingWeb();
		driver.findElement(By.xpath("//*[@name='idEmail']")).sendKeys(username);
		WebElement pass = driver.findElement(By.xpath("//*[@id='password1']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].setAttribute('value','cbstest')", pass);
		System.out.println(username);
		System.out.println(status);
		driver.findElement(By.xpath("//*[@value='LOGIN']")).click();
		Thread.sleep(4000); 
		getScreenshot(driver, username);
	}
	@When("user have to click the submit button second")
	public void user_have_to_click_the_submit_button_second() throws Throwable {
		
		try {
			WebElement str = driver.findElement(By.xpath("//*[@class=\"nomsg mediumtxt  pad10 \"]"));
			boolean b = str.isDisplayed();
			if (b==true) {
				String s1 = str.getText();
				System.out.println(s1);	
			}
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Element is not found suspend");
		}
		Thread.sleep(4000); 
		try {
			WebElement str = driver.findElement(By.xpath("//*[@id=\"error\"]"));
			boolean b = str.isDisplayed();
			if (b==true) {
				String s1 = str.getText();
				System.out.println(s1);	
			}
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Element is not found id error");
		}
		try {
			WebElement str = driver.findElement(By.xpath("(//*[@class=\"font12 bld padt10\"])[2]"));
			boolean b = str.isDisplayed();
			if (b==true) {
				String s1 = str.getText();
				System.out.println(s1);	
			}
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Element is not found id mobile verification");
		}
		try {
			driver.findElement(By.xpath("//*[@class=\"linkb font13\"]")).click();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Element is not found logout");
		}
	}

	@When("user have to enter the login url third")
	public void user_have_to_enter_the_login_url_third() throws Throwable {
		loadUrl("https://www.agarwalmatrimony.com/");
		Thread.sleep(4000); 
		driver.findElement(By.xpath("//*[@id=\"loginbtn\"]")).click();
	}

	@When("user have to enter valid third {string} and password and {string}")
	public void user_have_to_enter_valid_third_and_password_and(String username, String status) throws Throwable {
		Thread.sleep(4000); 
		driver.findElement(By.xpath("//*[@id=\"a12\"]")).sendKeys(username);
		WebElement pass = driver.findElement(By.xpath("//*[@name=\"password\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='cbstest';", pass);
		System.out.println(username);
		System.out.println(status); 
		Thread.sleep(4000); 
		WebElement click1 = driver.findElement(By.xpath("//*[@value=\"Login\"]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", click1);
		Thread.sleep(4000);
		getScreenshot(driver, username);
	}
	@When("user have to click the submit button third")
	public void user_have_to_click_the_submit_button_third() throws Throwable {
		
		try {
			WebElement str = driver.findElement(By.xpath("//*[@class=\"nomsg mediumtxt  pad10 \"]"));
			boolean b = str.isDisplayed();
			if (b==true) {
				String s1 = str.getText();
				System.out.println(s1);	
			}
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Element is not found suspend");
		}
		Thread.sleep(4000); 
		try {
			WebElement str = driver.findElement(By.xpath("//*[@id=\"error\"]"));
			boolean b = str.isDisplayed();
			if (b==true) {
				String s1 = str.getText();
				System.out.println(s1);	
			}
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Element is not found id error");
		}
		try {
			WebElement str = driver.findElement(By.xpath("(//*[@class=\"font12 bld padt10\"])[2]"));
			boolean b = str.isDisplayed();
			if (b==true) {
				String s1 = str.getText();
				System.out.println(s1);	
			}
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Element is not found id mobile verification");
		}
		try {
			driver.findElement(By.xpath("//*[@class=\"linkb font13\"]")).click();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Element is not found logout");
		}
	}

	@Then("user credentials")
	public void user_credentials() {
	   
	}




}
