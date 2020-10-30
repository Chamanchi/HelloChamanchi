package AssignmentJava;

public class EqualSumChecker {
    public static void main(String[] args) {
 // parameters of hasEqualSum and println statements
        System.out.println(hasEqualSum(1, 1, 1));//false
        System.out.println(hasEqualSum(1, 1, 2));//true
        System.out.println(hasEqualSum(1, -1, 0));//true
    }
// hasEqualSum method
    public static boolean hasEqualSum(int a, int b, int c) {
        if ((a + b) == c) return true;
        else {
            return false;
        }
    }
}