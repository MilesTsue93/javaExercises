package chapter_5;

public class Vowel {
    public static void main (String[] args) {
        
        boolean vowel1 = isVowel('k');
        boolean vowel2 = isVowel('t');
        boolean vowel3 = isVowel('e');

        System.out.println(vowel1);
        System.out.println(vowel2);
        System.out.println(vowel3);
    }

    public static boolean isVowel (char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
}
