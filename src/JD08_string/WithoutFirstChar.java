package JD08_string;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word: ");

        String word1 = input.next();

        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter second word");

        String word2 = input2.next();

        input.close();

        String result = word1.substring(1) + word2.substring(1);
        System.out.println(result);





    }

    /*
     Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana
     */
}
