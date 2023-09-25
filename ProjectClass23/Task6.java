package ProjectClass23;

/*
 6) Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'
 */
public class Task6 {
    public static char firstNonRe(String str) {
        // Create an array to store character frequencies
        int[] charCount = new int[25]; // Assuming only lowercase letters

        // Count character frequencies
        for (char c : str.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Iterate through the string to find the first non-repeating character
        for (char c : str.toCharArray()) {
            if (charCount[c - 'a'] == 1) {
                return c;
            }
        }

        // If there are no non-repeating characters, return a placeholder (e.g., '\0')
        return '\0';
    }

    public static void main(String[] args) {
        String input = "umberella";
        char firstNonRepeating = firstNonRe(input);

        if (firstNonRepeating != '\0') {
            System.out.println("The first non-repeating character is: " + firstNonRepeating);
        } else {
            System.out.println("There are no non-repeating characters in the string.");
        }
    }
}
