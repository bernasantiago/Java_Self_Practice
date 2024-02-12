package JD06_methods;

public class MathUtility {
    public static void main(String[] args) {

        int result = calculate(10, 20 ,'+');
        System.out.println(result);

        double math = calculate(2.5 , 3.0, '*');
        System.out.println(math);

          int rest = square(8);
        System.out.println(rest);

       double num1 = square(1.5);
        System.out.println(num1);

        int num2 = cube(3);
        System.out.println(num2);

       double num3= cube(2.5);
        System.out.println(num3);
    }


    public static int calculate (int a, int b, char c){

         if ( c == '+'){
             return a+b ;
         } else if (c == '-') {
             return a -b ;
             
         } else if (c == '*') {
             return a*b ;

         } else if (c== '/') {
             return a/b ;

         }else {
             return 0;
         }



    }

    public static double calculate (double a, double b, char c){

        if ( c == '+'){
            return a+b ;
        } else if (c == '-') {
            return a -b ;

        } else if (c == '*') {
            return a*b ;

        } else if (c== '/') {
            return a/b ;

        }else {
            return 0;
        }

    }

    public static int square (int a){
        int kare = a *a ;
        return kare;
    }

    public static double square (double b){
        double num = b*b;
        return num ;
    }

    public static int cube ( int c) {
        int cube = c*c*c ;
        return cube ;
    }
    public static double cube ( double a ){
       double cube = a*a*a;
       return cube;
    }
}
/*
5. Create a class named MathUtility:

	5.1 Create a method named calculate that takes three arguments (Two integers and a char) and returns the result based on the operator.

		If the operator is +:
			The method should return the addition of the two numbers

		If the operator is -:
			The method should return the subtraction of the two numbers

		If the operator is *:
			The method should return the multiplication of the two numbers

		If the operator is /:
			The method should return the multiplication of the two numbers

	for any other operators, the method should return 0


			Example:
				int result = calculate(10, '+', 20);

			Output:
				30


	5.2 Overload the calculate method to handle double numbers.

			Example:
				double result = calculate(2.5, '*', 3.0);

			Output:
				7.5


	5.3 Create a method named square that takes an int and returns the square, hierarchically calling the
	calculate method to calculate the square.

			Example:
				int num = square(8);

			Output:
				64

	5.4 Overload the square method for double numbers.

			Example:
				double num = square(1.5);

			Output:
				2.25

	5.5 Create a method named cube that takes an int and returns the cube, hierarchically calling the
	square method to calculate the cube.

			Example:
				int num = cube(3);

			Output:
				9

	5.6 Overload the cube method for double numbers.

			Example:
				double num = cube(2.5);

			Output:
				15.625
 */