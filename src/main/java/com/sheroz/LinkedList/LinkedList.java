package com.sheroz.LinkedList;

import java.util.List;

public class LinkedList {
  private  Node root = null;
  private int size =0 ;



  /**
   * Returns the number of elements in this list.  If this list contains
   * more than {@code Integer.MAX_VALUE} elements, returns
   * {@code Integer.MAX_VALUE}.
   *
   * @return the number of elements in this list
   */
  public int size() {
    return size;
  }


  /**
   * Returns {@code true} if this list contains no elements.
   *
   * @return {@code true} if this list contains no elements
   */
  public boolean isEmpty(){
    return size==0;
  }


  /**
   * Appends the specified element to the end of this list (optional
   * operation).
   *
   * <p>Lists that support this operation may place limitations on what
   * elements may be added to this list.  In particular, some
   * lists will refuse to add null elements, and others will impose
   * restrictions on the type of elements that may be added.  List
   * classes should clearly specify in their documentation any restrictions
   * on what elements may be added.
   *
   * @param e element to be appended to this list
   * @return {@code true} (as specified by {@link Collection#add})
   * @throws UnsupportedOperationException if the {@code add} operation
   *         is not supported by this list
   * @throws ClassCastException if the class of the specified element
   *         prevents it from being added to this list
   * @throws NullPointerException if the specified element is null and this
   *         list does not permit null elements
   * @throws IllegalArgumentException if some property of this element
   *         prevents it from being added to this list
   */
  public  boolean add( int e) {
    if (root==null) {
      root= new Node(e);

    }
    else {
      Node lastOne= lastElement();
      lastOne.setNext(new Node(e));
    }

    size++;
    return true;
  }

  public Node lastElement(){
    if (root == null) return  null;
    Node current  =  root ;
    while (current.getNext() != null) {
      current = current.getNext();
    }
    return current;
  }

  public void printMe(){
    Node current  =  root ;
    while (current != null) {
      System.out.print( current.getData() + "  -> " );
      current = current.getNext();
    }
    System.out.print(  " \n" );

  }

  // Positional Access Operations

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index index of the element to return
   * @return the element at the specified position in this list
   * @throws IndexOutOfBoundsException if the index is out of range
   *         ({@code index < 0 || index >= size()})
   */
  public int get(int index){
    int cur =0 ;
    if (root == null) return -1;
    Node current  =  root ;
    while ( cur != index ) {
      current = current.getNext();
      if (current== null) return -1 ;
      cur++;
    }
    return current.getData();
  }


  // Search Operations

  /**
   * Returns the index of the first occurrence of the specified element
   * in this list, or -1 if this list does not contain the element.
   * More formally, returns the lowest index {@code i} such that
   * {@code Objects.equals(o, get(i))},
   * or -1 if there is no such index.
   *
   * @param o element to search for
   * @return the index of the first occurrence of the specified element in
   *         this list, or -1 if this list does not contain the element
   * @throws ClassCastException if the type of the specified element
   *         is incompatible with this list
   *         (<a href="Collection.html#optional-restrictions">optional</a>)
   * @throws NullPointerException if the specified element is null and this
   *         list does not permit null elements
   *         (<a href="Collection.html#optional-restrictions">optional</a>)
   */
  public int indexOf(int  o){
    int cur =0 ;
    if (root == null) return -1;
    Node current  =  root ;
    while (current.getData()!=o ) {
      current = current.getNext();
      if (current== null) return -1 ;
      cur++;
    }
    return current.getData()==o? cur: -1 ;
  }



  /**
   * Returns the index of the last occurrence of the specified element
   * in this list, or -1 if this list does not contain the element.
   * More formally, returns the highest index {@code i} such that
   * {@code Objects.equals(o, get(i))},
   * or -1 if there is no such index.
   *
   * @param o element to search for
   * @return the index of the last occurrence of the specified element in
   *         this list, or -1 if this list does not contain the element
   * @throws ClassCastException if the type of the specified element
   *         is incompatible with this list
   *         (<a href="Collection.html#optional-restrictions">optional</a>)
   * @throws NullPointerException if the specified element is null and this
   *         list does not permit null elements
   *         (<a href="Collection.html#optional-restrictions">optional</a>)
   */
  int lastIndexOf(int  v ) {
    return -1 ;
  }



  /**
   * Removes all of the elements from this list (optional operation).
   * The list will be empty after this call returns.
   *
   * @throws UnsupportedOperationException if the {@code clear} operation
   *         is not supported by this list
   */
  void clear(){

  }



  int replaceIndex (int index ,  int replace  ){
    
    return -1 ;
  }

  int replace (int find ,  int replace  ){
    return -1 ;
  }
}
