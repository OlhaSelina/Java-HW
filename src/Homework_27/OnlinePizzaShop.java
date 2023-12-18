package Homework_27;

import java.util.Scanner;

/*
    сoздать магазин\фабрику по продаже и производству пиццы. Программа должна
     уметь готовить следующие виды пиццы:
    Гавайи, Маргарита, Салями
    Каждый вид пицы должен уметь: подготавливаться ( напр. складываться
    ингридиенты), выпекаться и упаковываться.
    В каждом случае должно быть понятно о какой пицце идет речь
    Класс OnlinePizzaShop не должен создаваться новый объект пицца, а из него
     должен поступать заказ
     на изготовление требуемого вида пиццы ( объекта) в класс  PizzaChoice ,
     который и должен выбрать
     нужную пицу для изготовления

     Выбор пиццы осуществляется клиентом с клавиатуры в классе
     OnlinePizzaShop, при этом нужно обеспечить проверку
     правильности выбора клиента и возможность заказать еще дополнительно пиццы.

     Pizza - родительский класс
     PizzaSalami, PizzaMargarita, PizzaHawaii - дочернии

     В этих классах должны быть минимум три метода, отражающие процес
     приготовления пиццы из ТЗ
     prepare(); bake(); pack(); - metods
     oderPizza() -  начало приготовления пицы
     пользователь со сканера вводит вид пиццы, который хотят купить и этот
     выбор передается в свич ( переменную), которая передается
     в нужный метод и начинается процесс готовки

     PizzaChoice - сюда в соответствующий метод  будет передаваться выбор
     клиента и в зависимости от этого выбота
     через свитч возвращаться новый объект, соответствующий пице, на который
     уже будет вызываться метод
     createPizza(String type)

     Последовательность дествий при заказе:
     - через консоль - введите название пицы которое хотите купить( 1,2,3)
     - делаем проверку на правильность - если не  верно, то просим ввести
     правильный выбор, если выбор правильный,
     то выводим - готовится Baking Pizza Margarite пицца Маргарита (
     например)   потом  Packing Pizza Margarita
     - дальше выводим  - Ваша пица готова. .
     После спрашиваем - хотите ли вы еще сделать заказ?  - если да , то
     повторяем процесс, если нет , то пишем  -
     Можете забрать заказ( или доставка будет дерез 10 минут) Приятного
     аппетита!

      Сделать проще - в методе маин через сканер предложить сделать выбор
      клиенту, затем передать выбор в свитч ,
      который в методе choosePizza

     */

public class OnlinePizzaShop {
    public static void main(String[] args) {
        String[] arrayPizza = {"Salami", "Margarita", "Hawaii"};
        int index = 0;

        Scanner myScan = new Scanner(System.in);
        for(String typePizza : arrayPizza) {
            System.out.println(typePizza + " - " + ++index);
        }
        System.out.print("Please select the pizza you want: ");

        int number;
        while(true) {

            while(!myScan.hasNextInt()) {
                System.err.print("You entered a non-numeric value. Try again:" +
                        " ");
                myScan.next();
            }

            number = myScan.nextInt();

            if(number < 1 || number > arrayPizza.length) {
                System.err.print("This is not the correct number. Try again: ");
            } else {
                break; // Тут заканчивается while (true) и мы выходим из
                // цикла while с новым правильным значением переменной number.
                // А пока не будет введено верное число, цикл будет вечный.
                // Попробуй разобраться, что и как работает.
            }
        }
        myScan.close(); // TEST

 /* НИЖЕ ТВОЙ КОД С ОШИБКАМИ, ПОСТОРАЙСЯ РАЗОБРАТЬСЯ В ПРОБЛЕМЕ

       while (!myScan.hasNextInt()) {
            System.err.print("You entered a non-numeric value. Try again. ");
            myScan.next();
        }

            int number = myScan.nextInt();

        while (myScan.hasNextInt()){
            if (number < 1 || number > arrayPizza.length) {
                System.err.print("This is not the correct number. Try again. ");
                myScan.nextInt();
            }
*/

        if(number > 0 && number < arrayPizza.length) {

            PizzaChoice.choosePizza(number).prepare();  // Теперь ОК
            PizzaChoice.choosePizza(number).bake();
            PizzaChoice.choosePizza(number).pack();
        }
    }
}

