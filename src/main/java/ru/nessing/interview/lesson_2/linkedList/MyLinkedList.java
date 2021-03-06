package ru.nessing.interview.lesson_2.linkedList;


public class MyLinkedList<T> {
    private Link<T> first;

    public MyLinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(T link) {
        Link<T> l = new Link<>(link);
        l.setNext(first);
        this.first = l;
    }

    public Link<T> delete() {
        Link<T> temp = first;
        first = first.getNext();
        return temp;
    }

    public void display() {
        Link<T> current = first;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public T find(T searchNode) {
        Link<T> findNode = new Link<>(searchNode);
        Link<T> current = first;
        while (current != null) {
            if (current.getValue().equals(findNode.getValue())) {
                return findNode.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public Link delete(T name){
        Link current = first;
        Link previous = first;
        while(current.getValue() != name){
            if(current.getNext() == null)
                return null;
            else{
                previous = current;
                current = current.getNext();
            }
        }
        if(current == first)
            first = first.getNext();
        else
            previous.setNext(current.getNext());
        return current;
    }


}
