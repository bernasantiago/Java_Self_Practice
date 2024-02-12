package JD06_methods;

public class DayAndMonth {

    public static void main(String[] args) {

         String day = day(5);
        System.out.println(day);

        String result = monthName(6);
        System.out.println(result);

        String monthday = daysInMonth(6);
        System.out.println(monthday);



    }

    public static String day(int a) {          // return type is String, will return value in main method.
        switch (a) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return " Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday ";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Monday";


        }
    }

    public static String monthName(int month) {
        String result = " ";
        switch (month) {
            case 1 -> result = "January";
            case 2 -> result = "February";
            case 3 -> result = "March";
            case 4 -> result = "April";
            case 5 -> result = "May";
            case 6 -> result = "June";
            case 7 -> result = "July";
            case 8 -> result = "August";
            case 9 -> result = "September";
            case 10 -> result = "October";
            case 11 -> result = "November";
            case 12 -> result = "December";
            default -> result = "Invalid Number";
        }
        return result;


    }

    public static String daysInMonth(int x) {


        if (x == 1) {
            return "January has 31 days";


        } else if (x == 2) {
            return "February has 28 days";

        } else if (x == 3) {
            return "March  has 31 days";

        } else if (x == 4) {
            return "April  has 30 days";

        } else if (x == 5) {
            return "May  has 31 days";
        }else if (x == 6) {
            return "June  has 30 days";
        }else if (x == 7) {
            return "July  has 31 days";
        }else if (x == 8) {
            return"August has 30 days";
        }else if (x == 9) {
            return"September  has 31 days";
        }else if (x == 10) {
            return"October has 30 days";
        }else if (x == 11) {
            return"November  has 31 days";
        } else  {
            return"December  has 30 days";


        }


    }
}

/*
3. Create a class named DayAndMonth:

	3.1 Create a method named day that displays the day's name based on the given number.
	If the number is invalid, print "Invalid Number".

			Example:
				day(5);

			Output:
				Friday

	3.2 Create a method named monthName that displays the month's name based on the given number.
	If the number is invalid, print "Invalid Number."


			Example:
				monthName(6);

			Output:
				June

	3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
	If the number is invalid, print "Invalid Number."

				Example:
					daysInMonth(6);

				Output:
					June has 30 days
 */




