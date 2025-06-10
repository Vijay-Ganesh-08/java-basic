package Challenge6;

//Static variable is shared across the class.
//Instance variable is instantiated for every object created.
class Counter{
    static int count = 0;
    int instanceNumber = 0;

    Counter(){
        count++;
        instanceNumber++;
    }

    void display(){
        System.out.println("InstanceNumber:"+instanceNumber);
        System.out.println("Static Count:"+count);
    }
}
public class MainClass1 {
    public static void main(String[] args){
        Counter c1 = new Counter();
        c1.display();
        Counter c2 = new Counter();
        c2.display();
        Counter c3 = new Counter();
        c3.display();
    }
}
