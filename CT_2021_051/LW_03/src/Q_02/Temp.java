package Q_02;
import java.util.Scanner;
import Q_01.Temperature;

public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double inputFahrenheit = scanner.nextDouble();

        // Create Temperature object (initial value doesn't matter since we'll set Fahrenheit)
        Temperature temp = new Temperature();

        // Set the temperature using Fahrenheit value
        temp.setFahrenheit(inputFahrenheit);

        // Display the equivalent Celsius temperature
        System.out.printf("%.2f°F is equivalent to %.2f°C%n",
                inputFahrenheit, temp.toCelsius());

        scanner.close();
    }
}
