package Collections;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class IterableDemo {
    public static void main(String[] args)
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        Scanner scan =new Scanner(System.in);
//        input from user
        System.out.println("enter the integer data when done enter exit");
        while (scan.hasNext())
        {
            al.add(scan.nextInt());
        }
        System.out.println(al);
// forward and then backwad

        System.out.println("forwad");
        ListIterator<Integer> lt1=al.listIterator();
        while (lt1.hasNext()){
            System.out.println(lt1.next());
        }

        System.out.println("backward");
        while (lt1.hasPrevious()){
            System.out.println(lt1.hasPrevious());
        }

//        backward only
        System.out.println("Backward only");
        ListIterator<Integer> lt2=al.listIterator(al.size());
        while (lt2.hasPrevious()){
            System.out.println(lt2.previous());
        }

    }
}
