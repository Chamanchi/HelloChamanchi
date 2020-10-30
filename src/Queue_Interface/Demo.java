package Queue_Interface;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args){
        ArrayList<Integer> dice= new ArrayList<Integer>();
        dice.add(1);
        dice.add(2);
        dice.add(3);
        dice.add(4);
        dice.add(5);
        dice.add(6);
        Collections.shuffle(dice);
        System.out.println("Dice is rolled and the number is:"+dice.get(1));
        System.out.println("Dice is rolled and the number is:"+dice.get(5));
    }

}
