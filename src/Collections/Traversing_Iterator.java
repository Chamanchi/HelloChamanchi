package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Traversing_Iterator {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(11);
        a.add(12);
        System.out.println(a);//[10, 20, 11, 12]

        Iterator<Integer> i= a.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }



    }
}
