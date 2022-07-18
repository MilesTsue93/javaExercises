package chapter_7.projects;
import java.util.Arrays;
public class four {
    public static void main(String[] args) {
        int[] a1 = {3,4,5,6,7,8,9,8,12,33};
        int[] a2 = new int[a1.length];

        copyRange(a1, a2, 1, 4, 5);
        System.out.println(Arrays.toString(a2));
    }

    public static void copyRange(int[] a1, int[] a2, int i1, int i2, int l) {
        for (int i = 0; i < l; i++) {
            a2[i + i2] = a1[i + i1];
        }
    }
}
