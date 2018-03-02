package io.zipcoder.interfaces;

public final class Students extends People {
    private static final Students INSTANCE = new Students();

    private Students(){
        Student Bob = new Student(1);
        Student Jordan = new Student(2);
        Student Matt = new Student(3);
        Student Tyler = new Student(4);

        this.add(Bob);
        this.add(Jordan);
        this.add(Matt);
        this.add(Tyler);


    }

    public static Students getInstance(){
        return INSTANCE;

        }





    }



