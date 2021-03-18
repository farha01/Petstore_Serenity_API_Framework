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
	
	@Given("Add Pet to the PetStore With Valid Data")
	public void add_Pet_To_The_PetStore_With_Valid_Data() throws ParseException {
		petStore.add_Pet_To_The_PetStore_With_Valid_Data();
	}
	
	@Given("Get Pet from PetStore with Valid Data")
	public void get_Pet_from_PetStore_With_Valid_Data() {
		petStore.get_Pet_from_PetStore_With_Valid_Data();
	}
	
	@Then("Delete Pet from PetStore with Valid Data")
	public void delete_Pet_from_PetStore_with_Valid_Data() {
		petStore.delete_Pet_from_PetStore_with_Valid_Data();
	}
	
	
	@Given("Place the Order with Valid Data")
	public void place_The_Order_with_Valid_Data() throws ParseException {
		petStore.place_The_Order_with_Valid_Data();
	}
	
	 @Then("Get the Order with Valid Data")
	 public void get_The_Placed_Order_with_Valid_Data() {
		 petStore.get_The_Placed_Order_with_Valid_Data();
	 }
	 
	 @Then("Delete the Order with Valid Data")
	 public void delete_The_Placed_Order_with_Valid_Data() {
		 petStore.delete_The_Placed_Order_with_Valid_Data();
	 }
	 
	 @Then("Get Store Inventory with Valid Data")
	 public void get_The_Store_Inventory_with_Valid_Data() {
		 petStore.get_The_Store_Inventory_with_Valid_Data();
	 }
	
	@Then("User Logs into System with Valid Data")
	public void user_Logs_into_System_with_Valid_Data() throws FileNotFoundException, IOException, ParseException {
		petStore.user_Logs_into_System_with_Valid_Data();
	}
	
	@Then("Creates list of users with Valid input Array")
	public void create_List_Users_With_Valid_Input_Array() throws ParseException {
		petStore.create_List_Users_With_Valid_Input_Array();
	}
	
	@Given("Create the User with Valid Data")
	public void create_The_User_with_Valid_Data() throws ParseException {
		petStore.create_The_User_with_Valid_Data();
	}
	
	@Then("Get User with valid User Name")
	public void get_User_With_Valid_UserName() {
		petStore.get_User_With_Valid_UserName();
	}
	
	@Then("Delete User with valid User Name")
	public void delete_The_User_With_Valid_UserName() {
		petStore.delete_The_User_With_Valid_UserName();
	}
	
	@Then("Update User with valid User Name")
	public void update_The_User_With_Valid_UserName() throws ParseException {
		petStore.update_The_User_With_Valid_UserName();
	}
	
	@Given("Adding Pet to PetStore with Invalid Input")
	public void adding_Pet_To_PetStore_With_Invalid_Input() throws ParseException {
		petStore.adding_Pet_To_PetStore_With_Invalid_Input();
	}
	
	@Given("Delete Added Pet with Invalid ID Supplied")
	public void delete_Added_Pet_with_Invalid_ID_Supplied() {
		petStore.delete_Added_Pet_with_Invalid_ID_Supplied();
	}
	
	@Given("Delete Added Pet with Invalid pet ID")
	public void delete_Added_Pet_With_Pet_Not_Found() {
		petStore.delete_Added_Pet_With_Pet_Not_Found();
	}
	
	
	@Given("Getting Pet From Store with Invalid Pet ID")
	public void getting_Pet_from_Store_with_Invalid_PetID() {
		petStore.getting_Pet_from_Store_with_Invalid_PetID();
	}
	
	@Given("Getting Pet From Store with Invalid ID supplied")
	public void Getting_Pet_From_Store_with_Invalid_ID_supplied() {
		petStore.Getting_Pet_From_Store_with_Invalid_ID_supplied();
	}
	
	@Given("Place the Order with Invalid request")
	public void place_The_Order_With_Invalid_Request() throws ParseException {
		petStore.place_The_Order_With_Invalid_Request();
	}
	
	@Given("Get the Order with Invalid Order ID")
	public void get_The_Order_Invalid_Order_ID() {
		petStore.get_The_Order_Invalid_Order_ID();
	}
	
	@Given("Get the Order with Invalid Supplied ID")
	public void get_the_Order_with_Invalid_Supplied_ID() {
		petStore.get_the_Order_with_Invalid_Supplied_ID();
	}
	
	@Given("Delete the Order with Invalid Order ID")
	public void delete_the_Order_with_Invalid_Order_ID() {
		petStore.delete_The_Order_Invalid_Order_ID();
	}
	
	@Given("Delete the Order with Invalid Supplied ID")
	public void delete_the_Order_with_Invalid_Supplied_ID() {
		petStore.delete_the_Order_with_Invalid_Supplied_ID();
	}
	
	@Given("Get the user with Invalid UserName")
	public void get_the_user_with_Invalid_UserName() {
		petStore.get_the_user_with_Invalid_UserName();
	}
	
	@Given("Update the user with Invalid UserName")
	public void update_the_user_with_Invalid_UserName() {
		petStore.update_the_user_with_Invalid_UserName();
	}
	
	@Given("Delete the user with Invalid UserName")
	public void delete_The_user_with_Invalid_UserName() {
		petStore.delete_The_user_with_Invalid_UserName();
	}
	
}
