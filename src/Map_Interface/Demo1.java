package Map_Interface;

import java.util.HashMap;

public class Demo1 {
    public static void main(String[] args) {
        String s1=new String("RAMA");
        String s2 =new String("RAMA");
        HashMap<String,Integer> map=new HashMap<String, Integer>();
        map.put(s1,10);
        map.put(s2,20);
        System.out.println(map);
    }
}
