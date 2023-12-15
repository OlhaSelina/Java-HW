package Homework_26;

public class Main {

    /*
    Используя свойства наследования написать программу для подсчета тркх видов фигур - круга, прамоугольника,
    квадрата

    Создать классы  Circle, Rectangle, Square , содержащие соответствующие методы.
    Затем в методе маин создать массыв из нескольких фигур и вывести на печать площадь каждой фигуры
     */
    public static void main(String[] args) {
        Shape circle = new Circle("Circle", 10.0);
        Shape rectangle = new Rectangle("Rectangle", 5.0, 10.0);
        Shape square = new Square("Square", 5.0);
        Shape share = new Shape("Shape"); // можно не создавать

        Shape[] shapes = {circle,rectangle,share,square};

        for(Shape s: shapes){
            System.out.println(s.getName() + "has area of " + s.findArea());
        }
    }

}
