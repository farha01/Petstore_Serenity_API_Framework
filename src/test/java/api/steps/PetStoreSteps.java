package api.steps;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import api.PetStore;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class PetStoreSteps {

	@Steps
	PetStore petStore;
	
	@Step("Adding pet to Store")
	public void add_Pet_To_The_PetStore_With_Valid_Data() throws ParseException {
		petStore.addPetToStore();
	}
	
	@Step("Getting Added Pet")
	public void get_Pet_from_PetStore_With_Valid_Data() {
		petStore.getTheAddedPet();
	}
	
	@Step("Delete Added Pet")
	public void delete_Pet_from_PetStore_with_Valid_Data() {
		petStore.deleteAddedPet();
	}

	@Step("Place The Order")
	public void place_The_Order_with_Valid_Data() throws ParseException {
		petStore.placeTheOrder();
		
	}

	public void get_The_Placed_Order_with_Valid_Data() {
		petStore.getTheCreatedOrder();
		
	}

	public void delete_The_Placed_Order_with_Valid_Data() {
		petStore.deletetheCreatedOrder();
		
	}

	public void get_The_Store_Inventory_with_Valid_Data() {
		petStore.getStoreInventory();
		
	}

	public void user_Logs_into_System_with_Valid_Data() throws FileNotFoundException, IOException, ParseException {
		petStore.userLogsIntoSystem();
		
	}

	public void create_List_Users_With_Valid_Input_Array() throws ParseException {
		petStore.createListUsersWithGivenInputArray();
		
	}

	public void create_The_User_with_Valid_Data() throws ParseException {
		petStore.createTheUser();
		
	}

	public void get_User_With_Valid_UserName() {
		petStore.getUserByUserName();
		
	}

	public void delete_The_User_With_Valid_UserName() {
		petStore.deleteTheUser();
		
	}

	public void update_The_User_With_Valid_UserName() throws ParseException {
		petStore.updateTheUser();
		
	}

	public void adding_Pet_To_PetStore_With_Invalid_Input() throws ParseException {
		petStore.addingPetToPetStoreWithInvalidInput();
		
	}

	public void delete_Added_Pet_with_Invalid_ID_Supplied() {
		petStore.deleteAddedPetwithInvalidIDSupplied();
		
	}

	public void delete_Added_Pet_With_Pet_Not_Found() {
		petStore.deleteAddedPetWithPetNotFound();
		
	}

	public void getting_Pet_from_Store_with_Invalid_PetID() {
		
		petStore.gettingPetfromStorewithInvalidPetID();
	}

	public void Getting_Pet_From_Store_with_Invalid_ID_supplied() {
		petStore.GettingPetFromStorewithInvalidIDsupplied();
		
	}

	public void place_The_Order_With_Invalid_Request() throws ParseException {
		petStore.placeTheOrderWithInvalidRequest();
		
	}

	public void get_The_Order_Invalid_Order_ID() {
		petStore.getTheOrderInvalidOrderID();
		
	}

	public void get_the_Order_with_Invalid_Supplied_ID() {
		petStore.gettheOrderwithInvalidSuppliedID();
		
	}

	public void delete_The_Order_Invalid_Order_ID() {
		
		petStore.deletetheOrderwithInvalidOrderID();
	}

	public void delete_the_Order_with_Invalid_Supplied_ID() {
		petStore.deletetheOrderwithInvalidSuppliedID();
		
	}

	public void get_the_user_with_Invalid_UserName() {
		petStore.gettheuserwithInvalidUserName();
		
	}

	public void update_the_user_with_Invalid_UserName() {
		petStore.updatetheuserwithInvalidUserName();
		
	}

	public void delete_The_user_with_Invalid_UserName() {
		petStore.deleteTheuserwithInvalidUserName();
		
	}
}
