package JD04_practice_tasks;

public class CrewAndPassenger {

    public static void main(String[] args) {

        /*
        Total: 50 ====> 20 crew, 30 passengers
		Total: 75 ====> 25 crew, 50 passengers
		Total: 100 ====> 30 crew, 70 passengers
		Any other number of people on the ship is not valid.
		Print how many of each type there should be.

         */

        int  number = 75 ;

        switch (number) {
            case 50 :
                System.out.println("20 crew, 30 passengers");
                break;
            case 75:
                System.out.println("25 crew, 50 passengers");
                break;
            case 100 :
                System.out.println("30 crew, 70 passengers");
                break;
            default:
                System.out.println("Invalid");
    }
}}
/*
7. Create a class called CrewAndPassenger. Given the total number of people on the ship,
	determine how many should be crew members and how many can be passengers.

		Total: 50 ====> 20 crew, 30 passengers
		Total: 75 ====> 25 crew, 50 passengers
		Total: 100 ====> 30 crew, 70 passengers
		Any other number of people on the ship is not valid.
		Print how many of each type there should be.

			Example:
				   number = 75

			Output:
				  25 crew, 50 passengers
 */