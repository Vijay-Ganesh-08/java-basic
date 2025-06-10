package Interface;
/**
 * Interface methods are abstract by default.
 * Any Class that implements an interface should implement all the methods defined in the interface
 * Any variables defined are public static final.
 */
interface Animal{
    int mark = 10;
    void sound();
    //void test();
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Barks..");
    }
}
public class MainClass {

    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.sound();
        System.out.println(Animal.mark);
    }
}
