public class staticKeyWord {
    /**
     * The static keyword in Java is mainly used for memory management.
     * The static keyword in Java is used to share the same variable or method of a given class.
     * The users can apply static keywords with variables, methods, blocks, and nested classes.
     * The static keyword belongs to the class rather than an instance of the class.
     * The static keyword is used for a constant variable or a method that is the same for every instance of a class.
     */
    public static void main(String[] args) {


        mechanic.greeting();

        mechanic m1 = new mechanic();
        m1.sal = 12000;
        mechanic m2 = new mechanic();
        m2.sal = 15000;

        System.out.println(m1.sal + " - " + mechanic.role);
        System.out.println(m2.sal + " - " + mechanic.role);

        mechanic m3 = new mechanic();
        m3.sal = 17500;
        mechanic m4 = new mechanic();
        m4.sal = 20000;

        mechanic.role = "Senior Engineer";
        System.out.println(m3.sal + " - " + mechanic.role);
        System.out.println(m4.sal + " - " + mechanic.role);


    }
}

class mechanic {
    int sal = 10000;
    static String role = "Engineer";
    static{
        System.out.println("Static Block gets executed as the first step");
    }
    static void greeting(){
        System.out.println("Welcome to Static Method");
    }
}