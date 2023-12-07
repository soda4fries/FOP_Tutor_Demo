package OOPmore;

import java.util.Arrays;

/**
 * We will go through some more OOP
 *
 *
 * @author Soda4fries
 */

public class Tester {
    public static void main(String[] args) {

        //Basic OOP see if u understand and identify what's happening

        Car car1 = new Car("1", 4, 100);
        Car car2 = new Car("2", 5, 150);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(Car.getNumberfCars());

        Benz benz1 = new Benz("3", 2, 1000, "V10");
        benz1.pickUpUber();
        benz1.getSpecialOil();



        //Check Vehicle class
        //also u cannot initialize Vehicle vehcle1 = new Vehicle() as it is abstract, as we have too less information about
        //how it behaves



        //All of this inherit from Vehicle, so they can be cast to vehicle
        //we can only access vehicle property not car, so no vehicle1.pickUpUber(), only move() but later we will learn
        // about instanceOf, which will solve this.
        Vehicle vehicle1 = new Car("122312", 4, 10);




        // We can now initiallze an array of vehicles
        Vehicle[] vehicles = {  new Truck("AAAB", 250, 250),
                                new Car("1122", 4, 100),
                                new AirCargo(250)};

        //This can be useful for say there is different type of object that do same thing and we want to perform same
        // on all of them
        for (Vehicle vehicle: vehicles) {
            vehicle.move();
        }


        // now we are using instanceOf to see if they have more ability and if so performing them
        // but notice VehicleCargo is an interface, so interface can be used to tag classes with specific behavior
        // check interface VehicleCargo, then check Truck, AirCargo, they have overriden the same method
        // this is useful as we can only inherit from only class but have several interface
        //  basically specify which methods class must have
        for (Vehicle vehicle: vehicles) {
            vehicle.move();
            if (vehicle instanceof Car x) x.pickUpUber();
            if (vehicle instanceof CargoVehicle x) x.pickupCargo();

        }


        Car[] cars = {  new Car("23", 4, 100),
                        new Car("24", 4, 150),
                        new Car("24", 4, 125)};
        Truck[] trucks = {  new Truck("112", 500, 15),
                            new Truck("113", 600, 192),
                            new Truck("113", 600, 500), };

        //Check Cars and Truck Class, then their compareTo() method
        //Cars and trucks have implemented Comparable Interface, so they can use the Arrays.sort, Collectinons.sort etc
        //Learn more about Comparable to understand how it works. Most used interface in FOP, DS everything lol then
        //learn Comparator but ltr as more advanced.
        //Cars have CompareTo with velocity, so it is sorted by velocity.
        //Track will be sorted by Cargo Capacity.
        Arrays.sort(cars);
        Arrays.sort(trucks);

        System.out.println();
        System.out.println(Arrays.toString(cars));
        System.out.println(Arrays.toString(trucks));



    }
}