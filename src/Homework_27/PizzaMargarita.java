package Homework_27;

public class PizzaMargarita extends Pizza{

    public  void prepare(){
        super.prepare();
        System.out.println("Margarita");
    }

    public  void bake(){
        super.bake();
        System.out.println("Margarita");
    }

    public void pack(){
        super.pack();
        System.out.println("Margarita");
    }
}
