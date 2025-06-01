public class challenge5_2 {

    public static void main(String[] args){
        car c1 = new car();
        c1.brand = "Creta";
        c1.year = 2022;
        c1.fuelType = "Petrol";
        System.out.println("brand:"+c1.brand+" year:"+c1.year+" fuelType:"+ c1.fuelType);
        c1.startEngine();
        c1.drive();

        truck t1 = new truck();
        t1.brand="Mazda";
        t1.year=2023;
        t1.loadCapacity=120;
        System.out.println("brand:"+t1.brand+" year:"+t1.year+" loadCapacity:"+ t1.loadCapacity);
        t1.startEngine();
        t1.haul();
    }
}


class vehicle{
    String brand;
    int year;
    void startEngine(){
        System.out.println("Vehicle Engine Starts");
    }
}

class car extends vehicle{
    String fuelType;
    @Override
    void startEngine(){
        System.out.println("Car Engine Starts");
    }
    void drive(){
        System.out.println("Car is driving");
    }
}

class truck extends vehicle{
    int loadCapacity;
    @Override
    void startEngine(){
        System.out.println("Truck Engine Starts");
    }
    void haul(){
        System.out.println("Truck is hauling");
    }
}