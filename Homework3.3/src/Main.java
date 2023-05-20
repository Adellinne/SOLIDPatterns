import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(5, 10));
        shapes.add(new Circle(3.5));

        AreaCalculator calculator = new AreaCalculator(shapes);
        double totalArea = calculator.sumAreas();

        System.out.println("Total area: " + totalArea);
    }
}
