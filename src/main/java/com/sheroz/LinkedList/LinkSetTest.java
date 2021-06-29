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

  }

}
