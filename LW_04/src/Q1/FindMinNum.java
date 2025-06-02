package Q1;
import java.util.Scanner;

public class FindMinNum {
    public static void main(String[] args) {
        int a,b,c;
        int min = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 number a,b,c");
        System.out.print("a : ");
        a= scanner.nextInt();

        System.out.print("b : ");
        b= scanner.nextInt();

        System.out.print("c : ");
        c= scanner.nextInt();


        if (a<b){
            if (a<c){
                min = a;
            }else{
                min = c;
            }
        }else{
            if (b<c){
                min = b ;
            }else{
                min = c;
            }
        }
        System.out.println("Smallest number is : " + min);
    }
}
