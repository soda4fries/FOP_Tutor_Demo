package FileIO;

import java.io.File;

public class FileEnumerator {

    public static void main(String[] args) {
        // Specify the directory path to start enumerating
        String directoryPath = "D:\\File_IO_OOP_learning";

        // Create a File object for the specified directory
        File directory = new File(directoryPath);

        // Check if the specified path is a directory
        if (directory.isDirectory()) {
            // Start the enumeration with initial indentation of 0
            enumerateFilesAndDirectories(directory, 0);
        } else {
            System.out.println("The specified path is not a directory.");
        }
    }

    // Recursive method to enumerate files and directories with indentation
    private static void enumerateFilesAndDirectories(File directory, int depth) {
        // Get all files and directories in the current directory
        File[] files = directory.listFiles();

        // Check if the array is not null (directory may be empty)
        if (files != null) {
            // Iterate through each file or directory
            for (File file : files) {
                // Print the indented file/directory path
                printIndentedPath(file, depth);

                // If it's a directory, recursively call the method with increased depth
                if (file.isDirectory()) {
                    enumerateFilesAndDirectories(file, depth + 1);
                }
            }
        }
    }

    // Helper method to print indented file/directory path
    private static void printIndentedPath(File file, int depth) {
        // Create a string with spaces for indentation based on the depth
        String indentation = "  ".repeat(Math.max(0, depth));

        // Print the indented file/directory path
        System.out.println(indentation + file.getAbsolutePath());
    }
}
