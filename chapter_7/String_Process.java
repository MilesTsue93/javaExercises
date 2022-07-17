package chapter_7;

public class String_Process {
    public static void main(String[] args) {
        String[] arr = {"belt", "hat", "jelly", "bubble gum"};
        double avg = count(arr);
        System.out.println("average word count in array: " + avg);

    }

    public static double count(String[] arr) {
        int[] counts = new int[arr.length];
        for (int i = 0; i < arr.length; i++ ) {
            for (int j = 0; j < arr[i].length(); j++) {
                counts[i] += 1;
            }
        }
        
        double avg = 0;
        for (int i = 0; i < counts.length; i++) {
            avg += counts[i];
        }

        avg = avg / counts.length;
        return avg;
    }
    
}
