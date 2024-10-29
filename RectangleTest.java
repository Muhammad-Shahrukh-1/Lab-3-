// Rectangle Class
class Rectangle {
    private double length = 1.0;
    private double width = 1.0;

    // Constructor with default values
    public Rectangle() {
    }

    // Constructor with parameters for custom length and width
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length with validation
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            System.out.println("Invalid value for length. It must be greater than 0.0 and less than 20.0.");
        }
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width with validation
    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("Invalid value for width. It must be greater than 0.0 and less than 20.0.");
        }
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Main Class to test Rectangle
public class RectangleTest {
    public static void main(String[] args) {
        // Creating a Rectangle object with default values
        Rectangle rect1 = new Rectangle();
        System.out.println("Default Rectangle:");
        System.out.println("Length: " + rect1.getLength());
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Area: " + rect1.calculateArea());
        System.out.println("Perimeter: " + rect1.calculatePerimeter());

        // Creating a Rectangle object with custom values
        Rectangle rect2 = new Rectangle(10.5, 15.3);
        System.out.println("\nCustom Rectangle:");
        System.out.println("Length: " + rect2.getLength());
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Area: " + rect2.calculateArea());
        System.out.println("Perimeter: " + rect2.calculatePerimeter());

        // Testing invalid values
        System.out.println("\nTesting invalid values:");
        rect2.setLength(25.0); // Should show an error message
        rect2.setWidth(-5.0); // Should show an error message

        // Setting valid values
        System.out.println("\nSetting new valid values:");
        rect2.setLength(12.3);
        rect2.setWidth(8.6);
        System.out.println("Updated Length: " + rect2.getLength());
        System.out.println("Updated Width: " + rect2.getWidth());
        System.out.println("Updated Area: " + rect2.calculateArea());
        System.out.println("Updated Perimeter: " + rect2.calculatePerimeter());
    }
}
