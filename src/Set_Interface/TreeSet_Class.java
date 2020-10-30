package Set_Interface;

import java.util.TreeSet;

public class TreeSet_Class {
//    insertion order not maintained
//    duplicates are not allowed
//    heterogeneous data not allowed
//    elements are stored in sorted order[numbers:ascending, String:alphabetical
//    null values are not allowed
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<Integer>();
        ts.add(10);
        ts.add(90);
        ts.add(70);
        ts.add(40);
        ts.add(50);
        ts.add(20);
        ts.add(70);
        ts.add(30);
        ts.add(100);
        ts.add(80);
        ts.add(180);
        System.out.println(ts);//[10, 20, 30, 40, 50, 70, 80, 90, 100, 180]
        System.out.println(ts.first());//10
        System.out.println(ts.last());//180
        System.out.println(ts.headSet(50));//[10, 20, 30, 40]
        System.out.println(ts.subSet(30,90));//[30, 40, 50, 70, 80]
        System.out.println(ts.ceiling(30));//30
        System.out.println(ts.ceiling(60));//70---if 60 is not in data it will show next one
        System.out.println(ts.higher(30));//40
        System.out.println(ts.higher(180));//null

        System.out.println(ts.floor(30));//
        System.out.println(ts.lower(30));//20
        System.out.println(ts.lower(10));//null
        System.out.println(ts.floor(180));//180


    }
}
