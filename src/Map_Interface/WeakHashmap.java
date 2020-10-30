package Map_Interface;

import java.util.WeakHashMap;

public class WeakHashmap
{
//    if there is only one reference to the key present in weakHashMap then the entry will be removed and the key will be available for garbage collection
    public static void main(String[] args)
    {
        String s1=new String("RAMA");
        String s2=new String("SITA");
        WeakHashMap<String,Integer> map=new WeakHashMap<String,Integer>();

        map.put(s1,10);
        map.put(s2,20);
        System.out.println(map);//{RAMA=10, SITA=20}
        s1=null;
        System.gc();
        System.out.println(map);//{SITA=20}
        System.out.println(s1);//null
    }
}
