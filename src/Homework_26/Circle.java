package Homework_26;

public class Circle extends Shape{

    private double radius;
    private static double PI = 3.14;

    public  Circle(String name, double radius){
        super(name);
        this.radius = radius;

    }

    @Override
    public double findArea() {
        return PI * radius * radius;
    }
}
