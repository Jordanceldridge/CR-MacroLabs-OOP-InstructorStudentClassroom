package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testInstructorSingleton(){
        Instructors ourInstructorsList = Instructors.getInstance();

        Assert.assertTrue(ourInstructorsList.findId(1) != null);
        Assert.assertTrue(ourInstructorsList.findId(2) != null);
        Assert.assertTrue(ourInstructorsList.findId(3) != null);
        Assert.assertTrue(ourInstructorsList.findId(4) != null);

    }

}
