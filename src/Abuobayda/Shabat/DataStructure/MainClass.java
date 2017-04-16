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
        ArrListInterface<Integer> myList = new ArrList<>(3);
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
        
        System.out.println("=========contain/search========");
        boolean result;
        result = myList.contains(30);
        System.out.println("Does 30 exist in the list? " + result);
        System.out.println("Does 50 exist in the list? "+ myList.contains(50));
        
    }
}
