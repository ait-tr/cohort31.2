public class Main {

    // Интерфейс в джава
    /*
    public interface MyInterface{
      public returnType method-name1( param-list);
       returnType method-name2( param-list);

    }

    Основные моменты:
    1. Обьект интерфейса создать нельзя
    2. Интерфейс предоставляет полную абстракцию так как его методы не имеют тела.
        С другой стороны, абстрактный класс предоставляет частичную абстракцию
    3. Для реализации классом интерфейса используется ключевое слово implements
    4. При реализации методов интерфейса они должны быть обьявлены публичными
    5. Класс, реализующий интерфейс, должен реализовать все его абстрактные методы или
        сам должен быть обьявлен абстрактным
    6. Все абстрактные методы интерфейса по умолчанию являются публичными
    7. Переменные, обьявленные в интерфейсе по умолчанию являются публичными, статическими и финальными.Они должны
        быть инициализированы при создании. Т.е. фактически являются константами
     */
    public static void main(String[] args) {
        Movable car = new Car();
        Car car1 = new Car();
        car.canMove();
    }
}