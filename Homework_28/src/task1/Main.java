package task1;

public class Main {
    /*
    С использованием агрегации (HAS-A relationship) создать классы Кошелек ( Wallet ) и Деньги ( Money).
    Вывести на печать несколько обьектов класса Wallet

     */

    public static void main(String[] args) {

        Money money1 = new Money("Euro", 100); // создали деньги

        Wallet wallet = new Wallet("leather", "big", money1);// создали кошелек с деньгами
        System.out.println(wallet);
    }
}
