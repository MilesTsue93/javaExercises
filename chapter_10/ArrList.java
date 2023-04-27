package chapter_10;

import java.util.ArrayList;
import java.util.List;

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
    System.out.println("After changing list: \n" + list);
  }
}