package api;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import static net.serenitybdd.rest.SerenityRest.rest;

public class PetStore extends APIController {

	private String Json = "";
	private String FilePath = "";
	private String userName = "";
	private String pwd = "";

	String PetFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\apiInputData\\AddPet.json";
	String OrderFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\apiInputData\\Order.json";
	String UserFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\apiInputData\\CreateUser.json";

	@SuppressWarnings("deprecation")
	public void addPetToStore() throws ParseException {

		Json = readJSONFile(PetFilePath);
		rest().given().contentType("application/json").content(Json).post(PET_ENDPOINT).then().statusCode(200);
	}

	public void getTheAddedPet() {

		int id = Integer.parseInt(getJSONValueUsingKey(PetFilePath, "id"));
		rest().get(PET_ENDPOINT + "/{id}", id).then().statusCode(200);

	}

	public void deleteAddedPet() {

		int id = Integer.parseInt(getJSONValueUsingKey(PetFilePath, "id"));
		rest().delete(PET_ENDPOINT + "/{id}", id).then().statusCode(200);

	}

	@SuppressWarnings("deprecation")
	public void placeTheOrder() throws ParseException {

		Json = readJSONFile(OrderFilePath);
		rest().given().contentType("application/json").content(Json).post(STORE_ENDPOINT).then().statusCode(200);
	}

	public void getTheCreatedOrder() {

		int id = Integer.parseInt(getJSONValueUsingKey(OrderFilePath, "id"));
		rest().get(STORE_ENDPOINT + "/{OrderID}", id).then().statusCode(200);

	}

	public void deletetheCreatedOrder() {

		int id = Integer.parseInt(getJSONValueUsingKey(OrderFilePath, "id"));
		rest().delete(STORE_ENDPOINT + "/{OrderID}", id).then().statusCode(200);
	}

	public void getStoreInventory() {
		rest().get("https://petstore.swagger.io/v2/store/inventory").then().statusCode(200);
	}

	@SuppressWarnings("deprecation")
	public void createTheUser() throws ParseException {

		Json = readJSONFile(UserFilePath);
		rest().given().contentType("application/json").content(Json).post(USER_ENDPOINT).then().statusCode(200);
	}

	public void userLogsIntoSystem() throws FileNotFoundException, IOException, ParseException {

		String userName = getJSONValueUsingKey(UserFilePath, "username");
		String pwd = getJSONValueUsingKey(UserFilePath, "password");
		rest().param("username", userName).param("password", pwd).when().get(USER_ENDPOINT + "/login").then()
				.assertThat().statusCode(200);
	}

	public void getUserByUserName() {
		String userName = getJSONValueUsingKey(UserFilePath, "username");
		String Timmedusername = userName.replace("\"", "");
		rest().get(USER_ENDPOINT + "/{username}", Timmedusername).then().statusCode(200);
	}

	public void deleteTheUser() {
		String userName = getJSONValueUsingKey(UserFilePath, "username");
		String Trimedusername = userName.replace("\"", "");
		rest().delete(USER_ENDPOINT + "/{username}", Trimedusername).then().statusCode(200);
	}

	@SuppressWarnings("deprecation")
	public void createListUsersWithGivenInputArray() throws ParseException {

		FilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\apiInputData\\CreateUserWithArray.json";
		Json = readJSONArray(FilePath);
		rest().given().contentType("application/json").content(Json).post(USER_ENDPOINT + "/createWithArray").then()
				.statusCode(200);
	}

	@SuppressWarnings("deprecation")
	public void updateTheUser() throws ParseException {

		FilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\apiInputData\\UpdateUser.json";
		Json = readJSONFile(FilePath);
		String userName = getJSONValueUsingKey(UserFilePath, "username");
		rest().given().contentType("application/json").content(Json).put(USER_ENDPOINT + "/{username}", userName).then()
				.statusCode(200);
	}

	public void addingPetToPetStoreWithInvalidInput() throws ParseException {
		FilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\apiInputData\\AddPet_InvalidInput.json";
		Json = readJSONFile(FilePath);
		rest().given().contentType("application/json").content(Json).get(PET_ENDPOINT).then().statusCode(405);

	}

	public void deleteAddedPetwithInvalidIDSupplied() {

		rest().delete("http://petstore.swagger.io/v2/{id}", "id").then().statusCode(400);
	}

	public void deleteAddedPetWithPetNotFound() {
		rest().delete(PET_ENDPOINT + "/{id}", "id").then().statusCode(404);

	}

	public void gettingPetfromStorewithInvalidPetID() {
		rest().get(PET_ENDPOINT + "/{id}", "id").then().statusCode(404);

	}

	public void GettingPetFromStorewithInvalidIDsupplied() {

		rest().get(PET_ENDPOINT + "/{id}", "id").then().statusCode(400);
	}

	public void placeTheOrderWithInvalidRequest() throws ParseException {

		FilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\apiInputData\\Order_InvalidInput.json";
		Json = readJSONFile(FilePath);
		rest().given().contentType("application/json").content(Json).post(PET_ENDPOINT).then().statusCode(400);
	}

	public void getTheOrderInvalidOrderID() {
		rest().get(STORE_ENDPOINT + "/{OrderID}", "20").then().statusCode(404);

	}

	public void gettheOrderwithInvalidSuppliedID() {
		rest().get(STORE_ENDPOINT + "/{OrderID}", "20").then().statusCode(400);

	}

	public void deletetheOrderwithInvalidOrderID() {
		rest().delete(STORE_ENDPOINT + "/{OrderID}", "23").then().statusCode(404);

	}

	public void deletetheOrderwithInvalidSuppliedID() {
		rest().delete(STORE_ENDPOINT + "/{OrderID}", "134").then().statusCode(400);

	}

	
	public void gettheuserwithInvalidUserName() {

		rest().get(USER_ENDPOINT + "/{username}", "123").then().statusCode(404);
	}

	public void updatetheuserwithInvalidUserName() {
		rest().given().contentType("application/json").content(Json).put(USER_ENDPOINT + "/{username}", "567890").then()
				.statusCode(404);

	}

	public void deleteTheuserwithInvalidUserName() {

		rest().delete(USER_ENDPOINT + "/{username}", "890987654").then().statusCode(404);
	}

}
