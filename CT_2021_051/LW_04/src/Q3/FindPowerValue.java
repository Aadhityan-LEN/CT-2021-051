package Q3;
import java.util.Scanner;

public class FindPowerValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the power of 10 :");
        int power = scanner.nextInt();

        switch (power){
            case 6:
                System.out.println("Millon");
                break;
            case 9:
                System.out.println("Billon");
                break;
            case 12:
                System.out.println("Trillon");
                break;
            case 15:
                System.out.println("Quadrillion");
                break;
            case 18:
                System.out.println("Quintillion");
                break;
            case 21:
                System.out.println("Sextillion");
                break;
            case 30:
                System.out.println("Nonillion");
                break;
            case 100:
                System.out.println("Googol");
                break;
            default:
                System.out.println("Invalid power value");
                break;

        }


    }
}
