Полиморфизм - один из принципов ООП. 
Само слово полиморфизм имеет греческие корни и в примерном переводе значит - "множество форм".
А дальше, как говорится, "возможны варианты". Существует множество определений для явления полиморфизма. Включая очень мудреные и не понятных, даже после 5го прочтения этого определения.

**Полиморфизм** — это концепция объектно-ориентированного программирования (ООП), которая позволяет рассматривать объекты разных классов как объекты общего класса. В Java полиморфизм означает, что метод может иметь несколько реализаций в зависимости от типа объекта, с которым выполняется операция.

**Полиморфизмом** называется возможность работать с несколькими типами так, как будто это один и тот же тип и в то же время поведение каждого типа будет уникальным в зависимости от его реализации.

**Полиморфизм** — одна из четырех фундаментальных концепций объектно-ориентированного программирования, которая позволяет выполнять определенную задачу(действие) несколькими способами.

Полиморфизм позволяет рассматривать объекты как объекты их базового класса, что позволяет писать общий код, делая его более гибким и пригодным для повторного использования. Это позволяет создавать более многоразовый и удобный в сопровождении код, а также повышает читаемость кода.

Да, полиморфизм - это точно про гибкость. Основной механизм в Java, делающий наш код гибким.

Т.к. класс содержит все методы класса, от которого он был унаследован, то объект этого класса можно сохранить в переменную любого из его типов родителей.

Если в результате присваивания мы двигаемся по цепочке наследования вверх (к типу Object), то это — расширение типа (оно же — восходящее преобразование или upcasting), а если вниз, к типу объекта, то это — сужение типа (оно же — нисходящее преобразование или downcasting).

```
public class Main24 {
   public static void main(String[] args) {
       Cat cat = new Cat();
       Dog dog = new Dog();
       Hamster hamster = new Hamster();
   }
}
```

```
public class Main24 {
   public static void main(String[] args) {
       Animal cat = new Cat();
       Animal dog = new Dog();
       Animal hamster = new Hamster();
   }
}
```

