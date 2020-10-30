package Collections;

//new Vector();
//new Vector(int capacity);
//new Vector(collection c);

import java.util.List;
import java.util.Vector;
// vector is class, which allow us to store and manipulate groups of data
//it allows us to store duplicate objects
//it will grow dynamically on runtime
//it maintain insertion order
//it is thread safe
//in this example we can store all objects type

public class Vector01 {
    public static void main(String[] args) {
        List list=new Vector();
        list.add(1);
        list.add(10.990);
        list.add(true);
        list.add("6");
        list.add("Test");
        System.out.println(list);//[1, 10.99, true, 6, Test]
    }
}
