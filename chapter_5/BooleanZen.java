package chapter_5;

public class BooleanZen {
    public static void main (String args[]) {
        boolean result1 = startEndSame("Siamese");
        System.out.println(result1);
        boolean result2 = startEndSame("racer");
        System.out.println(result2);

        boolean result3 = hasPennies(26);
        System.out.println(result3);
    }

    public static boolean startEndSame(String str) {
        return str.charAt(0) == str.charAt(str.length() - 1);
    }

    public static boolean hasPennies(int cents) {
        return !(cents % 5 == 0);
    }
}
