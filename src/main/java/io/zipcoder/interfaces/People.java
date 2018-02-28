package io.zipcoder.interfaces;

import jdk.nashorn.internal.lookup.Lookup;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class People {
    private ArrayList<Person> personList = new ArrayList<Person>();

    public void add(Person person) {
        personList.add(person);

    }

    public Person findId(long id) {
        // look through each item
        // if that item's property is what we are looking for
        // then keep it; return that bitch.
        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }


        }
        return null;
    }
    public void remove(Person person){
        personList.remove(person);

    }
    public void remove(long id){
        Person person = findId(id);
        this.remove(person);


    }
    public int getCount(){
        return personList.size();
    }
    public Person[] getArray(){
        Person[] persons = new Person[personList.size()];
        for (int i =0; i <persons.length;i++){
            Person currentPerson =personList.get(i);
            persons[i] = currentPerson;
        }
        return persons;
        //return personList.toArray(getArray());
    }
    public void removeAll(){
        personList.clear();
    }


}







