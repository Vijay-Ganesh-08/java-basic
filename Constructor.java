public class Constructor {

    /**
     * In Java, constructors play an important role in object creation.
     * A constructor is a special block of code that is called when an object is created.
     * Its main job is to initialize the object, to set up its internal state, or to assign default values to its attributes.
     * This process happens automatically when we use the "new" keyword to create an object.
     */
    int marks;
    String name;

    Constructor(){
        System.out.println("Constructor Initialized");
    }

    Constructor(int a){
        marks = a;
    }

    Constructor(String a){
        name = a;
    }

    //This Keyword is used when the Parameter name and Class Attribute name are same and
    //It refers to the current object in a method or constructor
    Constructor(int marks, String name){
        this.marks = marks;
        this.name = name;
    }

    public static void main (String[] args){
        Constructor obj1 = new Constructor();
        System.out.println(obj1.marks);
        Constructor obj2 = new Constructor();
        System.out.println(obj2.name);

        //parameterized Constructors
        Constructor obj3 = new Constructor(50);
        System.out.println("obj3.marks");
        System.out.println(obj3.marks);

        Constructor obj4 = new Constructor("Vijay");
        System.out.println("obj4.name");
        System.out.println(obj4.name);

        Constructor obj5 = new Constructor(70, "Vijay");
        System.out.println("obj5.name && obj5.marks");
        System.out.println(obj5.name);
        System.out.println(obj5.marks);

    }
}
