package JD05_loop_tasks;

public class FINRA {

    public static void main(String[] args) {

        int n=100;
        int a=1;

        while (a<=n){

            if (a %3==0 && a%5 ==0){
                System.out.print("FINRA ");

            } else if ( a %3==0) {
                System.out.print("FIN ");

            }else if (a %5==0){
                System.out.print("RA  ");
            } else {
                System.out.print(a + " ");
            }
            a++;


        }
        System.out.println();

    }
}

/*
6. Create a class named FINRA. and write a program that prints the numbers from 1 to 100. For numbers that
are multiples of both 3 and 5, print "FINRA" instead of the number. For numbers that are multiples of 3, print
"FIN" instead of the number, and for numbers that are multiples of 5, print "RA" instead of the number.

				Example:
					1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN...
 */





