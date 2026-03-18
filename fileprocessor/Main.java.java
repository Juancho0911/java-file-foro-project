package fileprocessor;

import java.util.ArrayList;

/**
 * This class demonstrates how to use FileReaderUtil.
 */
public class Main {

    public static void main(String[] args) {

        String filePath = "example.txt";

        ArrayList<String> fileContent = FileReaderUtil.readFile(filePath);

        // Using a for loop to display the content
        for (int i = 0; i < fileContent.size(); i++) {
            System.out.println("Line " + (i + 1) + ": " + fileContent.get(i));
        }
    }
}