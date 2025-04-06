package Q_01;
import java.util.Scanner;

public class Temperature {
    // Private variable to store temperature in Celsius
    private double celsius;

    // No-arg constructor (defaults to 0°C)
    public Temperature() {
        this.celsius = 0.0;
    }

    // Parameterized constructor (accepts Celsius value)
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Getter for Celsius (returns stored value)
    public double toCelsius() {
        return this.celsius;
    }

    // Getter for Fahrenheit (converts stored Celsius to Fahrenheit)
    public double toFahrenheit() {
        return this.celsius * 9 / 5 + 32;
    }

    // Setter for Celsius
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    // Setter for Fahrenheit (converts to Celsius and stores)
    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }

    // Main program to demonstrate the class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double inputCelsius = scanner.nextDouble();

        // Create Temperature object with user input
        Temperature temp = new Temperature(inputCelsius);

        // Display the converted temperature
        System.out.printf("%.2f°C is equivalent to %.2f°F%n",
                temp.toCelsius(), temp.toFahrenheit());

        scanner.close();
    }
}