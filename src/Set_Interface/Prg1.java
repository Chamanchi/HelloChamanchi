package Set_Interface;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Prg1
{
    public static void main(String[] args)
    {
//        input and insert in TreeSet
        Scanner scan =new Scanner(System.in);

        TreeSet<Integer> ts = new TreeSet<Integer>(new MyComparator());

        System.out.println("Enter the numbers, when done enter exit");

        while (scan.hasNext())
        {
            ts.add(scan.nextInt());
        }
//        display
        Iterator<Integer> itr= ts.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next()+"");
        }
    }
}
