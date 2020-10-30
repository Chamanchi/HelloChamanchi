package AssignmentJava;

public class SpeedConverter {
    public static void main(String[] args) {

// parameters of toMilesPerHour method  and print statements
        System.out.println(toMilesPerHour(1.5));//1
        System.out.println(toMilesPerHour(10.25));//6
        System.out.println(toMilesPerHour(-5.6));//-1
        System.out.println(toMilesPerHour(25.42));//16
        System.out.println(toMilesPerHour(75.114));//47
// parameters of printConversion method
        printConversion(1.5); //1.5km/h=2.4000000000000004 mi/h
        printConversion(10.25);//10.25km/h=16.400000000000002 mi/h
        printConversion(-5.6);// invalid value
        printConversion(25.42);//25.42km/h=40.672000000000004 mi/h
        printConversion(75.114);//75.114km/h=120.18240000000002 mi/h

    }
// toMilesPerHour method
    private static long toMilesPerHour(double kMPH) {
        if(kMPH < 0) return -1;
        else {
            return Math.round(kMPH / 1.609);

        }
    }
// printConversion method
    public static void printConversion(double KMPH)
   {
        if(KMPH < 0)
        {
            System.out.println(" invalid value");
        }
        else
            {
            System.out.println(KMPH+"km/h="+KMPH*1.6 + " mi/h");
            }

  }



}
