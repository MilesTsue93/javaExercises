package chapter_7;

import java.util.Arrays;

public class array_basics {
    public static void main(String[] args) {
        // constructing a new array with elements inside
        //int[] data = {27, 51, 33, -1, 101};
        
        int[] nums = odd(-14, 52);
        System.out.println(Arrays.toString(nums));

    }

    public static int[] odd(int initial, int end) {
        int size = (end - initial) / 2;
        int[] oddNums = new int[size];
        for (int i = 0; i < oddNums.length; i++) {
            if (initial % 2 != 0) {
                oddNums[i] = 2*i - (Math.abs(initial));
            }
            oddNums[i] = 2*i - (Math.abs(initial)-1);
        }
    return oddNums;

    }
}
