import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
        IAreaCalculator areaCalculatorV2 = new AreaCalculatorV2();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        Rectangle rectangle = new Rectangle();
        NoShape noShape = new NoShape();
        ShapesPrinter printer = new ShapesPrinter(areaCalculator);
        List<Shape> shapes = List.of(circle, square, cube, rectangle);
        printer.json(shapes);
        printer.csv(shapes);
    }
}