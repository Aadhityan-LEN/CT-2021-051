package Q_03;

public class CircularRegionCalculator {
    public static void main(String[] args) {
        // Example usage
        Circle innerCircle = new Circle(5.0);  // radius ri = 5.0
        Circle outerCircle = new Circle(8.0);  // radius ro = 8.0

        double shadedArea = outerCircle.computeArea() - innerCircle.computeArea();
        System.out.println("Area of the circular region: " + shadedArea);
    }
}

class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to compute area
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    // Method to compute circumference
    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}
