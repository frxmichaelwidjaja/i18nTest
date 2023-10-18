package core;

import java.io.*;
import java.util.*;

public class LangController {

    public static HashMap<String, String> langMap;

    public static HashMap<String, String> getLangMap() {
        return langMap;
    }

    public static void setLangMap(HashMap<String, String> langMap) {
        LangController.langMap = langMap;
    }

    /**
     * This method is to get hashmap for lang packaged.
     * @param filename
     * @return
     */
    public static HashMap<String, String> getExpectedHashMap(String filename){
        HashMap<String, String> content = new HashMap<String, String>();
        String path=filename;
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                content.put(data.split("; ")[0],data.split("; ")[1]);
            }
            myReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return content;
    }

}
