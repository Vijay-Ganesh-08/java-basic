public class FinalKeyword {

    public static void main(String[] args) {
        B objb = new B();
        objb.display();
        objb.display1();
    }
}


class A {
    void display() {
        System.out.println("Class A");
    }
    final void display1() {
        System.out.println("Final Class A");
    }
}

class B extends A {

    void display() {
        System.out.println("Class B");
    }
}