/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Abuobayda.Shabat.DataStructure;

/**
 *
 * @author Abuobayda Shabat
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrListInterface<Integer> myList = new ArrList<Integer>(3);
        myList.add(10);
        myList.add(20);
        myList.add(50);
        myList.add(70);
        myList.display();
        System.out.println("==========Adding in a particular postion===");
        myList.add(55, 0);
        myList.display();
        
        System.out.println("=======Removing an item========");
        myList.remove(1);
        myList.display();
        
        System.out.println("=========getEntry===========");
        int value = myList.getEntry(3);
        System.out.println("The value is: "+ value);
    }
}
