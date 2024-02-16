package JD14_abstraction_interface_poly.CarTask;

public interface AutoPilot extends AutoPark{

    boolean hasAutoPilot= true;

    void selfDrive();
}
/*
3. Create a Child Interface of AutoPark Named 'AutoPilot':
    - Note: Use the 'extends' keyword for inheritance.
    - Variables:
        - hasAutoPilot
    - Abstract Method:
        - selfDrive()
 */