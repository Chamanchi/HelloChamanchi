package Queue_Interface;

import java.util.PriorityQueue;

public class P1
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        pq.add(100);
        pq.add(50);
        pq.add(180);
        pq.add(150);
        pq.add(25);

        pq.add(125);
        pq.add(175);
        System.out.println(pq);//[25, 50, 125, 150, 100, 180, 175]
        pq.remove(175);
        System.out.println(pq);//[25, 50, 125, 150, 100, 180]
    }
}
