package Map_Interface;

import java.util.IdentityHashMap;

public class Demo2
{
    public static void main(String[] args) {
        String s1=new String("RAMA");
        String s2=new String("RAMA");
//        String s3="chamanchi";
        IdentityHashMap<String,Integer> map=new IdentityHashMap<String, Integer>();
        map.put(s1,10);
        map.put(s2,20);
//        map.put(s3,18);
        System.out.println(map);
    }
}
