//  -> collecton is used when we have to store multiple objects under single entity.
// -> Iterable is a root interface.



// collection framework(icf) is a set of classes and interfaces that implent commanly reusable collection data structure
//collection framework allow us to manipulate and store group of object.
//collection interface and classes are present in java.util.package

// Here interface are
//Iterable
//collection
//set
//Map
//List
//Queue

//Remaining all are classes
//Hashmap
//LinkedHashMap
//Tree set map
//ArrayList
//Linked List
//vector
//Priority Queue
package Collections;
import java.util.ArrayList;

public class Introduction_Of_Collection {
    public static void main(String[] args){
        ArrayList al= new ArrayList();
        al.add(2);
        al.add("2");
        al.add("test");
        al.add(true);
        al.add("c");
        al.add(9.80);
        System.out.println(al);//[2, 2, test, true, c, 9.8]

    }
}
