package Q4;
import java.util.Scanner;


public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year : ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("It is a Leap year.");
        }else{
            System.out.println("It is not a Leap year.");
        }




    }
}
