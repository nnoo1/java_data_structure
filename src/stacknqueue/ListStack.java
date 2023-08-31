package stacknqueue;

import list.Node;

import java.util.EmptyStackException;

public class ListStack<E> {
  private Node<E> top;

  private int size;

  public ListStack() {
    top = null;
    size = 0;
  }

  public int size() {return size;}
  public boolean isEmpty() {return size==0;}

  //push(), peek(), pop()
  public <E> E peek() {
    if (isEmpty()) throw new EmptyStackException();
    return top.getItem();
  }

  public E push(E item) {
    Node<E> newNode = new Node<>(item);
    newNode.setNext(top);
    top = newNode;
    size++;
    return newNode.getItem();
  }

  public E pop() {
    if (isEmpty()) throw new EmptyStackException();
    E topItem = top.getItem();
    top = top.getNext();
    size--;
    return topItem;
  }

}
