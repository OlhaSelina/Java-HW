package task1;

public class Wallet {

    String type;
    String size;
    Money money; // ссілка на класс Money

    public  Wallet(String type, String size, Money money){

        this.type = type;
        this.size = size;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", money=" + money +
                '}';
    }
}
