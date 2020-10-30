package AssignmentJava;

public class LeapYearCalculator {
    public static void main(String[] args) {
 //parameters of isLeapYear method and print statements
        System.out.println(isLeapYear(-1600));//false
        System.out.println(isLeapYear(1600));//true
        System.out.println(isLeapYear(2017));//false
        System.out.println(isLeapYear(2000));//true
    }
 // isLeapYear method
public static boolean isLeapYear(long year){
    if(year<=0 ||year>9999) return false;
    else{
        if(year%400==0)
            return true;
        if(year%100==0)
            return false;
        if(year%4==0)
            return true;
        return false;
    }

}


}
