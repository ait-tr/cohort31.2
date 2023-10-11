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

}
