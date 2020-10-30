package AssignmentJava;

public class TeenNumberCheck
{
    public static void main(String[] args)
    {
        // parameters of hasbeen method
        System.out.println(hasTeen(9, 99, 19)); //true
        System.out.println(hasTeen(23, 15, 42)); //true
        System.out.println(hasTeen(22, 23, 34));//false
        //parameters of isTeen method
        System.out.println(isTeen(9));//false
        System.out.println(isTeen(13));//true
        System.out.println(isTeen(24));//false
    }
    // hasTeen method
    public static boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19))
        {
            return true;
        } else {
            return false;
        }
    }

    //    isTeen method
    public static boolean isTeen(int age) {

        if (age >= 13 && age <= 19)
        {
            return true;
        } else {
            return false;
        }
    }
}




