package com.nesh.datastructures.linkedlists;

public class LinkedList {

  private Node first;
  private Node last;

  private class Node {
    private int value;
    private Node node;
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
      node.node = first;
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
      first.node = node;
      last = node;
    } else {
      // Create node
      var node = new Node();
      node.value = item;
      // Get last node to point to new node
      last.node = node;
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

      counterNode = counterNode.node;
      index++;
    }
    return -1;
  }

  public boolean contains(int item){
  return   indexOf(item) != -1;
  }
}
