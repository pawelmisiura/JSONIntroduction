package com.spartaglobal.JSONIntroduction.StudentManager.JSONManager.serialiser;

import com.spartaglobal.JSONIntroduction.StudentManager.StudentFactory;
import org.json.simple.JSONObject;

public class JsonStudentFactory {

    private JSONObject studentJson = new JSONObject();


    public JsonStudentFactory(StudentFactory student){
        studentJson.put("firstName", student.getFirstName());
        studentJson.put("lastName" , student.getLastName());
        studentJson.put("degree" , student.getDegree());
        studentJson.put("age" , student.getAge());
    }

    public void printStudentJSON(){
        System.out.println(studentJson);
    }
}
