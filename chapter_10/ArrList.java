package chapter_10;

import java.util.*;

public class ArrList {

  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();

    // array list size 5, type <String>
    list.add("It");
    list.add("was");
    list.add("a");
    list.add("stormy");
    list.add("night");

    System.out.println("original list: " + list);
    System.out.println();

    // inserting two elements into Arraylist
    // into specfic indices
    list.add(3,"dark");
    list.add(4, "and");

    System.out.println();
    System.out.println("After adding to list: " + list);
    
    // changing "is" to "IS"
    list.set(1, "IS");

    // after changing list slightly...
    System.out.println();
    System.out.println("After changing list: " + list + "\n");

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).contains("a")) {
        list.remove(i);
        i--;  //this line is very important because the list is a dynamic one!
      }
    }
    System.out.println("After removing words which contain letter 'a': " + list + "\n");

    // declaring a list which holds first 10 mulitples of 2
    List<Integer> listNums = new ArrayList<Integer>();

    for (int i = 0; i < 10; i++) {
      listNums.add(i * 2);
    }
    System.out.println("listNums: " + listNums + "\n");

    // calling maxLength method
    int max = maxLength(list);

    System.out.println("max length of list is: " + max + "\n");

    if (list.contains("IS")) {
      System.out.println("contains 'IS'");
    } else {
      System.out.println("does not contain IS");
    }
  }


  // algorithm to find maximum length value of list
  public static int maxLength(List<String> list) {
    int counts[] = new int[list.size()];
    int max = 0;
    for (int i = 0; i < list.size(); i++) {
      for (int j = 0; j < list.get(i).length(); j++) {
        counts[i]++;
        if (counts[i] > max) {
          max = counts[i];
        }
      }
    }
    return max;
  }
}