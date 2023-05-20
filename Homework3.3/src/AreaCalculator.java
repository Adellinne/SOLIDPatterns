import java.util.List;
public class AreaCalculator
{
    private List<Shape> shapes;

    public AreaCalculator(List<Shape> shapes)
    {
        this.shapes = shapes;
    }

    public double sumAreas()
    {
        double sum = 0;
        for (Shape shape : shapes) {

            sum += shape.calculateArea();
        }
        return sum;
    }
}
