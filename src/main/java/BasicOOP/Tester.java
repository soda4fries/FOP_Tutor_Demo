package BasicOOP;


import BasicOOPUtility.Utilities;

import java.util.Arrays;

/**
 * We will go through basics of OOP in here
 *
 *
 * @author Soda4fries
 */

public class Tester {
    public static void main(String[] args) {


        //Go through this and hold ctrl then with mouse to on Class Name / method name to goto definition

        //Object construction, goto person and check constructor
        //Also learn about accessor and mutators, e.g encapsulation
        Person person1 = new Person("X", 21);
        Person person2 = new Person("Y", 20);

        System.out.println(person1.getName());
        System.out.println(person2);

        //static is from Class not each Object, check TotalPerson variable and getTotal method, notice static tag
        System.out.println("Total Count:" + Person.getTotalPerson());

        //Static method and non-static methods
        System.out.println("Age Gaps:");
        System.out.println(Person.ageGap(person1,person2)); // static method, no information from any person
        System.out.println(person1.ageGap(person2)); // information from person1
        System.out.println(person2.ageGap(person1)); // information from person2


        //Inheritance object creation, Check constructor, super() means Person Constructor is called.
        Student student1 = new Student("A", 25, "CS");
        Student student2 = new Student("B", 25, "CS");
        System.out.println(student2);

        //Method from Student class
        // **Person1.gotClass() will not work as only children has this method**
        student1.gotoClass();



        //Methods from parent will work
        System.out.println(student1.ageGap(student2));
        //This will work as expected as age is inherited from person
        System.out.println(student1.ageGap(person1));

        //Method overriding
        person1.isHappy(); // in parent
        student1.isHappy(); // overridden in children

        //so the override method will be executed, this is how println and stuff work, as all object have toString(),
        // and they can be overridden by inherited classes.
        isHappyTester(student1);
        isHappyTester(person1);
        isHappyTester(new Person("P", 25));


        //Constructor in Student calls super() from parent, so total person increases with student
        System.out.println("Total Count:" + Person.getTotalPerson());


        Person[] manyPeople = {
                new Person("T1", 25),
                new Person("T2", 27),
                new Student("T4", 20, "CS")
        };


        //We have created a package with function that work on people, then import it just like u import Arrays, Scanners etc
        //Because it is in different Package eg Folder must be imported, check the import part and the Utilities
        Utilities util = new Utilities(manyPeople);
        util.increaseAge(); //used a function in the util


        //Print it out using java provided utils that work more generally on objects
        System.out.println(Arrays.toString(manyPeople));

    }

    public static void isHappyTester(Person x) {
        x.isHappy();
    }

}
