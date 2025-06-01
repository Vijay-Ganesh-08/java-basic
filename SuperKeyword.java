public class SuperKeyword {

    //Super Keyword is used to call the constructors of a Parent class from Child Class

    public static void main(String[] args){
        Dog d1 = new Dog();
    }
}


class Animal{
    int age = 5;
    Animal(){
        System.out.println("Animal Default Constructor");
    }
    Animal(String name){
        System.out.println("Animal Name: "+ name);
    }
    void MakesSound(){
        System.out.println("Animal Makes Sound");
    }
}

class Dog extends Animal{
    Dog(){
        //super(); //Calls by default
        super("Timmy"); //Calling Parameterized Constructor
        System.out.println("Dog Default Constructor");
        super.MakesSound();
        System.out.println("Age:" + super.age);

    }
}