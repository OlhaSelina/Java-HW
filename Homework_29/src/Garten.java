
/*
   Проект садовод любитель. Будем выращивать растения в течении нескольких лет
   и смотреть , результат ( что получилось)

   Задача!
   Выращиаем деревья и цветы.Каждый из этих видов имеет следующие характеристики:
   -  name, height, age
   Деревья и цветы выростают за сесон на разную высоту, одинаковую для всех деревьев, и
   одинаковая высота для цветов.
   Каждый сезон состоит из 4 времен года, в которые цветы и деревья ведут себя не всегда
   одинаково.
   Для цветов:  Сезон начинается весной, зимой они не растут, летом не растут, а цветут, осенью - их срезают
   Для деревьев: Сезон начинается весной, зимой они не растут, летом растут, осенью не растут.

   В классе  Garten нужно создать метод growPlants();  в котором будет подробно отражен процесс
   роста минимум двух видов растений( дерево и цветок) в течении нескольких лет:
   Что происходит в каждый сезон с ними, из размер в каждый сезон, их рост и возраст в конце.

   Growing plants for 2 years:
   Tilip has grown in Spring , 20
   Tilip is not grown in Summer, 20
   .....
   .....
   Pine tree has grown in Summer, 220
   .....
   По истечению 2 -х лет сделать результат ( на конец зимы) :
   Tilip has height: 25 and is 3 years old
   Pine has height: 150 and is 3 years old

   Алгоритм:
   1. Создать три класса. Родительский Plant  и дочернии Flower and Tree
   2. В классах должны быть общие характеристики:  name, height, age и поведение, выраженное
   следующими методами:
       doSprings()
       doSummer()
       duAutumn()
       doWinter()
       Подумать, какие из них лучше объявить абстрактными, а какие реализовать в родительском классе

    3. В методе growPlants реализовать смену сезонов с помощью цикла for


    */
public class Garten {
    public static void main(String[] args) {
        Plant tree = new Tree("Pine tree", 100, 1);
        Plant flower = new Flower("Tulip", 5, 1);

        Plant[] plants = {flower,tree};

        int yearsToGrow = 2;
        growPlants(plants, yearsToGrow);
    }

    public static void growPlants(Plant[] plants, int numberOfYears ){
        System.out.println("Growing plants for " + numberOfYears + " years");
        for(int i = 0; i < numberOfYears; i++) {
            for (Plant plant : plants) {
                plant.doSpring();
                plant.doSummer();
                plant.doAutumn();
                plant.doWinter();
            }
        }
        for (Plant plant:plants) {
            System.out.println("   " + plant.getName() + " has height " + plant.getHeight()
            + " and is " + plant.getAge() + " years");
        }
    }

}
