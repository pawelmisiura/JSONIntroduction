package com.spartaglobal.JSONIntroduction;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.spartaglobal.JSONIntroduction.StudentManager.JSONManager.StudentDeserialiser.StudentDTO;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    StudentDTO studentDTO = new StudentDTO("resources/student.json");

    @Test
    public void getFirstNameTester() {
        assertEquals("Bill", studentDTO.getFirstName());
    }

    @Test
    public void getLastNameTester() {
        assertEquals("Smith", studentDTO.getLastName());
    }

    @Test
    public void getDegreeTester() {
        assertEquals("CompSci 2,2", studentDTO.getDegree());
    }

    @Test
    public void getAgeTester() {
        assertEquals(Long.valueOf(22), studentDTO.getAge());
    }
}
