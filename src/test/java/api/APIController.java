package api;


import java.io.FileReader;
import java.io.IOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class APIController {

	public static String BASE_URL = "https://petstore.swagger.io/v2";
	public String PET_ENDPOINT = BASE_URL + "/pet";
	public String STORE_ENDPOINT = BASE_URL + "/store/order";
	public String USER_ENDPOINT = BASE_URL + "/user";
	
	public int id=0;
	
	public String readJSONFile(String FilePath) throws org.json.simple.parser.ParseException {
		String Json = "";
		JsonParser parser = new JsonParser();
		try {
			Object obj = parser.parse(new FileReader(FilePath));
			JsonObject jsonobj = (JsonObject) obj;
			id = Integer.parseInt(jsonobj.get("id").toString());
			Json = jsonobj.toString();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return Json;
	}
	
	public String readJSONArray(String FilePath) throws org.json.simple.parser.ParseException {
		String Json = "";
		JsonParser parser = new JsonParser();
		try {
			Object obj = parser.parse(new FileReader(FilePath));
			Json = obj.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return Json;
	}
	
	
}
