package Collections;

import java.util.LinkedList;

public class LinkedList_class {
    public static void main(String[] args) {
// LinkedList is a class, which will allow us to store and manipulate groups of data
// it allows us to store duplicate objects
//        it will grow dynamically on run time
//        it maintains insertion order
//        it not thread safe
//        it usages node to store the data
//        data retrieval is slow in linked list
//        manipulation is fast, due to shifting operation

        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(10.9887);
        ll.add(true);
        ll.add("6");
        ll.add("Test");
        System.out.println(ll);//[1, 10.9887, true, 6, Test]
    }
}
