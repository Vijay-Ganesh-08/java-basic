/**
 * Java Inheritance is a fundamental concept in OOP(Object-Oriented Programming).
 * It is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class.
 * In Java, Inheritance means creating new classes based on existing ones.
 * A class that inherits from another class can reuse the methods and fields of that class.
 * In addition, you can add new fields and methods to your current class as well.
 */

class dad{
    int money = 1000;
}

class son extends dad{

}

public class Inheritance {

    public static void main(String[] args){
        son obj = new son();
        System.out.println(obj.money);
    }
}
