// Parent class
class Shape {
    // Method to calculate area (generic message for Shape)
    public void calculateArea() {
        System.out.println("Cannot determine the area of an unknown shape.");
    }
}

// Child class: Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the Circle: " + area);
    }
}

// Child class: Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of the Rectangle: " + area);
    }
}

// Main class
public class InheritancePolymorphismDemo {
    public static void main(String[] args) {
        // Using polymorphism: Parent reference pointing to child objects
        Shape shape1 = new Circle(5.0); // Circle with radius 5.0
        Shape shape2 = new Rectangle(4.0, 6.0); // Rectangle with length 4.0 and width 6.0

        // Method calls (polymorphic behavior)
        shape1.calculateArea();
        shape2.calculateArea();
    }
}
