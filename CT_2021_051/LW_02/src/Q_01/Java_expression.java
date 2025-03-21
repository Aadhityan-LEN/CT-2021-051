/*1. Write Java expressions to compute each of the following: a. The square root of
𝐵2+4𝐴𝐶(where A and C are distinct variables). b. The square root of
𝑋+4𝑌3 . c. The cube root of the product of X and Y. d. The area of a circle. */

package Q_01;
import java.lang.Math;

public class Java_expression {
    public static void main(String[] args) {
        /* a */
        int A = 10;
        int B = 20;
        int C = 30;
        double result_a = Math.sqrt(Math.pow(B, 2) + 4 * C * C);
        System.out.println("result : " + result_a);

        /* b */
        int x = 10;
        int y = 20;
        double result_b = Math.sqrt(x + 4 * Math.pow(y, 3));
        System.out.println("result : " + result_b);

        /* c */
        double result_c = Math.cbrt(x * y);
        System.out.println("result : " + result_c);

        /* d */
        double radius = 3.0;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("area : " + area);

    }
}

