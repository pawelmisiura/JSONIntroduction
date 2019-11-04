package com.spartaglobal.JSONIntroduction;

import com.spartaglobal.JSONIntroduction.StudentManager.JSONManager.StudentDeserialiser.StudentDTO;
import com.spartaglobal.JSONIntroduction.StudentManager.StudentFactory;
import com.spartaglobal.JSONIntroduction.StudentManager.JSONManager.serialiser.JsonStudentFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

//        StudentFactory student1 = new StudentFactory("Bill", "Smith", "CompSci 2,2", 22);
//
//        JsonStudentFactory student1Json = new JsonStudentFactory(student1);
//        student1Json.printStudentJSON();

        StudentDTO studentDTO = new StudentDTO("resources/student.json");
        System.out.println(studentDTO.getAge());
        System.out.println(studentDTO.getFirstName());
        studentDTO.getLastName();
        studentDTO.getDegree();
    }
}
