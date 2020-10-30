package Map_Interface;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_Class
{
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        HashMap<String,Integer> details = new HashMap<String,Integer>();

//        input
        System.out.println("Enter the details of employee as name=number when done enter exit");

        while (true)
        {
            String data=scan.next();
            if (data.equalsIgnoreCase("exit"))
             break;
           else
           {
            String[] split=data.split("=");
             details.put(split[0],Integer.parseInt(split[1]) );
           }
        }
//input to fetch data
        System.out.println("Enter the names for fetching there details;");
        String[] names=new String[details.size()];
        for (int i=0;i<details.size();i++){
            String data= scan.next();
            if (data.equalsIgnoreCase("exit"))
                break;
            else
                names[i]=data;
        }
//        display
        for (String key:names){
            if (details.containsKey(key))
                System.out.println(details.get(key));
            else
                System.out.println("person missing");
        }

    }
}
