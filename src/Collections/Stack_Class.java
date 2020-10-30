package Collections;

import java.util.Stack;

public class Stack_Class {

//    Iterable(interface)<--extends--> Collection(interface)
//    Collection(interface)<--extends--> List(interface)
//    Collection(interface)<--extends--> Set(interface)
//    Collection(interface)<--extends--> Queue(interface)

//    List(interface)<---implements-->ArrayList,LinkedList,vector classes
//    vector(class)<--extends--> stack class

//    stack extends vector this data structure follows last in first out (LIFO) mechanistam
public static void main(String[] args)
{
    Stack s = new Stack();
    s.add(10);
    s.add(20);
    s.add(30);
    s.add(40);
    s.add(50);
    System.out.println(s);//[10, 20, 30, 40, 50]
    s.push(80);
    System.out.println(s);//[10, 20, 30, 40, 50, 80]
    s.pop();
    System.out.println(s);//[10, 20, 30, 40, 50]
    s.pop();
    System.out.println(s);//[10, 20, 30, 40]
    System.out.println(s.peek());//40
    System.out.println(s.empty());//false
    System.out.println(s.search(40));//1
    s.add(90);
    System.out.println(s);//[10, 20, 30, 40, 90]

    System.out.println(s.search(10));//5
    System.out.println(s.search(20));//4
    System.out.println(s.search(30));//3
    System.out.println(s.search(40));//2
    System.out.println(s.search(90));//1

}
}
