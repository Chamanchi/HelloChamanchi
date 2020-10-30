package Set_Interface;

import java.util.Iterator;
import java.util.LinkedHashSet;

import java.util.Scanner;

public class Chamanchi
{
    public static void main(String[] args)
    {
//        input from the user and insert the data in treeset
        Scanner scan=new Scanner(System.in);
        LinkedHashSet<String> names =new LinkedHashSet<String>();
        System.out.println("Enter the names,when done enter stop");
        while (true)
        {
            String data=scan.next();
            if(data.length()>4 && data.length()<10)
                break;
            else if (data.length()>4 && data.length()<10)
                names.add(data);
        }

//        display
        Iterator<String> itr=names.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
