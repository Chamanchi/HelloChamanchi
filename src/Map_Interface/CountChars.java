package Map_Interface;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class CountChars
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<Character,Integer> table=new LinkedHashMap<Character, Integer>();

//        input
        System.out.println("Enter the word");
        String word=scan.next();
//        start counting the chars
        for (int i=0;i<word.length();i++)
        {
            char c =word.charAt(i);
            if (table.containsKey(c))
            {
//                increasing the count of the char
                Integer count= table.get(c);
                table.put(c,++count);
            }
            else
            {
//                inserting the char in the table
                table.put(c,1);
            }
//            display
            Set<Character> keys =table.keySet();
            for (Character key:keys)
            {
                System.out.println(key+":"+table.get(key));
            }
        }
    }
}
//mississippi