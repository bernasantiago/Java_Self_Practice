package JD13_oop_intheritance.State;

public class StateClients {
    public static void main(String[] args) {

        Virginia virginia = new Virginia("Virginia","VA","Democratic","Glenn Youngkin",
                "Mark warner", 9);

        System.out.println(virginia);
       // virginia.setGovernor(""); // The governor must not be null, empty, or blank.
       // virginia.setAbbreviation(null);
        // virginia.setName(" ");
        //virginia.setPoliticalParty(null);
        //virginia.setPopulation(0);   The population must be greater than zero.

        California california = new California("California", "CA","Democratic", "Gavin Newsom",
                "Alex Padilla", 40);

        System.out.println(california);
        //california.setName("");
        //california.setAbbreviation("");
        //california.setPoliticalParty(null);
        //california.setPopulation(-5);

        Texas texas = new Texas("Texas", "TX","Republican ", "Greg Abbott",
                "Ted Cruy", 30);

        System.out.println(texas);

        Florida florida = new Florida("Florida", "FL", "Republican", "Ron DeSantis",
                "Rick Scott", 22);

        System.out.println(florida);

    }



}
/*
3. Create a class named 'StateClients':
   - Create multiple objects representing different states.
   - Test the methods and variables of each object.
 */