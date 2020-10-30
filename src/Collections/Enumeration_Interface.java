//Traversing the collections

package Collections;
//Methods---elemeents(), hasMoreElements(), nextElement().
//disadvantages
//Enumerati0n can be used only for vector and stack
//Enumeration gives read-only access to elements

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Enumeration_Interface {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<Integer>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(444);
        System.out.println(v);//[10, 20, 30, 444]
        Enumeration<Integer> e=v.elements();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
//        Iterator<Integer> i=new Iterator<Integer>() {
//            @Override
//            public boolean hasNext() {
//                return false;
//            }
//
//            @Override
//            public Integer next() {
//                return null;
//            }
//        };
    }
}
