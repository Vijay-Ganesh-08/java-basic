public class challenge5 {

    public static void main(String[] args){

        Animal a = new Animal();
        System.out.println("Name:"+a.name+" Age:"+a.age);
        a.makesSound();

        Dog a1 = new Dog();
        a1.name = "winny";
        a1.age = 2;
        a1.breed = "German Shepherd";
        System.out.println("Name:"+a1.name+" Age:"+a1.age+" breed:"+ a1.breed);
        a1.makesSound();
        a1.fetch();

        Cat c1 = new Cat();
        c1.name = "Casie";
        c1.age = 1;
        c1.color = "white";
        System.out.println("Name:"+c1.name+" Age:"+c1.age+" color:"+c1.color);
        c1.makesSound();
        c1.climb();
    }
}

class Animal {
    String name;
    int age;
    void makesSound(){
        System.out.println("Animals makes sound");
    }
}

class Dog extends Animal{
    String breed;

    @Override
    void makesSound(){
        System.out.println("Dog Barks");
    }

    void fetch(){
        System.out.println("Dog is fetching");
    }

}

class Cat extends Animal{
    String color;

    @Override
    void makesSound(){
        System.out.println("Cat Meows");
    }

    void climb(){
        System.out.println("Cat is climbing");
    }

}