package BasicOOPUtility;

import BasicOOP.Person;


public class Utilites {

    Person[] persons;

    public Utilites(Person[] persons) {
        this.persons = persons;
    }

    public void increaseAge() {
        for (Person person : persons){
            person.setAge(person.getAge()+1);
        }
    }




}
