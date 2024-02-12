package JD05_loop_tasks;

public class FactorialNumber {

    public static void main(String[] args) {

        int factor = 1;
        int number = 5;

        for (int i = number; i >= 1; i--) {
            factor *= i;

        }
        System.out.println(factor);
    }


}


/*
5. Write a program that can return the factorial number of any given number.

				Example:
					  num = 5

				Output:
					  120

			(because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */