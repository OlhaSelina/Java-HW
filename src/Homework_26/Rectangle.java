package Homework_26;

public class Rectangle extends Shape {
    private  double lenght;
    private  double width;

    public  Rectangle(String name, double lenght, double width){
        super(name);
        this.lenght = lenght;
        this.width = width;
    }

    public  double findArea(){
        return lenght * width;
    }

}
