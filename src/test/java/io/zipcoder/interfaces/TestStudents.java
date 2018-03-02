package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void testStudentSingleton(){
        //Given
        // a Students singleton with students already in it
        Students ourListOfStudents =Students.getInstance();


        // When

        // Then
        // we expect to see the students from the constructor in it
        Assert.assertTrue(ourListOfStudents.findId(1) != null);
        Assert.assertTrue(ourListOfStudents.findId(2) != null);
        Assert.assertTrue(ourListOfStudents.findId(3) != null);
        Assert.assertTrue(ourListOfStudents.findId(4) != null);

    }
}
