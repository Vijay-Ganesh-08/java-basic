package Challenge6;

abstract class Vehicle{
    final void startEngine(){
        System.out.println("Engine Started");
    }

    static String getVehicleType(){
        return "Generic Vehicle";
    }
    Vehicle(){
        startEngine();
    }
    abstract void drive();
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Driving a car");
    }
}

class Bike extends Vehicle {
    @Override
    void drive() {
        System.out.println("Riding a bike");
    }
}

public class MainClass3 {

    public static void main(String[] args){
        Car c1 = new Car();
        c1.drive();
        Bike b1 = new Bike();
        b1.drive();
        System.out.println(Vehicle.getVehicleType());


    }
}
