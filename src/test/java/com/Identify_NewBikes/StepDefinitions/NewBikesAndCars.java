package com.Identify_NewBikes.StepDefinitions;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Identify_NewBikes.PageObjects.Locators;
import com.Identify_NewBikes.Utils.WebDriverManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewBikesAndCars {

	Locators loc = new Locators(WebDriverManager.getDriver());

	@Test
	@Given("user navigates to zig wheels website with url")
	public void user_navigates_to_zig_wheels_website_with_url() {
		loc = new Locators(WebDriverManager.getDriver());

	}

	@Test
	@When("Upon hovering their mouse over the new bikes, the user will be able to view more details regarding the products.")
	public void upon_hovering_their_mouse_over_the_new_bikes_the_user_will_be_able_to_view_more_details_regarding_the_products() {
		loc.hoverOnNewBikes();
		System.out.println("--Hover on new bikes option--");
	}

	@Test
	@Then("From the new bikes area, the user selects the upcoming bikes option.")
	public void from_the_new_bikes_area_the_user_selects_the_upcoming_bikes_option() {
		loc.clickOnUpcomingBikes();
		System.out.println("--UpComing Bikes Option Selected--");
	}

	@Test
	@Then("After receiving the result, the user selects Honda as the manufacturer name from the menu.")
	public void after_receiving_the_result_the_user_selects_honda_as_the_manufacturer_name_from_the_menu() {
		loc.selectManfacturerName();
		System.out.println("--Manfacturer Name Selected--");
	}

	@Test
	@Then("record the name, cost, and anticipated release date of each bike for the Indian market for the manufacturer Honda & A bike should cost no more than four lakhs.")
	public void record_the_name_cost_and_anticipated_release_date_of_each_bike_for_the_indian_market_for_the_manufacturer_honda_a_bike_should_cost_no_more_than_four_lakhs()
			throws IOException {
		loc.captureBikesData();
		System.out.println("--Data inserted Successfully--");
	}

	@Test
	@Given("user moves the mouse pointer over the Zig Wheels website new cars section.")
	public void user_moves_the_mouse_pointer_over_the_zig_wheels_website_new_cars_section() {
		loc.hoverOnUsedCars();
		System.out.println("--Hovered on Used Cars--");
	}

	@Test
	@Then("From the website new cars area, the user selects the options for used cars in Chennai.")
	public void from_the_website_new_cars_area_the_user_selects_the_options_for_used_cars_in_chennai() {
		loc.clickonUsedCars();
		System.out.println("--Clicked on Used Cars--");
	}

	@Test
	@Then("the user selects the options for used cars in {string}.")
	public void the_user_selects_the_options_for_used_cars_in(String cityName) {
		loc.clickonCity(cityName);
		System.out.println("--Clicked on Used Cars--");
	}

	@Test
	@Then("On the Zig Wheels website, the user clicks on each and every modelName under the filters.")
	public void on_the_zig_wheels_website_the_user_clicks_on_each_and_every_model_name_under_the_filters()
			throws IOException, InterruptedException {
		loc.addFilters();
		System.out.println("--Filters Added--");
	}

	@Test
	@Given("User clicks the Zig Wheels website login\\/signup button.")
	public void user_clicks_the_zig_wheels_website_s_login_signup_button() throws InterruptedException {
		loc.clickOnLoginorSignup();
		System.out.println("--Clicked On Login\\/Signup Button--");
	}

	@Test
	@Given("The user choose a Google login option.")
	public void the_user_choose_a_google_login_option() {
		loc.clickOnGoogle();
		System.out.println("--Clicked On Google--");

	}

	@Test
	@Then("User sends an incorrect email using their {string} address, then checks to see whether an error message appears.")
	public void user_sends_an_incorrect_email_using_their_address_then_checks_to_see_whether_an_error_message_appears(
			String emailId) {
		loc.enterEmailId(emailId);
		System.out.println("--Error Message Captured--");
	}

	@Test
	@Given("user navigate to forums tab in the zig wheels website")
	public void user_navigate_to_forums_tab_in_the_zig_wheels_website() {
		loc.clickOnForum();
		System.out.println("--Clicked On Forum--");
	}

	@Test
	@When("On the zig wheels website, the user selects the type of vehicle")
	public void on_the_zig_wheels_website_the_user_selects_the_type_of_vehicle() {
		loc.selectVehicleType();
		System.out.println("--Selected Vehicle Type");
	}

	@Test
	@When("The user selects a brand from the zig wheels web site")
	public void the_user_selects_a_brand_from_the_zig_wheels_web_site() {
		loc.selectBrand();
		System.out.println("--Selected Brand--");
	}

	@Test
	@When("The user selects a model from the zig wheels web site based on the brand")
	public void the_user_selects_a_model_from_the_zig_wheels_web_site_based_on_the_brand() {
		loc.selectModel();
		System.out.println("--Selected Model--");
	}

	@Test
	@Then("The user clicks on search button and validate the results")
	public void the_user_clicks_on_search_button_and_validate_the_results() {
		loc.clickOnSearch();
		System.out.println();
	}
}
