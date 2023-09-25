package ProjectClass23;

import com.google.common.base.Splitter;

import java.util.Map;

/*
4. Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.
 */
public class Task4 {
    public static int countWords(String input) {
        // Split the input string into words using space and punctuation as delimiters
        String[] words = input.split("[\\s\\p{Punct}]+");

        // Return the count of words
        return words.length;
    }

    public static void main(String[] args) {
        String input = "Hello, world!";
        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);
    }
}
