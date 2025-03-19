package Linear_and_Binary_Search;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {
    public static void main(String[] args) {
        // Use an absolute path or move the file to a known directory
        String filePath = "example.txt";
        String targetWord = "hello";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) { // BufferReader is used for faster speed
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {  // Ignore case for matching
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("The word \"" + targetWord + "\" appears " + count + " times.");
    }
}
