package Homework_26;

public class Square extends  Shape{

    private  double a;
    public  Square(String  name, double a){
        super(name);
        this.a = a;
    }

    @Override
    public double findArea() {
        return  a * a;

    }
}
