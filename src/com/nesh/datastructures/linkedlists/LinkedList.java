package com.nesh.datastructures.linkedlists;

public class LinkedList {

  private Node first;
  private Node last;

  private class Node {
    private int value;
    private Node next;
  }

  public void addFirst(int item) {
    if (first == null) {
      var node = new Node();
      node.value = item;
      first = node;
      last = node;
    } else {
      var node = new Node();
      node.value = item;
      // Link current first node to new node
      node.next = first;
      // Make current first node as last node
      last = first;
      // set new node as first
      first = node;
    }
  }

  public void addLast(int item) {
    if (last == null) {
      // List has one item init;
      var node = new Node();
      node.value = item;

      first = node;
      first.next = node;
      last = node;
    } else {
      // Create node
      var node = new Node();
      node.value = item;
      // Get last node to point to new node
      last.next = node;
      // Set new node as last node
      last = node;
    }
  }

  public int indexOf(int item) {
    Node counterNode = first;
    int index = 0;

    while (counterNode != null) {
      if (counterNode.value == item) {
        return index;
      }

      counterNode = counterNode.next;
      index++;
    }
    return -1;
  }

  public boolean contains(int item) {
    return indexOf(item) != -1;
  }

  public void removeLast() {
    var secondLast = first;
    // [10 -> 20 ->30 ]
    while (secondLast.next != last) {
      secondLast = secondLast.next;
    }
    secondLast.next = null;
    last = secondLast;
  }

  public void removeFirst() {
    var second = first.next;
    first.next = null;
    first = second;
  }

  public int size() {
    var current = first;
    int counter = 0;
    while (current.next != null) {
      current = current.next;
      counter++;

      if (current.next == null) {
        counter++;
      }
    }
    return counter;
  }
}
