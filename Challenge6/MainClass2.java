package Challenge6;

abstract class Animal{

    String name;
    Animal(String name){
        this.name = name;
    }
    abstract void makeSound();
}

class Dog extends Animal{

    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name);
        System.out.println("Barks...");
    }
}

class Cat extends Animal{
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name);
        System.out.println("Meoww...");
    }
}
public class MainClass2 {
    public static void main(String[] args){
        Dog d1 = new Dog("Betty");
        d1.makeSound();
        Cat c1 = new Cat("Catsy");
        c1.makeSound();
    }
}
