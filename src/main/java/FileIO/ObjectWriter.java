package FileIO;

import java.io.*;


//must implement interface **serializable to use Object Writer, most java classes already implement it.
class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

public class ObjectWriter {
    public static void main(String[] args) {
        String fileName = "person.ser";

        // Writing objects to a file
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            Person person1 = new Person("John Doe", 30);
            Person person2 = new Person("Jane Smith", 25);

            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(person2);
        } catch (IOException e) {
            System.err.println("Error writing objects to file: " + e.getMessage());
        }

        // Reading objects from a file
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            Person loadedPerson1 = (Person) objectInputStream.readObject();
            Person loadedPerson2 = (Person) objectInputStream.readObject();

            System.out.println("Loaded Person 1: " + loadedPerson1);
            System.out.println("Loaded Person 2: " + loadedPerson2);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading objects from file: " + e.getMessage());
        }
    }
}
