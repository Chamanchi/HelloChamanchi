package Collections;

import java.util.LinkedList;
import java.util.Scanner;

// Generic means particular data type or specific data
public class Generic
{
    //        <E> primitive datatype
//        <Integer> Wrapper class
//        <Integer> ...........it can store only Integer data

//        generic colletion--> specific data type
//        wrapper class is just a class

    public static void main(String[] args)
    {
        LinkedList<Integer>  ll=new LinkedList<Integer>();
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the integer data and when done enter exit");
        while (scan.hasNextInt())
        {
            ll.addFirst(scan.nextInt());
        }
        System.out.println(ll);
    }
//    for-each loop
// foreach(Integer chamanchi:ll)
//    {
//        System.out.println(ll);
//    }
}
