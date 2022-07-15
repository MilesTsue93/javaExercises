package chapter_7;
import java.util.Arrays;

public class array_basics {
    public static void main(String[] args) {
        // constructing a new array with elements inside
        //int[] data = {27, 51, 33, -1, 101};
        
        //int[] nums = odd(-14, 52);
        //System.out.println(Arrays.toString(nums));

        int[] arr = {1,2,3,4,500,6,6,88};
        //int max = arrMax(arr);
        //System.out.println("max element of array is: " + max);

        //mean of array
        double avg = mean(arr);
        System.out.println(avg);

        System.out.println();
        //reversed array displayed
        printBackwards(arr);

    }
    // arithmetic mean
    public static double mean(int[] arr) {
        double avg = 0.0;
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        avg /= arr.length;  
        return avg;
    }

    // computes maximum of an array's elements
    public static int arrMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
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

    public static void printBackwards(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - i - 1);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
