public class Shopping {

    int quantity = 10;
    void purchase(int a){
        System.out.println("Purchased Quantity:"+a);
        quantity=quantity-a;
        System.out.println("Balance Quantity:"+this.quantity);
    }
    public static void main(String[] args){
        Shopping obj = new Shopping();
        obj.purchase(2);
    }
}
