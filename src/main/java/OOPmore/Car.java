package OOPmore;

public class Car extends Vehicle  implements Comparable<Car>{
    private int passengerCapacity;
    private String RegNo;

    private static int numberofCars = 0;




    Car(String regNo, int passengerCapacity, int velocity) {
        this.passengerCapacity = passengerCapacity;
        this.RegNo = regNo;
        this.velocity = velocity;
        numberofCars++;
    }

    public static int getNumberfCars() {
        return numberofCars;
    }


    @Override
    public int compareTo(Car o) {
        if (this.velocity > o.velocity) return 1;
        else if (this.velocity < o.velocity) return -1;
        else return 0;
    }

    public void pickUpUber() {
        System.out.printf("This Car with Reg NO %s with Capacity %d is picking up passenger\n", RegNo, passengerCapacity);
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public String toString() {
        return "Car{" +
                "RegNo=" + RegNo +
                ", passengerCapacity='" + passengerCapacity + '\'' +
                ", velocity=" + velocity +
                '}';
    }
}
