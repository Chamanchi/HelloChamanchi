package Collections;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ModifyDemo {
    public static void main(String[] args)
    {
        ArrayList<String> a=new ArrayList<String>();
        Scanner scan =new Scanner(System.in);
//        input from user
        System.out.println("enter names, when done enter exit");
        while (true)
        {
            String data=scan.next();
            if(data.equalsIgnoreCase("exit"))
                break;
            else
                a.add(data);
        }
//        modify the data
        System.out.println(a);
        ListIterator<String> l=a.listIterator();
        while (l.hasNext()){
            String name=l.next();
            l.set(name.toUpperCase());
        }
//        displaying the data
        System.out.println(a);
    }
}
