package chapter_7;
import java.util.Arrays;

public class Multi {
    public static void main (String[] args) {
        int[][] arr = new int[3][7];
        for (int i = 1; i < arr[2].length; i++) {
            arr[2][i] = i;
        }

        System.out.println("array's third row looks like this: " + Arrays.toString(arr[2]));
    }
}
