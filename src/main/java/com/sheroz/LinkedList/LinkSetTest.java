package com.sheroz.LinkedList;

public class LinkSetTest {

  public static void main(String[] args) {
    LinkedList ls = new LinkedList();
    System.out.println( "size(0) : " +  ls.size()  );
    ls.add(2);
    System.out.println( "size(0) : " +  ls.size()  );
    ls.printMe();
    ls.add(4);
    System.out.println( "size(0) : " +  ls.size()  );
    ls.printMe();
    ls.add(7);
    System.out.println( "size(0) : " +  ls.size()  );
    ls.printMe();
    for (int i=10; i<=20; i+=2 ) {
      ls.add(i);
    }
    ls.printMe();
    System.out.println(ls.get(20));
    System.out.println(ls.indexOf(-20));

    System.out.println("----------------");
    // ===
    ls.lastIndexOf(2);
    System.out.println(ls.get(2)==0);

    ls.replaceIndex(2, 5);
    System.out.println(ls.get(5) == 2);

    ls.replace(12, 22 );
    System.out.println(ls.get(22) == 4);


    ls.clear();
    System.out.println(ls.size() ==0);
    System.out.println(ls.get(2) == -1);
  }

}
