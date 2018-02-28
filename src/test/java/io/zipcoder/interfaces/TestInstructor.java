package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void TestImplementation(){
        //Given
        Instructor instructor = new Instructor(-1L);

        // When
        // When i check the type of instructor
        //: Then
        // then the type should be teacher
        Assert.assertTrue(instructor instanceof Teacher);
    }
    @Test
    public void testInheritance(){
    Instructor instructor = new Instructor(-1L);


    Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void testTeach() {
        //Given
        Teacher teacher = new Instructor(-1L);
        Student student = new Student(-1L);
        double numberOfHours = 72;

        //: When
        teacher.teach(student, numberOfHours);
        double actual = student.getTotalStudyTime();


        // : Then
        Assert.assertEquals(numberOfHours, actual);
    }
    @Test
    public void testLecture(){
        Teacher teacher = new Instructor(-1L);
        Student student1 = new Student(-1);
        Student student2 = new Student(-2);
        Student student3 = new Student(-3);
        Student[] studentsArray = new Student[]{student1,student2,student3};
        double numberOfHours =15;
        double expected =5;


        // When
        teacher.lecture(studentsArray,numberOfHours);
        // Then
        for (Student student: studentsArray){
            double actual = student.getTotalStudyTime();
            Assert.assertEquals(expected, actual,0);
        }


    }
}

