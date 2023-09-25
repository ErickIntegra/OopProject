package ProjectClass23;

import java.util.ArrayList;
import java.util.List;

/*
7. You have a list of strings and you want to keep only those that start
with “A” and you want to return them in lower case"

 */
public class Task7 {
    public static List<String> toLowercase(List<String> inputList) {
        List<String> filteredList = new ArrayList<>();

        for (String str : inputList) {
            if (str.startsWith("A")) {
                filteredList.add(str.toLowerCase());
            }
        }

        return filteredList;
    }

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("Apple");
        inputList.add("Banana");
        inputList.add("Avocado");
        inputList.add("Orange");

        List<String> filteredAndLowercaseList = toLowercase(inputList);

        System.out.println("Filtered and lowercase strings starting with 'A':");
        for (String str : filteredAndLowercaseList) {
            System.out.println(str);
        }
    }
}
