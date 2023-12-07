package OOPmore;

public class AirCargo extends Vehicle implements CargoVehicle{
    int cargoCapacity;

    AirCargo(int velocity) {

    }

    @Override
    public void pickupCargo() {
        System.out.printf("This Cargo vehicle is picking up cargo, its class is %s\n", this.getClass().toString());
    }

    @Override
    public void move() {
        System.out.println("Air Cargo is flying");
    }
}
