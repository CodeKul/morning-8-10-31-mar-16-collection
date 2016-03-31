/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author aniruddha
 */
public class CollectionDemos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //System.out.println(" "+(10+10));
        
        linkedList();
        
        //simpleCollection();
    }

    public static void simpleCollection() {
        Collection<String> collectionStr = new ArrayList<>();
        collectionStr.add("hello");
        collectionStr.add("hi");
        collectionStr.add("how");
        collectionStr.add("fine");
        collectionStr.add("lunch");

        Iterator<String> iteratorEnglishCollection = collectionStr.iterator();

        while (iteratorEnglishCollection.hasNext()) {
            String element = iteratorEnglishCollection.next();
            System.out.println("Element -> " + element);
        }
    }
    
    public static void linkedList(){
        
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        for(int i = 1; i <=10 ; i = i +1){
            linkedList.add(2 * i);
        }
        
        linkedList.remove(0);
        linkedList.set(0,100);
        
        for(Integer data : linkedList){
            
            System.out.println(" data " + data);
        }
        
        System.out.println(" "+10+10);
    }
}
