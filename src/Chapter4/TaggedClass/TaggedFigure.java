package Chapter4.TaggedClass;

/**
 * Tagged class which instances come in two or more flavors
 * and contains a tag field indicating the flavor of the instance
 *
 * Tagged class are cluttered with boilerplate(flavors enum declarations, tag fields, switch statements)
 *
 * We need to transform a tagged class into a class hierarchy
 * */
public class TaggedFigure {

    // flavors
    enum Shape {
        RECTANGLE, CIRCLE;
    }

    // tagged field
    final Shape shape;

    // for rectangle
    double width;
    double height;

    // for circle
    double radius;

    // Constructor for rectangle
    TaggedFigure(double width, double height) {
        this.shape = Shape.RECTANGLE;
        this.width = width;
        this.height = height;
    }

    // Constructor for circle
    TaggedFigure(Double radius) {
        this.shape = Shape.CIRCLE;
        this.radius = radius;
    }

    double area() {
        return switch (shape) {
            case RECTANGLE -> width * height;
            case CIRCLE -> Math.PI * (radius * radius);
        };
    }


}
