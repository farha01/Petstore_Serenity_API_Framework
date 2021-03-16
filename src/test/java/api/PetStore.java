package api;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import static net.serenitybdd.rest.SerenityRest.rest;

public class PetStore extends APIController{

	
	private String Json = "";
	private String FilePath = "";
	private String userName ="";
	private String pwd = "";
	
	@SuppressWarnings("deprecation")
	public void addPetToStore() throws ParseException {
		
		FilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\apiInputData\\AddPet.json";
		Json =readJSONFile(FilePath);
		rest().given().contentType("application/json").content(Json).post(PET_ENDPOINT)
				.then().statusCode(200);
	}

	public void getTheAddedPet() {
		
		rest().get(PET_ENDPOINT+ "/{id}", id)
		.then().statusCode(200);
		
	}
	
	public void deleteAddedPet() {
		
		rest().delete(PET_ENDPOINT+ "/{id}",id)
	    .then().statusCode(200);
		
	}

	@SuppressWarnings("deprecation")
	public void placeTheOrder() throws ParseException {
		
		FilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\apiInputData\\Order.json";
		Json =readJSONFile(FilePath);
		rest().given().contentType("application/json")
		.content(Json).post(STORE_ENDPOINT)
		.then().statusCode(200);
	}
	
	public void getTheCreatedOrder() {
		
		rest().get(STORE_ENDPOINT+"/{OrderID}", id)
		.then().statusCode(200);
		
	}
	
	public void deletetheCreatedOrder() {
		rest().delete(STORE_ENDPOINT+"/{OrderID}",id)
	    .then().statusCode(200);
	}
	
	public void getStoreInventory() {
		rest().get("https://petstore.swagger.io/v2/store/inventory")
		.then().statusCode(200);
	}
	
	@SuppressWarnings("deprecation")
	public void createTheUser() throws ParseException {
		
		FilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\apiInputData\\CreateUser.json";
		Json =readJSONFile(FilePath);
		rest().given().contentType("application/json")
		.content(Json).post(USER_ENDPOINT).then().statusCode(200);
		
	}
	
	public void userLogsIntoSystem() throws FileNotFoundException, IOException, ParseException {
		
		FilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\apiInputData\\CreateUser.json";
		
		JsonParser parser = new JsonParser();
		try {
			Object obj = parser.parse(new FileReader(FilePath));
			JsonObject jsonobj = (JsonObject) obj;
			userName = jsonobj.get("username").toString();
			pwd = jsonobj.get("password").toString();
		}catch(Exception e) {
			
		}
		
		 rest().
         param("username",userName).
         param("password",pwd).
         when().
         get(USER_ENDPOINT+"/login").
         then().
         assertThat().
         statusCode(200);
	}
	
	
	public void getUserByUserName() {
		
		String username = userName.replace("\"", "");
		rest().
		get(USER_ENDPOINT+"/{username}",username)
		.then().statusCode(200);
	}
	
	
	public void deleteTheUser() {
		String username = userName.replace("\"", "");
		rest().delete(USER_ENDPOINT+"/{username}",username)
	    .then().statusCode(200);
	}

	@SuppressWarnings("deprecation")
	public void createListUsersWithGivenInputArray() throws ParseException {
		
		FilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\apiInputData\\CreateUserWithArray.json";
		Json =readJSONArray(FilePath);
		rest().given().contentType("application/json")
		.content(Json).post(USER_ENDPOINT+"/createWithArray").then().statusCode(200);
	}

	@SuppressWarnings("deprecation")
	public void updateTheUser() throws ParseException {
		
		FilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\apiInputData\\UpdateUser.json";
		Json =readJSONFile(FilePath);
		rest().given().contentType("application/json")
		.content(Json).put(USER_ENDPOINT+"/{username}",userName).then().statusCode(200);
	}
	
	
}
