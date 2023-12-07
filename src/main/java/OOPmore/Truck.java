package OOPmore;

public class Truck extends Vehicle implements Comparable<Truck>, CargoVehicle{

    private int cargoCapacity;
    private String CassisNo;

    Truck(String cassisNo, int cargoCapacity, int velocity) {
        this.cargoCapacity = cargoCapacity;
        this.CassisNo = cassisNo;
    }

    public void pickUpUber() {
        System.out.printf("This Truck with Cassis No %s with Capacity %d is picking up passenger", CassisNo, cargoCapacity);
    }

    @Override
    public int compareTo(Truck o) {
        if (this.cargoCapacity > o.cargoCapacity) return 1;
        else if (this.cargoCapacity < o.cargoCapacity) return -1;
        else return 0;
    }

    @Override
    public void pickupCargo() {
        System.out.printf("This Truck is picking up cargo, its class is %s", this.getClass().toString());
    }

    @Override
    public void move() {
        System.out.println("Truck is moving");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "cargoCapacity=" + cargoCapacity +
                ", CassisNo='" + CassisNo + '\'' +
                ", velocity=" + velocity +
                '}';
    }
}
