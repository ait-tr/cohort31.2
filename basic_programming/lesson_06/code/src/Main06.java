public class Main06 {
    public static void main(String[] args) {
        int x = 10;

        {
            int y = 15; // переменная y объявлена в блоке
             x = x + y;
        }

        System.out.println(x); // x => 25
//        x = x + y; // ошибка компиляции

        System.out.println((x == 10) ? "x = 10" : "x != 10");
    }
}
