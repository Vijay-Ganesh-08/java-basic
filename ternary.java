public class ternary {
    /**
     * Java ternary operator is the only conditional operator that takes three operands.
     * It’s a one-liner replacement for the if-then-else statement and is used a lot in Java programming.
     * We can use the ternary operator in place of if-else conditions or even switch conditions using nested ternary operators.
     */
    public static void main(String[] args) {
        
        int a = 10 ;
        int b = 10 ;
        System.out.println(a==b ? "True":"False");

        //ternary operator gives a value, but if wouldn't
        String result = a==b ? "True":"False";
        System.out.println(result);
    }
    
}
