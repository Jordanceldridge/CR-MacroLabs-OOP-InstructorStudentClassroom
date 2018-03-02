package io.zipcoder.interfaces;

public final class Instructors extends People {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        Instructor Tariq = new Instructor(1L);
        Instructor Nhu = new Instructor(2L);
        Instructor Whilhem = new Instructor(3L);
        Instructor Leon = new Instructor(4L);

        this.add(Tariq);
        this.add(Nhu);
        this.add(Whilhem);
        this.add(Leon);


    }

    public static Instructors getInstance(){
        return INSTANCE;

    }





}



