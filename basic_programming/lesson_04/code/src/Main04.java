public class Main04 {
    public static void main(String[] args) {

        char a = 'A'; // Переменная будет содержать англ букву A
        char c = 65; // Переменная будет содержать англ букву A, код 65 соответствует символу А
        char b = 0x41; // Переменная будет содержать англ букву A, т.е. 41 в 16-сист соответствует коду символа А
        b = 0x0041; // Переменная будет содержать англ букву A, т.е. 41 в 16-сист соответствует коду символа А
        char d = '\u0041';
        char e = '\u2019';



        System.out.println(a + " b: " + b + " c: " + c + " d: " + d);
        System.out.println(e);

        char ch = 'A';
        ch++; //ch = ch + 1;
        System.out.println(ch);

        ch = 97;
        System.out.println(ch);
        ch += 2;
        System.out.println(ch);

        int x = 1;
        int y = 5;
//        x = x + y;
        x += y; // x = x + y;
//        *=, /=, -=, %=
        System.out.println(x);
        x %= y; // x = x % y;

        ch++; // ch = ch + 1;

        System.out.println(x);

        char ch1 = 12833;
        System.out.println(ch1);

        String str = "Java";
        System.out.println(str);

        String str1 = new String("Java2"); //Используем конструктор

        String str2 = new String();
        String str3 = "";
        System.out.println(str3);

        String str4 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(str4);

        String str5 = "Hello, World!";

        int length = str5.length();
        System.out.println(str5 + " length: " + length);

        str5 = str5.toUpperCase();
        System.out.println(str5);
        str5 = str5.toLowerCase();
        System.out.println(str5);

        String str6 = str5.concat(str);
        System.out.println(str6);
        str6 = str5 + " " + str;
        System.out.println(str6);

        str6 = String.join(" ", "Sample:", str5, str, str4);
        System.out.println("Join: " + str6);

        int d1 = 5678;
        String str7 = "1234" + d1;
        System.out.println(str7);

        String name = "John";
        System.out.println("My age is: " + d);

        String str8 = String.valueOf(d);
        System.out.println("str8 " + str8);

        String strNumbers = "01234567";
        System.out.println("length " + strNumbers.length());
        char firstChar = strNumbers.charAt(0);
        System.out.println("firstChar " + firstChar);
        char lastChar = strNumbers.charAt(strNumbers.length() - 1);
        System.out.println("lastChar " + lastChar);


        String substring = strNumbers.substring(2);
        String substring2 = strNumbers.substring(2, 6); // [2, 6)
        System.out.println("strNumbers " + strNumbers);
        System.out.println("substring " + substring);
        System.out.println("substring2 " + substring2);

        System.out.println(str2.isEmpty());

        System.out.println(strNumbers.replace("123", "hello"));
        System.out.println("strNumbers " + strNumbers);

        String strTrim = "  Java is great!  ";
        System.out.println(strTrim.trim());
        System.out.println(strTrim);

    }
}
