package src;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountingWhales {
    static String[] words; // changed our array to static property

    public static void main(String... arg) throws IOException {
        String filename = "moby-dick.txt";

        long numLines = numberOfLines(filename);
        System.out.println("Number of lines is " + numLines);

        long numWords = numberOfWords(filename);
        System.out.println("Number of words is " + numWords);

        long numWhales = numberOfOccurences(filename, "whales");
        System.out.println("Number of whales is " + numWhales);
    }

    public static long numberOfLines(String filename) throws IOException {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = br.readLine()) != null) {
                count++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found with name " + filename);
        }
        return count;
    }

    public static long numberOfWords(String filename) throws IOException {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = br.readLine()) != null) {
                words = line.split("\\s+");
                count += words.length;
                // count++;
            }
            // new word array, split line by whitespace, new line for each word, count num
            // of lines

        } catch (FileNotFoundException e) {
            System.out.println("File not found with name " + filename);
        }
        return count;
    }

    public static long numberOfOccurences(String filename, String word) throws IOException {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = br.readLine()) != null) {
                words = line.split("\\s+");

                for (String w : words)
                    if (w.toLowerCase().contains(word))
                        count++;

            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found with name " + filename);
        }
        return count;
    }
}