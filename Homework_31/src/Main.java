public class Main {

    /*
    Создать интерфейс Shape, содержащий методы для подсчета площади и периметра фигуры и классы прямоугольник и круг, реализующие этот интерфейс.
В методе main создать несколько фигур и вывести на печать площадь и периметр каждой.
Написать метод, вычисляющий общую площадь фигур нескольких видов.
     */

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(15.0, 20.0);
        Circle circle = new Circle(10.7);

        System.out.println("Area of rectangle = " +  rectangle.findArea());
        System.out.println("Perimeter of rectangle = " + rectangle.perimeter());
        System.out.println("Area of circle = " + circle.findArea());
        System.out.println("Circumference = " + circle.perimeter());

        System.out.println("TotalArea = " + (rectangle.findArea() + circle.findArea()));



    }

}
