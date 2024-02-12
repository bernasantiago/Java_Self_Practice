package JD04_practice_tasks;

public class AgeGroups {
    public static void main(String[] args) {

        int age = 42;
        String result;

        if (age >=0 && age <=20  ) {
            result = "Teenager";
        } else if (age >=21 && age <55) {
            result= "Adult" ;

        } else if (age >=55 && age <=150){
            result = "Senior";
            
        } else {
            result = "Invalid";
        }
        System.out.println(result);


    }
}
/*
8. Create a class named AgeGroups. An integer variable named age is given.
	Write a program that can determine the age group of a person. The age groups are:

		Infant (1 - 2)
		Toddler (3 - 5)
		Kid (6 - 9)
		Pre-Teen (10 - 12)
		Teenager (13 - 17)
		Young Adult (18 - 20)
		Adult (21 - 39)
		Young Middle-Aged Adult (40 - 49)
		Middle-Aged Adult (50 - 54)
		Very Young Senior Citizen (55 - 64)
		Young Senior Citizen (65 - 74)
		Senior Citizen (75 - 84)
		Old Senior Citizen (85+)
		If the age is negative or greater than 150, print "Invalid."


			Example:
				   age = 42

			Output:
				  Young Middle-Aged Adult
 */