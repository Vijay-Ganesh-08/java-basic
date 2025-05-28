public class datatypes {

    public static void main(String[] args) {
        
        //byte -128 to 127
        byte b = 124;

        //short -32768 to 32767
        short s = 32000;

        //int -2147483648 to 2147483647 or -2^31 to 2^31-1
        //4 bytes of memory
        int i = 2147483600;

        //long -2^63 to 2^63-1
        //8 bytes of memory
        Long l = 2147483648l;

        //float 6 decimal 
        float f = 10.123456f;

        //double 15 decimal
        double d = 10.123456;

        //char
        char c = 'a';

        //String
        String name = "Vijay";


        System.out.println("byte : " + b);
        System.out.println("short : " + s);
        System.out.println("Long : " + l);
        System.out.println("Int : " + i);
        System.out.println("float : " + f);
        System.out.println("double : " + d);
        System.out.println("char : " + c);
        System.out.println("String Char : " + name.charAt(1));
        
    }
    
}
