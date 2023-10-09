public class Transformer2 {
     /*
     2. Дана строка, состоящая из слов, разделенных пробелом. Написать метод, позволяющий изменять слова в строке
      таким образом:
     1. При длине слова = 3 изменить все буквы этого слова на заглавные и вернуть измененную строку
     Пример: "aaa BBBB deF vbghR bbb" -> "AAA BBBB DEF vbghR BBB"
     2. При длине слова = 4 изменить все буквы этого слова на строчные(маленькие) и вернуть измененную строку
     Пример: "aaa BBBB deF vbghR bbb" -> aaa bbbb deF vbghR bbb
     3. При длине слова = 5 изменить все буквы слова на звездочки  и вернуть измененную строку
     Пример: "aaa BBBB deF vbghR bbb" -> aaa BBBB deF ***** bbb
      Слова состоят только из букв латинского алфавита
      Использовать интерфейсы

      */
     public static void main(String[] args) {
         String input = "aaa BBBB deF vbghR bbb";

         Transformer2 t = new Transformer2();
         WordsChecker w1 = new ToLowerCaseChecker();
         System.out.println(t.transformWithInterface(input,w1));

         WordsChecker w2 = new ToUpperCaseChecker();
         System.out.println(t.transformWithInterface(input,w2));
     }

    public String transformWithInterface( String sentence, WordsChecker w){
        String[] words = sentence.split(" ");

        for( int i = 0; i < words.length; i++){
            if(w.checkWord(words[i])){
                words[i] = w.transformWord(words[i]);
            }
        }
        return String.join(" ",words);
    }
}
