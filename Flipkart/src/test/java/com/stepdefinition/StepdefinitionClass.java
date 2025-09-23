package com.stepdefinition;

import java.time.Duration;
import java.util.Set;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefinitionClass {

	static WebDriver driver;

	@Given("Open the Flipkart url and click the login option")
	public void open_the_flipkart_url_and_click_the_login_option() {

		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
		login.click();

	}

	@When("Enter the valid mobile number and click request otp button")
	public void enter_the_valid_mobile_number_and_click_request_otp_button() {
		WebElement mobile = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		mobile.sendKeys("manivannancse1996@gmail.com");

	

	}

	@And("Enter the current received otp number and click verify button")
	public void enter_the_current_received_otp_number_and_click_verify_button() throws InterruptedException {

		WebElement otpbtn = driver.findElement(By.xpath("//button[text()='Request OTP']"));
		otpbtn.click();

		Thread.sleep(25000);
	}

	@Then("Click the search option and enter required product then click search icon")
	public void click_the_search_option_and_enter_required_product_then_click_search_icon() {

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("iphone 16 plus");

		WebElement searchbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		searchbtn.click();

	}

	@And("Select a product which one need to be buying")
	public void select_a_product_which_one_need_to_be_buying() {
	

		WebElement mobile = driver.findElement(By.xpath("//div[text()='Apple iPhone 16 Plus (Ultramarine, 128 GB)']"));
		mobile.click();

	}

	@Then("Click add to cart button and confirm card added successfully message")
	public void click_add_to_cart_button_and_confirm_card_added_successfully_message() {

	String ptwin = driver.getWindowHandle();
		
		
		System.out.println(ptwin);

		Set<String> child = driver.getWindowHandles();
		System.out.println(child);

		for (String x : child) {

			if (ptwin.equals(x)) {
				driver.switchTo().window(x);
			}

		}
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Add to cart']")));
		until.click();
		
		
//		
//		WebElement cart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
//		cart.click();

	}

}
