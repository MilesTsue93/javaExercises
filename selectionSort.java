

public class selectionSort {

    public static void main(String[] args) {

        //creating list using an array
        int[] list = {5, 77, 88, 4, 22};
     
       // list before sorting
       System.out.print("List before sorting: ");
       for (int i = 0; i <= list.length - 1; i++) {
        System.out.print(list[i] + " "); 
       }

       System.out.println();
       
       // list after implementing selection sort (T(n) = n^2 + n - 2)
       System.out.print("List after sorting: ");
       selection_sort(list);
    }

    public static void swap(int current, int smallest) {
            int tmp = smallest;
            smallest = current;
            current = tmp;
        }

    public static void selection_sort(int[] list) {

        int smallest = 0;
        int current = 0;
        for (int i = 0; i < list.length-1; i++) {
            smallest = current;
            for (int j = list[i + 1]; j < list.length; j++) {
                if (list[j] < smallest) {
                    smallest = list[j];
                }
            }
            swap(current, smallest);     
        }
        for(int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
    
}
