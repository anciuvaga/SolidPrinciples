import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class ShapesPrinter {

    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }


    public void json(List<Shape> shapes) {
        System.out.printf("{shapes_sum: %s}%n", areaCalculator.sum(shapes));
    }

    public void csv(List<Shape> shapes) {
        System.out.printf("shapes_sum,%s", areaCalculator.sum(shapes));
    }
}
