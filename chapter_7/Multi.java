package chapter_7;
import java.util.*;

public class Multi {
    public static void main (String[] args) {
        int[][] arr = new int[3][7];
        for (int i = 0; i < 7; i++) {
            arr[2][i] = i+1;
        }

        System.out.println("array's third row looks like this: " + Arrays.toString(arr[2]));
        int[][] arr2 = {
            {1,2,3,4,5,6,7,8,9,0},
            {1,2,3,4,5,6,7,8,9,0},
            {1,2,3,4,5,6,7,8,9,0},
            {1,2,3,4,5,6,7,8,9,0},
            {1,2,3,4,5,6,7,8,9,0}
        };
        
        multTable(arr2);
    }
    
    public static void multTable(int[][] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = i*j;
            }

            System.out.println(Arrays.deepToString(arr2));

        }
    }
}
