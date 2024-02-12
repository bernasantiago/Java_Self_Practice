package JD04_practice_tasks;

public class FINRA {

    public static void main(String[] args) {

        int number = 15;

        if( number % 3==0 && number % 5 ==00 ){
            System.out.println("FINDA");

        } else if ( number % 5 == 0 ) {
            System.out.println("RA");

        } else if ( number % 3==0) {
            System.out.println("FIN");

        }else {
            System.out.println("number");
        }
    }
}
/*
3. Create a class called FINRA. Write a function that prints out the number.
	For a number that is a multiple of 3, print "FIN" instead of the number.
	For a number that is a multiple of 5, print "RA" instead of the number.
	For a number that is a multiple of both 3 and 5, print "FINRA" instead of the number.

			Example:
				   number = 15

			Output:
				  FINRA
 */