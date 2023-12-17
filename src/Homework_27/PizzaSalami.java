package Homework_27;

public class PizzaSalami extends Pizza{



    public  void prepare(){
       super.prepare();
        System.out.println("Salami");
    }

    public  void bake(){
        super.bake();
        System.out.println("Salami");
    }

    public void pack(){
        super.pack();
        System.out.println("Salami");
    }


}
