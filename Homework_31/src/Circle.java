public class Circle implements Shape{
    double radius;
    static double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }


    @Override
    public double findArea() {
        return PI * radius * radius;

    }

    @Override
    public double perimeter() {
        return  2 * PI * radius;

    }
}
