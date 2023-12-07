package BasicOOPUtility;

import BasicOOP.Person;


public class Utilities {

    Person[] persons;

    public Utilities(Person[] persons) {
        this.persons = persons;
    }

    public void increaseAge() {
        for (Person person : persons){
            person.setAge(person.getAge()+1);
        }
    }




}
