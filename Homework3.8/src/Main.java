import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle());
        shapes.add(new Circle());

        ShapeDrawer shapeDrawer = new ShapeDrawer(shapes);
        shapeDrawer.drawAllShapes();
    }
}
