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
	public void adding_Pet_To_Store() throws ParseException {
		petStore.addPetToStore();
	}
	
	@Step("Getting Added Pet")
	public void getting_Pet_From_Store() {
		petStore.getTheAddedPet();
	}
	
	@Step("Delete Added Pet")
	public void delete_Added_Pet() {
		petStore.deleteAddedPet();
	}

	@Step("Place The Order")
	public void place_The_Order() throws ParseException {
		petStore.placeTheOrder();
		
	}

	public void get_The_Placed_Order() {
		petStore.getTheCreatedOrder();
		
	}

	public void delete_The_Placed_Order() {
		petStore.deletetheCreatedOrder();
		
	}

	public void get_The_Store_Inventory() {
		petStore.getStoreInventory();
		
	}

	public void user_Logs_into_System() throws FileNotFoundException, IOException, ParseException {
		petStore.userLogsIntoSystem();
		
	}

	public void create_List_Users_With_Given_Input_Array() throws ParseException {
		petStore.createListUsersWithGivenInputArray();
		
	}

	public void create_The_User() throws ParseException {
		petStore.createTheUser();
		
	}

	public void get_User_By_UserName() {
		petStore.getUserByUserName();
		
	}

	public void delete_The_User() {
		petStore.deleteTheUser();
		
	}

	public void update_The_User() throws ParseException {
		petStore.updateTheUser();
		
	}
}
