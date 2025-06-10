package Challenge6;

class Person{
    public String name;
    protected int age;
    private String ssn;
    String address;

    Person(String name, int age, String ssn, String address){
        this.name = name;
        this.age = age;
        this.ssn = ssn;
        this.address = address;
    }
}

class Employee extends Person {
    Employee(String name, int age, String ssn, String address)
    {
        super(name,age,ssn,address);
    }
}
public class MainClass {

    public static void main(String[] args){
        Employee e1 = new Employee("Vijay",30,"123456789","Chennai");
        System.out.println(e1.name);
        System.out.println(e1.age);
        System.out.println(e1.address);
        //System.out.println(e1.ssn);
        //SSN is marked as private and can be accessed only within the class
    }
}
