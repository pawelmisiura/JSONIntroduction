package com.spartaglobal.JSONIntroduction.StudentManager.JSONManager.StudentDeserialiser;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StudentJSONReader {

    private JSONObject studentJsonDetails;

    public StudentJSONReader(String fileName){
        try {
            //simple file reader object
            FileReader studentJSON = new FileReader(fileName);

            //deserialising string to object.
            JSONParser jsonParser = new JSONParser();
            Object studentObject = jsonParser.parse(studentJSON);

            //JSON simple needs a cast from object to the JSON simple object of JSONObject
            studentJsonDetails = (JSONObject) studentObject;

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public JSONObject getStudentJsonDetails(){
        return studentJsonDetails;
    }
}
