package Interface;

interface playable{
    void play();
}

class Guitar implements playable{

    @Override
    public void play() {
        System.out.println("Play Guitar");
    }
}

class Piano implements playable{

    @Override
    public void play() {
        System.out.println("Play Piano");
    }
}
public class MainClass1 {

    public static void main(String[] args){
        Guitar g1 = new Guitar();
        g1.play();
        Piano p1 = new Piano();
        p1.play();
    }
}
