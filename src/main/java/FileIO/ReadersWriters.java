package FileIO;

import java.io.*;
import java.util.Scanner;

public class ReadersWriters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        String fileName = "example.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Hello, Java IO!");
            System.out.println("FLUSH?"); //Check example.txt file, Hello, JAVA IO was not written yet.
            scan.nextLine();
            writer.flush();
            System.out.println("Continue?"); //Check before continueing
            scan.nextLine();
            writer.newLine(); // Add a newline character
            writer.write("This is a simple example.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Reading from a file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

        try (Scanner reader = new Scanner(new FileReader(fileName))) {
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
