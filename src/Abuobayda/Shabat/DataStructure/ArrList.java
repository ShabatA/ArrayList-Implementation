/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Abuobayda.Shabat.DataStructure;

/**
 *
 * @author Abuobayda Shabat
 */
public class ArrList<T> implements ArrListInterface<T> {
    
    T[] array;
    int numOfItems;
    private static final int MAX_SIZE = 50;
    
    //constructor with a default array size = 50
    ArrList(){
        this(MAX_SIZE);
    }
    
    ArrList(int size){
        array = (T[]) new Object[size];
        numOfItems=-1;
    }

    @Override
    public void add(T item) {
        
    }

    @Override
    public void add(T item, int position) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public T remove(int position) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {
        return numOfItems == -1;
    }

    @Override
    public boolean isFull() {
        return numOfItems == (array.length -1);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int numOfItem() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public T getEntry(int position) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean contains(int newEntry) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
