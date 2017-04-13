/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Abuobayda.Shabat.DataStructure;

/**
 *
 * @author Abuobayda Shabat
 */
public interface ArrListInterface <T>{
    //add a new value to the list (in the back of the list)
    public void add(T item);
    //add a new value in a particular position
    public void add(T item, int position);
    //remove an item from a particular position on the list
    public T remove(int position);
    
    //check if the list is empty
    public boolean isEmpty();
    //check if the list is full
    public boolean isFull();
    //remove all the items from the list
    public void clear();
    //return number of item in the lsit
    public int numOfItem();
    //Display the items
    public void display();
    
    //return the item in a particular position
    public T getEntry(int position);
    //return true if the value exist in the list
    public boolean contains(int newEntry);

    
}
