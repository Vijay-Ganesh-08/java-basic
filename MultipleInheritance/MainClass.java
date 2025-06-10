package MultipleInheritance;

interface Printable{
    void Display();
}

interface Showable{
    void Display();
}

class mulInherticance implements Printable,Showable{

    @Override
    public void Display() {
        System.out.println("Multiple Inheritance");
    }
}

public class MainClass {

    public static void main(String[] args){
        mulInherticance obj = new mulInherticance();
        obj.Display();
    }
}
