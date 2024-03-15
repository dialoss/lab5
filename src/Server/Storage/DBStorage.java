package Server.Storage;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DBStorage extends FileStorage {
    public DBStorage() {
        super();
    }

    public JSONObject[] read() {
        String text = super._read();
        JSONParser parser = new JSONParser();
        try {
            Object parsed = parser.parse(text);
            if (parsed instanceof JSONArray) {
                JSONObject[] list = new JSONObject[((JSONArray) parsed).size()];
                int i = 0;
                for (Object o : (JSONArray) parsed) {
                    list[i++] = (JSONObject) o;
                }
                return list;
            }
            else if (parsed instanceof JSONObject)
                return new JSONObject[]{(JSONObject) parsed};
        } catch (ParseException e) {
            System.out.println(e);
        }
        return new JSONObject[]{new JSONObject()};
    }

    public String write(String data, String filename) {
        this.changeSource(filename);
        super._write(data);
        return this.source.toString();
    }
}