package Set_Interface;

import java.util.TreeSet;

public class Student {
    public static void main(String[] args) {
        TreeSet<Student> ts=new TreeSet<Student>();
     ts.add(new Student());
     ts.add(new Student());
        System.out.println(ts);
    }
}
