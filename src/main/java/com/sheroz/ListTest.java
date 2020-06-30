package com.sheroz;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

  public static void main(String[] args) {
    String[]  lsString = new String [5];
    List<Integer> ls = new ArrayList<Integer>();
    ls.add(10);  // [1]
    System.out.println("list size " + ls.size()  );
    System.out.println("String array size " + lsString.length );
    lsString[0] = "test";
    ls.add(20); //  0 = [10], 1= [20]
    System.out.println("list size " + ls.size()  );
    System.out.println("String array size " + lsString.length );
    ls.remove(1); // 0 = [10]
    System.out.println("list size " + ls.size()  );
    ls.add(30); // 0 = [10], 1 = [30]
    System.out.println("list index " + ls.indexOf(30) );
    System.out.println("list index " + ls.get(1) );
    ls.add(1, 40);
    System.out.println("list index " + ls.indexOf(30) );

    for (int tmp : ls) {
      System.out.println( tmp  );
    }
    ls.sort( (item1 , item2) -> item1.compareTo(item2)  );

    System.out.println( " after sort ");

    for (int tmp : ls) {
      System.out.println( tmp  );
    }

    System.out.println("list index " + ls.indexOf(30) );

  }

}
