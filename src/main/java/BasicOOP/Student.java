package BasicOOP;

/**
 * Simple Student Class that inherits from Parent.
 * This is a javaDoc u can see this when u hover over for definition.
 *
 * @author Soda4fries
 */

public class Student extends Person{
    private String major;

    static {
        System.out.println("Student class loaded");
    }



    /**
     * This is a javaDoc u can see this when u hover over for definition, hover over anywhere new Student() is used
     * Constructs a new `Student` object with the specified name, age, and major.
     *
     * @param name  The name of the student.
     * @param age   The age of the student.
     * @param major The major or field of study of the student.
     */
    Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
        System.out.println("Student Created");
    }

    public String getMajor() {
        return major;
    }


    /**
     * Indicates that the student is going to attend a class.
     * Displays a message with the student's name.
     * You can see this documentation when hovering over {@code gotoClass()} where it is used.
     *
     * @see Person#getName()
     */
    public void gotoClass() {
        System.out.printf("%s Going to class\n", getName());
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return String.format("""
                Student:
                Name - %s
                Age - %d
                Major - %s
                """,
                super.getName(),
                getAge(),
                major
        );
    }

    @Override
    public void isHappy() {
        System.out.printf("Student %s is not happy\n", getName());
    }
}
