package package_one;
import package_two.teacher;

public class student extends teacher {

    public static void main(String[] args) {
       student s1 = new student();
       System.out.println(s1.salary);
    }
}
