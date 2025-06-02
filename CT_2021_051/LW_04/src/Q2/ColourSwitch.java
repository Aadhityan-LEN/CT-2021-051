package Q2;
import java.util.Scanner;

public class ColourSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Selection number : ");
        int selection = scanner.nextInt();

        switch (selection){
            case 0 :
                System.out.println("You selected Magenta");
                break;
            case 1:
                System.out.println("You selected Cyan");
                break;
            case 2:
                System.out.println("You selected Red");
                break;
            case 3:
                System.out.println("You selected Blue");
                break;
            case 4:
                System.out.println("You selected Green");
                break;
            default:
                System.out.println("Invalid selection");



        }

    }
}
