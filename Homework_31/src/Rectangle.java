public class Rectangle implements Shape {

    double lenght;
    double width;


    public Rectangle(double lenght, double width){
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public  double findArea() {
        return lenght * width;

    }

    @Override
    public double perimeter() {
        return 2*(lenght + width);

    }
}
