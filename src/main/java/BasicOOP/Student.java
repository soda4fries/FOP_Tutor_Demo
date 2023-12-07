package BasicOOP;

public class Student extends Person{
    private String major;

    {
        System.out.println("Student class loaded");
    }

    Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
        System.out.println("Student Created");
    }

    public String getMajor() {
        return major;
    }

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
