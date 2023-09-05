public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red", "Black");
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Blue", "Green");
        Triangle triangle = new Triangle(3.0, 4.0, 5.0, "Yellow", "Purple");
        
        System.out.println("Circle - Perimeter: " + circle.calculatePerimeter() +
                ", Area: " + circle.calculateArea() +
                ", Fill Color: " + circle.getFillColor() +
                ", Border Color: " + circle.getBorderColor());

        System.out.println("Rectangle - Perimeter: " + rectangle.calculatePerimeter() +
                ", Area: " + rectangle.calculateArea() +
                ", Fill Color: " + rectangle.getFillColor() +
                ", Border Color: " + rectangle.getBorderColor());

        System.out.println("Triangle - Perimeter: " + triangle.calculatePerimeter() +
                ", Area: " + triangle.calculateArea() +
                ", Fill Color: " + triangle.getFillColor() +
                ", Border Color: " + triangle.getBorderColor());
    }
}