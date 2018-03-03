package io.zipcoder.interfaces;

public class ZipCodeWilmington {

    Students students = Students.getInstance();
    Instructors instructors =Instructors.getInstance();
    private static final ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington();

    public void hostLecture(Teacher teacher , double numberOfHours){
        teacher.lecture(new Students[]{students},numberOfHours);

    }
    public void hostOfLecture(long id,double numberOfHours){
        Instructor forLecture =(Instructor) instructors.findId(id);
        hostLecture(forLecture,numberOfHours);


    }
    public static ZipCodeWilmington getInstance(){
        return zipCodeWilmington;
    }



}
