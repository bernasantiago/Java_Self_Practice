package JD10_wrapclass_array_list;

import java.util.Arrays;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {

        String str = "Wooden Spoon123!";     // string

        String letters = "";
        String  digits = " ";
        String specialchr = " ";


        for (char input : str.toCharArray()) {   // we converted str to string with toCharArray
            if (Character.isLetter(input)) {
                letters += input;

            } else if (Character.isDigit(input)) {
                digits += input;

            } else {
                specialchr += input;
            }


        }
        System.out.println("Letters = \" " + letters + "\"");
        System.out.println("Digits = \" " + digits + "\"");
        System.out.println("SpecialChars = \"" + specialchr + "\"");



    }
    /*
    1. Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";

     */
}
