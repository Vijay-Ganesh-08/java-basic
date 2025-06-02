public class AccessModifiers {

    /**
     * In Java, access modifiers are essential tools that define how the members of a class,
     * like variables, methods, and even the class itself can be accessed from other parts of our program.
     * They are an important part of building secure and modular code when designing large applications.
     * -- default, private, protected, and public
     * default - This means only classes within the same package can access it.
     * private - The methods or data members declared as private are accessible only within the class in which they are declared.
     * protected - Accessible within the same package or subclasses in different packages.
     * public - Accessible from everywhere in the program. There is no restriction on the scope of public data members.
     */

    //In a class file only 1 class can have public.

    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        //System.out.println(t1.name); //-->Throws error since name in Teacher class is declared as Private
        t1.disp(); //-->Can be accessible since void method is accessible.
    }

}
class Teacher{

    private String name = "Vijay";
    void disp(){
        System.out.println(name);
    }
}
