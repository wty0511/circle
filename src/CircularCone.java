public class CircularCone {
    double height;
    Circle circleBottom;

    CircularCone(double r, double height) {
        this.circleBottom = new Circle(r);

        this.height = height;
    }

    double getCubage() {
        double square = Circle.pi * Math.pow(circleBottom.radius, 2) * height / 3;
        return square;
    }

}
