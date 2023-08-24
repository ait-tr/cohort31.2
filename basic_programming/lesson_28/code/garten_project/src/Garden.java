public class Garden {
    /*
    Садовод-Любитель.
    Выращиваем деревья и цветы. Каждый из этих видов имеет следующие характеристики:
    name,height,age. Каждый из них вырастает на разную высоту за сезон, причем эта высота одинаковая для всех
    деревьев и всех цветов.
    Каждый год начинается весной и состоит из четырех времен года, во время которых поведение деревьев и цветов
    может отличаться:
    Цветы:
    год начинается весной и они растут
    летом они не растут, а цветут
    осенью их срезают
    зимой не растут

    Деревья:
    год начинается весной и они растут
    летом деревья растут
    осенью деревья не растут
    зимой деревья не растут

    В классе Garden создать метод growPlants  в котором должен быть отражен процесс роста нескольких растений
    в течение нескольких лет. Что происходит зимой, летом, весной осенью в каждый сезон и какого они роста и возраста
     в конце
     например:
     Pine tree has grown in Spring- 100
     Pine tree has grown in Sommer - 115
     Pine tree has not  grown in Autumn - 115
     Pine tree has not grown in Winter - 115
     Tulip has grown in spring - 24
     -------
     Pine tree has height 250 and is 5 years old

     Алгоритм решения :
     1.создать родительский класс Plant
     2. создать дочерние классы Flower and Tree
     3. создать в этих классах методы, характеризующие поведение цветов и деревьев
        в соответствующий период( лето, весна, осень, зима)
        doSpring()
        doSummer()
        doWinter()
        doAutumn()

         в родительском классе должны быть поля
         name, height, age

         в дочерних классах может быть поле flower_grow_per_season = 2
         tree_grow_per_season = 5

     4. метод growPlants должен производить действия над массивом обьектов типа Plant
     */

    public static void growPlants( Plant[]plants, int years){
        System.out.println("Growing plants for " + years + " years");

        for( int i = 0; i < years; i++) {
            for (Plant plant : plants) {
                plant.doSpring();
                plant.doSummer();
                plant.doAutumn();
                plant.doWinter();
            }
        }

        for( Plant plant : plants){
            System.out.println(plant.getName() + " has height: "+plant.getHeight()+" and is "
                    + plant.getAge() + " years old");
        }

    }

    public static void main(String[] args) {
         Plant tree = new Tree("Pine tree",100,1);
         Plant flower = new Flower("Tulip",0,1);
         Plant flower1 = new Flower("Rose",20,1);

         Plant[] plants = {flower,flower1,tree};
         int years = 2;

         growPlants(plants,years);
    }
}
