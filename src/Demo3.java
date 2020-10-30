 public class Demo3 extends Object {
     int a;
     int b;

     public Demo3() {
         // super();
         a = 10;
         b = 20;
     }

     public Demo3(int m, int n) {
         a = m;
         b = n;
     }
 }
 class Demo4 extends Demo3
    {
        int c;
        int d;
        public Demo4()
        {
            //super();
            c=30;
            d=40;
        }

    public Demo4(int p, int q)
    {
        // super();
        int c = p;
        int d=q;
    }
    public void disp(){

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    }
