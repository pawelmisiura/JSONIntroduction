package com.spartaglobal.JSONIntroduction.StudentManager.JSONManager.StudentDeserialiser;

import org.json.simple.JSONObject;

public class StudentDTO {
    private JSONObject student;

    public StudentDTO(String fileName) {
        StudentJSONReader studentFileReader = new StudentJSONReader(fileName);
        student = studentFileReader.getStudentJsonDetails();
    }

    public String getFirstName(){
        return (String) student.get("firstName");
    }

    public String getLastName(){
        return (String) student.get("lastName");
    }

    public String getDegree(){
        return (String) student.get("degree");
    }

    public Long getAge(){
        return (Long) student.get("age");
    }
}
