package OOPmore;

public class Benz extends Car{
    String engineName;
    Benz(String regNo, int passengerCapacity, int velocity, String engineName) {
        super(regNo, passengerCapacity, velocity);
        this.engineName = engineName;
    }

    @Override
    public void pickUpUber() {
        System.out.printf("Picking up uber in Benz\n");
    }

    public void getSpecialOil() {
        System.out.printf("Getting special oil for %s engine\n", engineName);
    }
}
