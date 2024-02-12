package JD08_string;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter the first word: ");
        String word1 = input1.next();



        System.out.println("Enter second word: ");
        String word2 = input1.next();

        input1.close();

        String result;

        if (word1.charAt(word1.length()-1) == word2.charAt(0)){
            result= word1 + word2.substring(1);

        }else {
            result = word1 + word2;
        }

        System.out.println("result = " + result);





    }



}
/*
3. Create a class named CombineWords. Ask the user to enter two words. Then, add them together and print. But if the
last letter of the first word and the first letter of the second word are the same, print that character once.

        Example:
              Input:
                 one
                 eight

              Output:
                   oneight
 */