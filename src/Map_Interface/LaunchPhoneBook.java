package Map_Interface;

import java.util.*;

public class LaunchPhoneBook
//    write a progrm to take names and phone numbers and store it in a Hash map. then print the names, print the phone numbers and finally print the names and the phone numbers
{
//    set<Integer>keySet()
//    collection <String>values()
//    set<Entry<Integer, String>>entrySet()

    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        HashMap<String,String> phonebook=new HashMap<String, String>();
//        input format is name=phone number
        System.out.println("Enter the name=phone number, when done enter exit");
        while (true){
            String data=scan.next();
            if (data.equalsIgnoreCase("exit"))
                break;
            else
            {
                String[] split=data.split("=");
                phonebook.put(split[0],split[1]);
            }
        }

//        print the names(key)
        Set<String> names=phonebook.keySet();
        for (String name:names)
        {
            System.out.println(name);
        }

//        print the phone numbers(values)
        Collection<String> phone_nos=phonebook.values();
        for (String phoneno:phone_nos)
        {
            System.out.println(phoneno);
        }

//        print the name and phone number(entry)
        Set<Map.Entry<String,String>> entries=phonebook.entrySet();
        for (Map.Entry<String,String> entry : entries)
        {
            System.out.println(entry);
        }
    }

}
//Alex=9876543210
//Allen=8976543210
//Bob=9786543210
//exit