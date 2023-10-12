import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    // another flatMap example
    /*
    flatMapToInt()
    IntStream(a,b)
     */

    public static void main(String[] args) {
        Stream.of(2,3,0,1,3)
                .flatMapToInt(i -> IntStream.range(0,i))
                .forEach(System.out::print);


        System.out.println("with map");
        System.out.println();
        Stream.of(2,3,0,1,3)
                .map(i -> IntStream.range(0,i))
                .forEach(System.out::println);


        Person1 person1 = new Person1("John");
        Person1 person2 = new Person1("Kate");
        Person1 person3 = new Person1("Ann");

        BankAccount account1 = new BankAccount("DE123445674321345699",person1);
        BankAccount account2 = new BankAccount("DE123445674321345623",person2);
        BankAccount account3 = new BankAccount("DE123445674321345600",person3);
        BankAccount account4 = new BankAccount("DE123445674321341234",person1);
        BankAccount account5 = new BankAccount("DE123445674321345633",person3);

        List<BankAccount> accounts = Arrays.asList(account1,account2,account3,account4,account5);

        mapAccountsToPerson(accounts).forEach((k,v)-> System.out.println(k +" -> "+v));

        System.out.println("----with stars-------");
        System.out.println(getListWithStars(accounts));
    }

    // 1.Есть классы Person1  и BankAccount   нужно написать метод, принимающий  лист BankAccounts и возвращающий
    // мапу  где Person1  будет ключом, а лист его\ ее счетов значением
    public static Map<Person1, List<BankAccount>> mapAccountsToPerson(List<BankAccount> input){
        return input
                .stream()
                .collect(Collectors.groupingBy(BankAccount::getOwner));
    }

    // 2. Есть класс BankAccount. Нужно написать метод, принимающий лист BankAccounts и
    // возвращающий лист IBANNs со звездочкой после третьего символа
    // DE4****************,DE5*******************,

    public static List<String> getListWithStars(List<BankAccount>input){
        return input
                .stream()
                .map(a -> replaceWithStars(a.getIBAN()))
                .collect(Collectors.toList());
    }

    private static String replaceWithStars(String input){
        char[] chars = input.toCharArray();
        for( int i = 3; i < input.length();i++)
            chars[i] = '*';
        return new String(chars);
    }

}
