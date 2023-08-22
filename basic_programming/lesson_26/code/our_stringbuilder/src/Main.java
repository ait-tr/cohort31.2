public class Main {
    // StringBuilder
    /*
    конструкторы:
    StringBuilder()
    StringBuilder(String str)
    StringBuilder(int capacity)

    методы:
    append(String s) - используется для добавления  строки к уже имеющейся. Метод может также добавлять целые числа,
    float, double etc
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" ").append("Java");
        System.out.println(sb);

        // insert() - вставляет строку в исходную начиная с указанной позиции

        StringBuilder sbInsert = new StringBuilder("Hello");
        sbInsert.insert(1,"World");
        System.out.println(sbInsert);

        // replace() - заменяет исходную строку с указанной позиции заканчивая указанной позицией

        StringBuilder sbReplace = new StringBuilder("Hello");
        sbReplace.replace(1,3,"Java");
        System.out.println(sbReplace);

        // delete() -  удаляет строку между указанными индексами

        StringBuilder sbDelete = new StringBuilder("Hello");
        sbDelete.delete(1,3);
        System.out.println(sbDelete);

        // reverse() - разворачивает строку
        StringBuilder sbReverse = new StringBuilder("Hello");
        sbReverse.reverse();
        System.out.println(sbReverse);
    }





}
