public class Main
{
    public static void main(String[] args)
    {
        Circle circle = new Circle(5);
        double circleArea = circle.calculateArea();
        System.out.println("Circle area: " + circleArea);

        Square square = new Square(4);
        double squareArea = square.calculateArea();
        System.out.println("Square area: " + squareArea);

        Rectangle rectangle = new Rectangle(3, 6);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Rectangle area: " + rectangleArea);
    }
}