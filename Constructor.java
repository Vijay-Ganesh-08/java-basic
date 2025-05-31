public class Constructor {

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
