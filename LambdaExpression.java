/**
 * Functional Interface is an interface with exactly one abstract method
 * enabling its implementation with a lambda expression or method reference
 */

interface ABCD {
    void disp();
}


public class LambdaExpression {
    public static void main(String[] args)
    {
        //Functional Interface
        ABCD obj = new ABCD(){
            @Override
            public void disp() {
                System.out.println("This is a Functional Interface");
            }
        };
        obj.disp();

        //Lambda Expression
        ABCD obj1 = () -> System.out.println("This is Lambda Expression");
        obj1.disp();
    }
}
