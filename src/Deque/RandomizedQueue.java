package Deque;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

/**
 * Created by nikaixuan on 14/4/19.
 */
public class RandomizedQueue<Item> implements Iterable<Item> {

    private ArrayList<Item> list;
    private int N;

    public RandomizedQueue(){
        list = new ArrayList<>();
    }                 // construct an empty randomized queue

    public boolean isEmpty(){
        return list.size()==0;
    }                 // is the randomized queue empty?

    public int size(){
        return this.list.size();
    }                        // return the number of items on the randomized queue

    public void enqueue(Item item){
        if (item==null) throw new IllegalArgumentException();
        list.add(item);
    }           // add the item

    public Item dequeue(){
        if (isEmpty()) throw new NoSuchElementException();
        Random rand = new Random();

// Obtain a number between [0 - 49].
        int n = rand.nextInt(list.size());
        Item deItem = list.get(n);
        list.remove(list.get(n));
        return deItem;
    }                    // remove and return a random item

    public Item sample(){
        if (isEmpty()) throw new NoSuchElementException();
        Random rand = new Random();

// Obtain a number between [0 - 49].
        int n = rand.nextInt(list.size());
        Item deItem = list.get(n);
        return deItem;
    }                     // return a random item (but do not remove it)

    public Iterator<Item> iterator(){
        return new Iterator<Item>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return list.get(index)==null;
            }

            @Override
            public Item next() {
                index = index+1;
                if (list.get(index)==null) throw new NoSuchElementException();
                return list.get(index);
            }

            public void remove(){
                throw new UnsupportedOperationException();
            }
        };

    }         // return an independent iterator over items in random order

    public static void main(String[] args){

    }   // unit testing (optional)
}
