package Set_Interface;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(new Integer(10));
        System.out.println(al);//[10, 10]

        Integer a =new Integer(20);
        System.out.println(a);
        int b=a;
        int c=a.intValue();
        System.out.println(b);
        System.out.println(c);
    }
}
