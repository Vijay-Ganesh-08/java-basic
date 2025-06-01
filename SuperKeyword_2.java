public class SuperKeyword_2 {

    public static void main(String[] args){
        Employee obj = new Employee("Vijay");
        System.out.println(obj.name);
    }
}

class Person {
    String name;
    Person (String name){
        this.name = name;
    }
}
class Employee extends Person {
    Employee (String name){
        super(name);
    }
}
