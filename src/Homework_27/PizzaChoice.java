package Homework_27;

public class PizzaChoice  {
    public static Pizza choosePizza(int number){

        switch (number){

            case 1: return new PizzaSalami();


            case 2: return new PizzaMargarita();


            case 3: return new PizzaHawaii();


            default: return null;

        }
    }

}
