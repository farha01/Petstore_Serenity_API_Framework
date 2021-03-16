package api.definitions;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import api.steps.PetStoreSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class PetStoreDefination {

	@Steps
	PetStoreSteps petStore;
	
	@Given("Adding Pet to PetStore")
	public void adding_Pet_PetStore() throws ParseException {
		petStore.adding_Pet_To_Store();
	}
	
	@Then("Getting Pet From Store")
	public void getting_Pet_From_Store() {
		petStore.getting_Pet_From_Store();
	}
	
	@Then("Delete Added Pet")
	public void delete_Added_Pet() {
		petStore.delete_Added_Pet();
	}
	
	
	@Given("Place the Order")
	public void place_The_Order() throws ParseException {
		petStore.place_The_Order();
	}
	
	 @Then("Getting the Order")
	 public void get_The_Placed_Order() {
		 petStore.get_The_Placed_Order();
	 }
	 
	 @Then("Delete the Placed Order")
	 public void delete_The_Placed_Order() {
		 petStore.delete_The_Placed_Order();
	 }
	 
	 @Then("Get Store Inventory")
	 public void get_The_Store_Inventory() {
		 petStore.get_The_Store_Inventory();
	 }
	
	@Then("User Logs into System")
	public void user_Logs_into_System() throws FileNotFoundException, IOException, ParseException {
		petStore.user_Logs_into_System();
	}
	
	@Then("Creates list of users with given input array")
	public void create_List_Users_With_Given_Input_Array() throws ParseException {
		petStore.create_List_Users_With_Given_Input_Array();
	}
	
	@Given("Create the User")
	public void create_The_User() throws ParseException {
		petStore.create_The_User();
	}
	
	@Then("Get user by user name")
	public void get_User_By_UserName() {
		petStore.get_User_By_UserName();
	}
	
	@Then("Delete the user")
	public void delete_The_User() {
		petStore.delete_The_User();
	}
	
	@Then("Update the user")
	public void update_The_User() throws ParseException {
		petStore.update_The_User();
	}
	
}
