package Homework_19;

public class Temperature {


    public double farenheit;

    public Temperature(){
        //this.celsius = celsius;
        farenheit = 232;


    }
    public void celsius (){
        double celsius;
        celsius = 5*(farenheit - 32)/9;
        System.out.println( farenheit + "  градусов по Фаренгейту равно:  " + celsius + " градусов по Цельсию" );
    }


}
