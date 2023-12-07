package FileIO;

import java.io.*;

public class DataWriterPrimitives {
    public static void main(String[] args) {
        String fileName = "primitives.dat";

        // Writing primitive data to a file
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            int intValue = 42;
            double doubleValue = 3.14;
            boolean booleanValue = true;

            dataOutputStream.writeInt(intValue);
            dataOutputStream.writeDouble(doubleValue);
            dataOutputStream.writeBoolean(booleanValue);
        } catch (IOException e) {
            System.err.println("Error writing primitives to file: " + e.getMessage());
        }

        // Reading primitive data from a file
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(fileName))) {
            int loadedIntValue = dataInputStream.readInt();
            double loadedDoubleValue = dataInputStream.readDouble();
            boolean loadedBooleanValue = dataInputStream.readBoolean();

            System.out.println("Loaded int value: " + loadedIntValue);
            System.out.println("Loaded double value: " + loadedDoubleValue);
            System.out.println("Loaded boolean value: " + loadedBooleanValue);
        } catch (IOException e) {
            System.err.println("Error reading primitives from file: " + e.getMessage());
        }
    }
}
