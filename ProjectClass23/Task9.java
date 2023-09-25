package ProjectClass23;
/*
9. Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimiter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code.

 */
public class Task9 {
    interface Shape {
        double calculateArea();

        double calculatePerimeter();
    }

    // Implement the Circle class
    class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    // Implement the Square class
    class Square implements Shape {
        private double sideLength;

        public Square(double sideLength) {
            this.sideLength = sideLength;
        }

        @Override
        public double calculateArea() {
            return sideLength * sideLength;
        }

        @Override
        public double calculatePerimeter() {
            return 4 * sideLength;
        }
    }

    public class ShapeTest {
        public void main(String[] args) {
            // Create a Circle and a Square
            Circle circle = new Circle(5.0);
            Square square = new Square(4.0);

            // Calculate and display the area and perimeter of the Circle
            System.out.println("Circle Area: " + circle.calculateArea());
            System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

            // Calculate and display the area and perimeter of the Square
            System.out.println("Square Area: " + square.calculateArea());
            System.out.println("Square Perimeter: " + square.calculatePerimeter());
        }
    }}