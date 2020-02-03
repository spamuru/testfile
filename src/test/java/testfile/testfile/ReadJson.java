/*
package testfile.testfile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.

public class ReadJson {

	public static void main(String[] args) throws ParseException, org.json.simple.parser.ParseException {


		 JSONParser parser = new JSONParser();

	        try {
	           // Object obj = parser.parse(new FileReader("src/test/java/"+"tryme.json"));
	            Object obj = parser.parse(new FileReader("src/test/java/"+"_Response.json"));
	            JSONArray array = (JSONArray) obj;

	          for (int i=0;i<=array.size()-1;i++) {
	            	JSONObject jsonObject = (JSONObject) array.get(i);

		            Long name = (Long) jsonObject.get("groupId");
		            System.out.println(name);

	          }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	}*/
