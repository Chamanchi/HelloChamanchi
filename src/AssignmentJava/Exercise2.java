package AssignmentJava;

public class Exercise2 {
    public static void main(String[] args) {
     int kilobytes;
     //parameters of printMegaBytesAndKiloBytes method
        printMegaBytesAndKiloBytes(2500);//2500KB = 2MB and 452KB
        printMegaBytesAndKiloBytes(-1024);//invalid value
        printMegaBytesAndKiloBytes(5000);//5000KB = 4MB and 904KB
    }
//printMegaBytesAndKiloBytes method
public static void printMegaBytesAndKiloBytes(int kilobytes) {
        if (kilobytes <0) System.out.println("invalid value");

        else {
            int MB = (kilobytes / 1024);
            int KB = (kilobytes % 1024);
            System.out.println(kilobytes + "KB = " + MB + "MB and " + KB + "KB");
        }

    }
}