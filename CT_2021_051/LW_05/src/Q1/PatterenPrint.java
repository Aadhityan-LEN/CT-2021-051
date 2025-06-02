package Q1;

public class PatterenPrint {
    public static void main(String[] args) {
        // Loop through numbers from 10 to 49
        for (int i = 10; i <= 49; i++) {
            // Print the number followed by a space
            System.out.print(i + " ");

            // After every 10 numbers, print a new line
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
