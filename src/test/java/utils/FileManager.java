package utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    public static void SaveDataToJsonFile(String key, String value, String filename){
        JSONObject data = new JSONObject();
        data.put(key, value);
        try (FileWriter file = new FileWriter(
                System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\"+filename+".json")) {
            file.write(data.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Object> readDataFromJSON(String filename) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Object obj  = parser.parse(new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\"+filename+".json"));
        JSONArray array = new JSONArray();
        array.add(obj);
        ArrayList<Object> listdata = new ArrayList<Object>();
        JSONArray jArray = (JSONArray)obj;
        if (jArray != null) {
            for (int i=0;i<jArray.size();i++){
                listdata.add(jArray.get(i));
            }
        }
        return listdata;
    }
}
