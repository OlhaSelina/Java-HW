package Homwork_22;

public class CarInSalon {


    String[] salon;

    public CarInSalon(String[] salon) {
        this.salon = salon;
    }

    public void findCar(String carToFind) {

        for (int i = 0; i < salon.length; i++) {

            if (salon[i].equalsIgnoreCase(carToFind)) {
                System.out.println(" This car is available");
                return;
            }

        }

        System.out.println("This car is not available ");
        for (String car : salon)
            System.out.println(car + " ");

    }
}


