package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor(Long id) {
        super(id);
    }
    public void teach(Learner learner, double numberOfHours){
        learner.learn(numberOfHours);


    }

    public void lecture(Learner[] learners, double numberOfHours){
        //How do we teach a group of learners
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner element :learners){
            teach(element,numberOfHoursPerLearner);
        }



    }



}
