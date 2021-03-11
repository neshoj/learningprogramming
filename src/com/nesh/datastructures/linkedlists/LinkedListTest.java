package com.nesh.datastructures.linkedlists;


public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(20);
        list.addFirst(10);
        list.addLast(30);
    System.out.println("list = " + list);
    System.out.println(list.indexOf(10));

    System.out.println("list = " + list.contains(90));
    }
}
