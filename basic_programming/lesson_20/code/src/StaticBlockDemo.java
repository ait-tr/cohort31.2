public class StaticBlockDemo {
    static String[] strings;

    static {
        strings = new String[4];
        strings[0] = "Max";
        strings[1] = "John";
        strings[2] = "Alex";
        strings[3] = strings[2] + " / " + strings[1];
    }
}
