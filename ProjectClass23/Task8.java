package ProjectClass23;
/*
Write a Java Function that increments a string,
It should take the string of unknown length. Don't use regular
expressions.
Examples:
123 -> 124
53456 -> 53457
29 -> 30
Function signature:
string Increment (string str)
 */
public class Task8 {
    public static String increment(String str) {
        // Convert the input string to an integer
        int num = Integer.parseInt(str);

        // Increment the integer
        num++;

        // Convert the incremented integer back to a string
        return Integer.toString(num);
    }

    public static void main(String[] args) {
        String input1 = "123";
        String input2 = "53456";
        String input3 = "29";

        String result1 = increment(input1);
        String result2 = increment(input2);
        String result3 = increment(input3);

        System.out.println("Result 1: " + result1); // Output: 124
        System.out.println("Result 2: " + result2); // Output: 53457
        System.out.println("Result 3: " + result3); // Output: 30
    }
}
