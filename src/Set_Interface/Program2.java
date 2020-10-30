package Set_Interface;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Program2
{
    public static void main(String[] args)
    {
//        input and seperated the website
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter websites by seperating them using ',' ");
        String[] links=scan.next().split(",");
//        remove the dupliccates
        TreeSet<String> websites=new TreeSet<String>();
        for(int i=0; i<links.length;i++)
        {
            websites.add(links[i]);
        }

//        for (String temp:links)
//        {
//            websites.add(temp);
//        }

//        display(iterator, sopln, foreach)
        Iterator<String> itr=websites.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
//www.facebook.com,www.facebook.com,www.nykaa.com,www.zoom.com,www.skype.com

//output
//www.facebook.com
//www.nykaa.com
//www.skype.com
//www.zoom.com

