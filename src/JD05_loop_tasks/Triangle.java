package JD05_loop_tasks;

public class Triangle {

    public static void main(String[] args) {

        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= row; column++) {

                System.out.print("* ");

            }
            System.out.println();


        }

        System.out.println("================");



    }


}
/*
7. Create a class named Triangle and use a nested loop to display the following shape on the console:

				*
				* *
				* * *
				* * * *
				* * * * *
				* * * * * *
				* * * * * * *
				* * * * * * * *
				* * * * * * * * *
				* * * * * * * * * *
 */
