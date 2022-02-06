package Chapter4.TaggedClass;

abstract class HierarchyFigure {
    abstract double area();
}

class Circle extends HierarchyFigure {

    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends HierarchyFigure {

    final double width;
    final double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}


