public class functions {

    int add(int a,int b){
        return a+b;
    }
    int sub (int a, int b)
    {
        return a-b;
    }
    int mul (int a, int b)
    {
     return a*b;
    }
    //from static method you cannot call non-static methods, can be called only through objects.
    //from static method you can call other static methods from class without creating objects.
    public static void main(String[] args){
        functions obj = new functions();
        int add = obj.add(10,20);
        int sub = obj.sub(20,10);
        int mul = obj.mul(10,10);

        System.out.println("add:"+add);
        System.out.println("sub:"+sub);
        System.out.println("mul:"+mul);

    }



}
