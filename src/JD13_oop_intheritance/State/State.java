package JD13_oop_intheritance.State;

public class State {

    private String name, abbreviation, politicalParty,Governor,senator;

    private int population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()){
            System.err.println("The name must not be null, empty, or blank.");
            System.exit(1);
        }

        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation == null || abbreviation.isBlank() || abbreviation.isEmpty()){
            System.err.println("The abbreviation must not be null, empty, or blank.");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty == null || politicalParty.isBlank() || politicalParty.isEmpty()){
            System.err.println("The political party must not be null, empty, or blank.");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return Governor;
    }

    public void setGovernor(String governor) {
        if (governor == null || governor.isBlank() || governor.isEmpty()){
            System.err.println("The governor must not be null, empty, or blank.");
            System.exit(1);
        }
        Governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if (senator == null || senator.isBlank() || senator.isEmpty()){
            System.err.println("The senator must not be null, empty, or blank.");
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population <= 0){
            System.err.println("The population must be greater than zero.");
            System.exit(1);
        }
        this.population = population;
    }

    public State(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}
/*
1. Create a class named 'State' with the following specifications:
   Attributes:
       - name: String
       - abbreviation: String
       - politicalParty: String
       - Governor: String
       - senator: String
       - population: int

   Encapsulation Requirements:
       - Ensure attributes are private with getters and setters.
       - Conditions for Encapsulation:
           - 'name', 'abbreviation', 'politicalParty', 'Governor', and 'senator' must not be null, empty, or blank.
           - 'population' must be greater than zero.

   Constructor:
       - Add a constructor to initialize all fields.

   Methods:
       - toString(): Prints the information of the State object.
 */