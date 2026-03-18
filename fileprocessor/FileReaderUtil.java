package fileprocessor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This class provides a method to read a text file
 * and return its content as a list of strings.
 */
public class FileReaderUtil {

    /**
     * Reads a text file line by line.
     *
     * @param filePath The path of the file to read
     * @return A list containing each line of the file
     */
    public static ArrayList<String> readFile(String filePath) {
        ArrayList<String> lines = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return lines;
    }
}