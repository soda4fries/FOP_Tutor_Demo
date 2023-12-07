package BasicOOP;


/**
 * Simple Parent Class
 *
 *
 * @author Soda4fries
 */

public class Person {
    private String name;

    //private so that it can be modified in a specified way only, see set ages and search **encapsulation**
    // and ***OOP data abstraction
    // also check constructor and setAge
    private int age;

    private static int totalPerson = 0;

    {   //Executed when class first loaded independent of constructor.
        System.out.println("Person Class Loaded");
    }

    Person(String name, int age) {
        this.name = name;
        setAge(age); // check this method
        totalPerson++;
        System.out.println("Person Created");
    }

    //accessor
    public String getName() {
        return name;
    }


    //mutator
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        if (age < 0) throw new RuntimeException("Invalid age"); // having data private and using mutators allow us to make sure only valid values are applied
        this.age = age;
    }

    public void setAge(String yearBorn) {
        this.age = 0; // lets say u find age from year born to today instead of giving it fixed
    }

    public static int getTotalPerson() {
        return totalPerson;
    }

    @Override
    public String toString() {
        return String.format("""
                Person:
                Name - %s
                Age - %d
                """,
                name,
                age
                );
    }

    public static int ageGap(Person x, Person y) {
        return x.age - y.age;
    }

    public int ageGap(Person x) {
        return this.age - x.age;
    }

    public void isHappy() {
        System.out.printf("Person %s is happy\n", getName());
    }
}
