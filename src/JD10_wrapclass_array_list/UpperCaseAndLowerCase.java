package JD10_wrapclass_array_list;

import java.util.Arrays;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {

        String str = "JAVA java";
        int upperCase = 0;
        int lowerCase = 0;

        for (char input : str.toCharArray()) {       //Converting the string into array character
            if (Character.isUpperCase(input)) {
                upperCase++;

            } else if (Character.isLowerCase(input)) {
                lowerCase++;

            }

        }
        boolean result = upperCase == lowerCase;
        System.out.println(result);

    }

    /*
    2. Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.

	        Eamplex:
	            str = "JAVA java";

	        output:
	            true
     */
}
