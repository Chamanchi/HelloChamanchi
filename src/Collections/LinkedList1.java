package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
//new LinkedList();
//new LinkedList(collection c);

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(l);//[10, 20, 30, 40]
        l.addFirst(99);
        System.out.println(l);//[99, 10, 20, 30, 40]
        l.addLast(77);
        System.out.println(l);//[99, 10, 20, 30, 40, 77]
        System.out.println(l.getFirst());//99
        System.out.println(l.getLast());//77
        l.offer(100);
        System.out.println(l);//[99, 10, 20, 30, 40, 77, 100]
        System.out.println(l.peek());//99
        System.out.println(l);//[99, 10, 20, 30, 40, 77, 100]
        System.out.println(l.poll());//99
        System.out.println(l);//[10, 20, 30, 40, 77, 100]

        ArrayList al=new ArrayList();
        al.add(70);
        al.add(80);
        al.add(90);
        LinkedList l2= new LinkedList(al);//[70, 80, 90]
        System.out.println(l2);
        LinkedList l3=new LinkedList(l);
        System.out.println(l);//[10, 20, 30, 40, 77, 100
// add()-> is used to add an element into collection irrespective of whether the memory is available or not
// offer()-> it will to add an element into collection only if sufficient memory is available, otherwise may get rejected

//peek()-> wiil display the first element of the collection without deleting it. where as
//poll()->will display the first element of the collection, but it would also delete the element from the collection
    }
}
