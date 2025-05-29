public class classAndObjects {

    public static void main(String[] agrs){

        Hotel hotel = new Hotel();
        int teaCost = hotel.getTeaCost();
        int coffeeCost = hotel.getCoffeeCost();
        System.out.println("Tea: " + teaCost);
        System.out.println("Coffee: " + coffeeCost);
    }
}

public class Hotel{
    int tea = 10;
    int coffee = 10;

    public int getTeaCost(){
        return this.tea;
    }
    public int getCoffeeCost(){
        return this.coffee;
    }
}
