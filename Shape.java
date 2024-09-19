package komjava;

abstract class Shape1 {
    abstract double area();
}

class Circle extends Shape1 {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape1 {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

public class Shape {
    public static void main(String[] args) {
        Shape1 circle = new Circle(4);
        Shape1 rectangle = new Rectangle(6, 8);
        Shape1 square = new Square(4);

        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Square area: " + square.area());
    }
}