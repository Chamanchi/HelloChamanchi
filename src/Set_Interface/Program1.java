package Set_Interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
//        input
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=scan.next();

//        storing string inside HashSet char by char
        HashSet<Character> hs= new HashSet<Character>();
        for (int i=0;i<s.length(); i++)
        {
            hs.add(s.charAt(i));
        }
        //            display
        Iterator<Character> itr= hs.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next());
        }
    }

}
