package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor() {
        //Given
        long expectedId = 5L;// Given when you have a long id

        //When
        Person person = new Person(expectedId);// you create a person using that id
        long actualId = person.getId();
        //Then
        // expect is that person will hold a value of 5
        //Assert that our value will be the expected compared to the actual

        Assert.assertEquals(expectedId, actualId);

    }

    @Test
    //Create a testSetName method which ensures that a Person object's name variable is being set by invoking the .setName method.

    public void testSetName() {
        //Given
        //given a name and a person
        String expected = "SampleName";
        Person person = new Person(0L);

        //when
        // when we try to set the name
        person.setName(expected);
        // when we try to get the name
        String actual = person.getName();

        //then
        //we expect to see the given name
        Assert.assertEquals(expected, actual);



    }


    }

