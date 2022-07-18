package chapter_7.projects;
import java.util.Arrays;
public class three {
    public static void main(String[] args) {
        int[] arr1 = {2,1,4,3,6,5};
        int[] arr2 = copyAll(arr1);

        System.out.println(Arrays.toString(arr2));
    }

    public static int[] copyAll(int[] arr1) {
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        return arr2;
    }
}
