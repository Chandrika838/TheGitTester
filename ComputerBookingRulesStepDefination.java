package Stepdefinitation;

import adminpage.ComputerBookingRules;
import adminpage.LoginPage;
import automation.pages.utils.ConfigReader;
import hookclass.HookClass;
import io.cucumber.java.en.When;

public class ComputerBookingRulesStepDefination {

	private LoginPage loginPage;
	private ComputerBookingRules computerbooking;
	private ConfigReader config;
	

private void computerbookinginit() {
	
	if(config ==null) {
		
		config = new ConfigReader();
		
	}
	
	if(loginPage ==null) {
		
		loginPage = new LoginPage(HookClass.driver);
		
	}
	
	if(computerbooking ==null) {
		computerbooking = new ComputerBookingRules(HookClass.driver);
		
		
	}
	
}
	
	@When("I open Computer Booking Rules")
    public void i_open_computer_booking_rules() {
		
        computerbooking.ClickBookingRules();
    }

	  @When("I select the Computers option")
	    public void i_select_the_computers_option() {

	       computerbookinginit();

	        computerbooking.ClickComputers();
	    }

	    @When("I select the Automation Tags computer tag")
	    public void i_select_the_automation_tags_computer_tag() {

	        computerbookinginit();

	        computerbooking.ClickTags();
	    }

	    @When("I enable computer access")
	    public void i_enable_computer_access() {

	        computerbookinginit();

	        computerbooking.ClickAccess();
	    }

	    @When("I enable the computer access toggle")
	    public void i_enable_the_computer_access_toggle() {

	        computerbookinginit();

	        computerbooking.enableToogle();
	    }

	    @When("I enable maximum bookings per month")
	    public void i_enable_maximum_bookings_per_month() {

	        computerbookinginit();

	        computerbooking.clickMaxmiumBookingPerMonth();
	    }

	    @When("I enter the maximum bookings per month value")
	    public void i_enter_the_maximum_bookings_per_month_value() {

	        computerbookinginit();

	        computerbooking.enableInput(
	                config.getMaximumPerMonth()
	        );
	    }

	    @When("I enable maximum booking duration")
	    public void i_enable_maximum_booking_duration() {

	       computerbookinginit();

	        computerbooking.ClickBookingDuration();
	    }

	    @When("I enter the maximum booking duration value")
	    public void i_enter_the_maximum_booking_duration_value() {

	       computerbookinginit();

	        computerbooking.enableInput1(
	                config.getMaxiumBookingDuration()
	        );
	    }

	    @When("I enable bookings per day")
	    public void i_enable_bookings_per_day() {

	        computerbookinginit();

	        computerbooking.ClickBookingPerDay();
	    }

	    @When("I enter the bookings per day value")
	    public void i_enter_the_bookings_per_day_value() {

	        computerbookinginit();

	        computerbooking.enableInput2(
	                config.getBookingPerDay()
	        );
	    }

	    @When("I enable maximum time allowed per day")
	    public void i_enable_maximum_time_allowed_per_day() {

	        computerbookinginit();

	        computerbooking.ClickBookingAllowedPerDay();
	    }

	    @When("I enter the maximum time allowed per day value")
	    public void i_enter_the_maximum_time_allowed_per_day_value() {

	       computerbookinginit();

	        computerbooking.enableInput3(
	                config.getBookingAllowedPerDay()
	        );
	    }

	    @When("I enable maximum period to book in advance")
	    public void i_enable_maximum_period_to_book_in_advance() {

	       computerbookinginit();

	        computerbooking.ClickMaxmiumPeriodToBookinAdvance();
	    }

	    @When("I enter the maximum advance booking period value")
	    public void i_enter_the_maximum_advance_booking_period_value() {

	       computerbookinginit();

	        computerbooking.enableInput4(
	                config.getmaximumperiodtobookinadvance()
	        );
	    }

	    @When("I enable booking extension")
	    public void i_enable_booking_extension() {

	        computerbookinginit();

	        computerbooking.ClickExtend();
	    }

	    @When("I enable the booking extension toggle")
	    public void i_enable_the_booking_extension_toggle() {

	        computerbookinginit();

	        computerbooking.enableToogle1();
	    }

	    @When("I enable automatic extension")
	    public void i_enable_automatic_extension() {

	        computerbookinginit();

	        computerbooking.ClickAutoExtend();
	    }

	    @When("I enable the automatic extension toggle")
	    public void i_enable_the_automatic_extension_toggle() {

	        computerbookinginit();

	        computerbooking.enableToogle2();
	    }

	    @When("I enable maximum extension time")
	    public void i_enable_maximum_extension_time() {

	       computerbookinginit();

	        computerbooking.ClickMaxmiumExtendTime();
	    }

	    @When("I enable the maximum extension time toggle")
	    public void i_enable_the_maximum_extension_time_toggle() {

	        computerbookinginit();

	        computerbooking.ClickToogle3();
	    }

	    @When("I enable number of extensions")
	    public void i_enable_number_of_extensions() {

	        computerbookinginit();

	        computerbooking.clickNumberofExtension();
	    }

	    @When("I enable the number of extensions toggle")
	    public void i_enable_the_number_of_extensions_toggle() {

	        computerbookinginit();

	        computerbooking.ClickToogle4();
	    }

	    @When("I submit the computer booking rules")
	    public void i_submit_the_computer_booking_rules() {

	       computerbookinginit();

	        computerbooking.ClickSubmit();
	    }
	}


