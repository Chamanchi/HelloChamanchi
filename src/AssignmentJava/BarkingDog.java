package AssignmentJava;
public class BarkingDog
{
    public static void main(String[] args)
    {
// parameters of shouldWakeUp method and print statements
        System.out.println(shouldWakeUp(true,1));//true
        System.out.println(shouldWakeUp(false,2));//false
        System.out.println(shouldWakeUp(true,8));//false
        System.out.println(shouldWakeUp(true,-1));//false
    }
//shouldWakeUp method
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        boolean result = false;
        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        else if (hourOfDay >= 8 && hourOfDay <= 22){
            result = false;
        }

        else if (hourOfDay >= 1 || hourOfDay <=7 || hourOfDay >=23){
            if(barking == true){
                result = true;
            }
            else {
                result = false;
            }
        }
        return result;
    }
}