class dad{
    int money = 1000;
}

class son extends dad{

}

public class Inheritance {

    public static void main(String[] args){
        son obj = new son();
        System.out.println(obj.money);
    }
}
