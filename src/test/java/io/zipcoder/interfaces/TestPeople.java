package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd(){
        //: Given
        People people = new People();
        Person expected = new Person(-1L);

        //: When
        people.add(expected);
        Person actual = people.findId(expected.getId());

        //: Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testRemove(){
        // Given
        People people= new People();
        Person person= new Person(-1L);
        Person expected = null;
        people.add(person);


        // when
        people.remove(person);
        Person actual = people.findId(person.getId());
        // : Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testFindById(){
        // Given
        long id = -1;
        People people = new People();
        Person expected = new Person(id);
        people.add(expected);

        //When
        people.findId(id);
        Person actual = people.findId(id);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
