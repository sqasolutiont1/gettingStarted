package utils;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static void SaveDataToJsonFile(String key, String value, String filename){
        JSONObject data = new JSONObject();
        data.put(key, value);
        try (FileWriter file = new FileWriter(filename+".json")) {
            file.write(data.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
