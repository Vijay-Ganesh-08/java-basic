public class SuperKeyword {

    //Super Keyword is used to call the constructors of a Parent class from Child Class

    public static void main(String[] args){
        Dogs d1 = new Dogs();
    }
}

class Animals{
    int age = 5;
    Animals(){
        System.out.println("Animal Default Constructor");
    }
    Animals(String name){
        System.out.println("Animal Name: "+ name);
    }
    void MakesSound(){
        System.out.println("Animal Makes Sound");
    }
}

class Dogs extends Animals{
    Dogs() {
        //super(); //Calls by default
        super("Timmy"); //Calling Parameterized Constructor
        System.out.println("Dog Default Constructor");
        super.MakesSound();
        System.out.println("Age:" + super.age);

    }
}