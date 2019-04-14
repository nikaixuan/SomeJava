package Deque;


import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by nikaixuan on 13/4/19.
 */
public class Deque<Item> implements Iterable<Item> {

    private class Node{
        Item value;
        Node after;
        Node before;
    }

    private Node first, last;


    public Deque(){

    }                           // construct an empty deque
    public boolean isEmpty(){
        return first==null;
    }                 // is the deque empty?
    public int size(){
        int size = 0;
        if (isEmpty()){

        }else {
            while (first.after!=null){
                size+=1;
            }
        }
        return size;
    }                        // return the number of items on the deque

    public void addFirst(Item item){
        if (item==null) throw new IllegalArgumentException();
        if (isEmpty()){
            Node newNode = new Node();
            newNode.value = item;
            newNode.before = null;
            newNode.after = null;
            first = newNode;
            last = newNode;
        }else {
            Node newfirst = new Node();
            Node oldfirst = first;
            newfirst.value = item;
            newfirst.before = null;
            newfirst.after = oldfirst;
            first = newfirst;
        }
    }          // add the item to the front

    public void addLast(Item item){
        if (item==null) throw new IllegalArgumentException();
        if (isEmpty()){
            Node newNode = new Node();
            newNode.value = item;
            newNode.before = null;
            newNode.after = null;
            first = newNode;
            last = newNode;
        }else {
            Node newlast = new Node();
            Node oldlast = last;
            newlast.value = item;
            newlast.after = null;
            newlast.before = oldlast;
            last = newlast;
        }
    }           // add the item to the end

    public Item removeFirst(){
        if (isEmpty()) throw new NoSuchElementException();
        Item removeValue = first.value;
        if (first == last){
//            removeValue = first.value;
            first = last = null;
        }else {
            first.after.before = null;
            Node newfirst = first.after;
            first = newfirst;
//            removeValue = first.value;
        }
        return removeValue;
    }                // remove and return the item from the front

    public Item removeLast(){
        if (isEmpty()) throw new NoSuchElementException();
        Item removeValue = last.value;
        if (first == last){
//            removeValue = first.value;
            first = last = null;
        }else {
            last.before.after = null;
            Node newlast = last.before;
            last = newlast;
//            removeValue = first.value;
        }
        return removeValue;
    }                 // remove and return the item from the end

    public Iterator<Item> iterator(){
        return new Iterator<Item>() {
            private Node current = first;
            public boolean hasNext(){
                return current!=null;
            }

            public Item next(){
                if (current==null) throw new NoSuchElementException();
                Item item = current.value;
                current = current.after;
                return item;
            }

            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }         // return an iterator over items in order from front to end
    public static void main(String[] args){

    }   // unit testing (optional)
}
