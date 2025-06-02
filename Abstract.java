/**
 * Abstract methods can be declared only in abstract class.
 * Abstract methods inside abstract class cannot have a body.
 * Abstract method can have non-abstract methods,
 * But any abstract method should be overridden by all of its child class
 */

public class Abstract {

    public static void main(String[] args){
        bike b1 = new bike();
        b1.speed();
        cars c1 = new cars();
        c1.speed();
    }

}

abstract class Vehicle {
    abstract void speed();
}

class bike extends Vehicle{
    @Override
    void speed(){
        System.out.println("50KM/hr");
    }
}

class cars extends Vehicle{
    @Override
    void speed() {
        System.out.println("100KM/hr");
    }
}