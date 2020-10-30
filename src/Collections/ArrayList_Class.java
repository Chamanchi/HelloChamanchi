package Collections;

import java.util.ArrayList;

public class ArrayList_Class {
//    ways to create Arraylist
//    new ArrayList();//initial capacity would be 10
//    new ArrayList(int capacity);//initial capacity would be the value user has passed
//    new Arraylist(collection c);// any coolection can be passed as parameter for this constructor, the major purpose is to convert any other collection to Arraylist

//points to note
//Arraylist is dynamic array, which means it will grow and shrink automatically
//ArrayList allow us to store duplicate elements
//    ArrayList store data based on index
//    ArrayList internally usages array
//    ArrayList maintains insertion order
//    ArrayList are not thred safe(not synchronized)


    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);//[10, 20, 30, 40, 50]
        al.add(1,500);
        System.out.println(al);//[10, 500, 20, 30, 40, 50]
        ArrayList al2 =new ArrayList();
        al2.add(50);
        al2.add(60);
        al2.add(70);
        System.out.println(al2);//[50, 60, 70]
        al.addAll(al2);
        System.out.println(al);//[10, 500, 20, 30, 40, 50, 50, 60, 70]
        al.addAll(1,al2);
        System.out.println(al);//[10, 50, 60, 70, 500, 20, 30, 40, 50, 50, 60, 70]
        System.out.println(al.contains(500));//True
        System.out.println(al.contains(700));//false
        System.out.println(al.get(2));//60
        System.out.println(al.getClass());//class java.util.ArrayList
        System.out.println(al.indexOf(50));//1
        System.out.println(al.lastIndexOf(50));//9
        System.out.println(al.remove(2));//60
        System.out.println(al);//[10, 50, 70, 500, 20, 30, 40, 50, 50, 60, 70]
        al.set(1,99);
        System.out.println(al);//[10, 99, 70, 500, 20, 30, 40, 50, 50, 60, 70]
        System.out.println(al.size());//11
        System.out.println(al.subList(1,5));//[99, 70, 500, 20]
        System.out.println(al);//[10, 99, 70, 500, 20, 30, 40, 50, 50, 60, 70]
        al.retainAll(al2);
        System.out.println(al);//[70, 50, 50, 60, 70]
        System.out.println(al2);//[50, 60, 70]
        System.out.println(al2.set(1,144));//60
        System.out.println(al2);//[50, 144, 70]
        System.out.println(al.clone());//[70, 50, 50, 60, 70]//return shallow copy of ArrayList
        System.out.println(al2.clone());//[50, 144, 70]

        System.out.println(al.toArray());//[Ljava.lang.Object;@5f184fc6
        //System.out.println(al.toArray( []al));

    }
}
