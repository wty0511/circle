public class Circle {
    static final double pi=3.14;
    double radius;
    Circle(double radius){
        this.radius=radius;

    }
    double getCubage (){
        double square=pi*Math.pow(radius,2);
        return square;
    }
}
