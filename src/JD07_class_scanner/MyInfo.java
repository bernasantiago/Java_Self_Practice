package JD07_class_scanner;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt(); //19

        System.out.println("Enter your gender");
        String gender = input.next(); //Male

        input.nextLine(); //EnterEnter

        System.out.println("Enter your full name");
        String fullName = input.nextLine();  //if the previous scanner' method that's used is not nextLine(), then we need provide one more nextLine Method

        System.out.println("Enter your phone number");
        long phone = input.nextLong();

        System.out.println("Enter your zip code");


        input.nextLine();

        System.out.println("Enter your school name");
        String schoolName = input.nextLine();

        System.out.println("Enter your city name");
        String city = input.nextLine();

        System.out.println("Enter your state name");
        String state = input.next();

        System.out.println("Enter your building number");
        int buildingNum = input.nextInt();

        input.nextLine();

        System.out.println("Enter your Street name");
        String street = input.nextLine();

        input.close();


        System.out.println("Full name: " + fullName);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Phone number: " +phone);
        System.out.println("Address: \n\t"+buildingNum+" "+street+"\n\t"+city+", "+state+" ");
         System.out.println("School name: "+schoolName);

    }


}
/*
11. Create a class called MyInfo and ask the user to:

      Enter your age (int)
      Enter your gender (String - One word ONLY)
      Enter your full name (String - Multiple words)
      Enter your phone number (long)
      Enter your zip code (int)
      Enter your School name (String - Can be Multiple words)
      Enter your city name (String - Can be Multiple words)
      Enter your state name (String - One word ONLY)
      Enter your building number (int)
      Enter your Street name

    Display all the inputs that the user entered in the following order in separate lines:

        Full name
        Age
        Gender
        Phone number
        Address:
             buildingNumber Street
             City, state zipCode
 */