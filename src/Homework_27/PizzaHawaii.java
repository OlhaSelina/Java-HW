package Homework_27;

public class PizzaHawaii extends Pizza {

    public  void prepare(){
        super.prepare();
        System.out.println("Hawaii");
    }

    public  void bake(){
        super.bake();
        System.out.println("Hawaii");
    }

    public void pack(){
        super.pack();
        System.out.println("Hawaii");
    }
}
