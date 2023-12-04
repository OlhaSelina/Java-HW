package Homework_18;

public class Rectangle {

    public double length;
    public double width;

    public  Rectangle(double length, double width ){
        this.length = length;
        this.width = width;

    }

    public void square(){

        System.out.print("Rectangle have square - " + length * width);
    }

    public void perimeter(){
        System.out.println("  and perimeter - " + (length * 2 + width * 2));
    }


}
