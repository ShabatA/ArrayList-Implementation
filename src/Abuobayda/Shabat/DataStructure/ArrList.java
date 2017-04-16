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
        //we start from -1 because java array start from position 0 not 1
        numOfItems=-1;
    }

    @Override
    public void add(T item) {
     if (!isFull()){
        numOfItems++;
        array[numOfItems] = item;
     }
     else
     {
         //if the array is full we resize the array
         T[] array2 = (T[])new Object[array.length*2];
         for(int i=0;i<=numOfItems;i++)
         {
             array2[i]=array[i];
         }
         array = array2;
         add(item);
     }
    }

    @Override
    public void add(T item, int position) {
        if (!isFull()){
            for (int i = numOfItems; i>=position; i--)
            {
                array[i+1] = array[i];
            }
            array[position] = item;
            numOfItems++;
        }
        else
        {
            //if the array is full we resize the array
            T[] array2 = (T[])new Object[array.length*2];
            for(int j=0;j<=numOfItems;j++)
            {
                array2[j]=array[j];
            }
            array = array2;
            add(item, position);
     }
        

    }

    @Override
    public T remove(int position) {
        T result = null;
        if ((position >= 0) && (position <= numOfItems)) {
            assert !isEmpty();
            result = array[position];
            if (position < numOfItems){ 
                removeGap(position);
            }
            numOfItems--;
        }
        return result;
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
        numOfItems =-1;
    }

    @Override
    public int numOfItem() {
        return numOfItems+1;
    }

    @Override
    public void display() {
        for (int i=0; i<=numOfItems;i++){
            System.out.println(array[i]);
        }
    }

    @Override
    public T getEntry(int position) {
        if (position <=numOfItems){
            return array[position];
        }
        else 
        {
            return null;
        }
    }

    @Override
    public boolean contains(T target) {
        boolean found = false;
        for(int i=0; i<=numOfItems;i++)
        {
            if (array[i].equals(target))
            {
                found = true;
            }
        }
        return found;
    }

    private void removeGap(int position) {
        assert(position >= 0) && (position < numOfItems);
        int removedIndex = position;
        int lastIndex = numOfItems;
        for (int index = removedIndex; index < lastIndex; index++)
        { 
            array[index] = array[index + 1]; 
        }
    }
    
}
