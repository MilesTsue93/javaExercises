package chapter_5;
import java.util.Random;

public class randomNum {
    public static void main (String args[]) {
        Random rand = new Random();
        int a = rand.nextInt(11);
        while (a != 10) {
            a = rand.nextInt(11);
            System.out.println(rand.nextInt(11));
        }
        System.out.println(a);

        oddRandomNum();
    }


    public static void oddRandomNum() {
        Random rand = new Random();
        int num = rand.nextInt(49) + 51;

        while (num != 99) {
            num = rand.nextInt(49) + 51;
        }

        System.out.println(num);
    }
}