public class Main {
    /*
    Lambda expressions and Functional Interfaces
    Лямбда выражения и функциональные интерфейсы

    Лямбда выражения - это фактически форма анонимного класса, анонимный метод ( метод без названия)
    Лямбда выражения связаны с функциональными интерфейсами

    Функциональный интерфейс - это интерфейс с одним абстрактным методом

    Синтаксис лямбда выражения
       параметры -> тело лямбда выражения
       parameters -> lambda body
     */
    public static void main(String[] args) {
        // без параметров
       // () -> 100.0;

      //  () -> Math.random() * 1000;

        // c параметрами
        // (n) -> 2.0 / n;
        // (n) -> (n % 2) == 0;  возвращает boolean
        // n -> 1/n;

        //double getValue();
        OurValue ourValue;
        ourValue = () -> 100.0;
      //  ourValue = () -> "str";
        System.out.println("value is " + ourValue.getValue());

        OurParamValue ourParamValue =(double n) -> 2.0 / n;
        System.out.println("value with param is "+ourParamValue.getValue(4.0));
      //  ourParamValue = () -> 100.0;


        OutTestInterface isDivided = (a,b) -> (a % b) == 0;
        System.out.println("a is divided by b without remainder ? "+isDivided.test(10,2));

        OutTestInterface isMore = (a,b) -> a > b;
        System.out.println("a > b ? "+ isMore.test(10,2));

        OutTestInterface isEqual =(a,b) -> a == b;
        System.out.println("a == b ?"+ isEqual.test(10, 2));

        StringTestInterface isPart = (str1,str2) ->str1.indexOf(str2) != -1;
        String str1 = " This is a test";
        System.out.println(isPart.test(str1,"is"));

        StringTestInterface isEqualStr = (a,b) -> a.equals(b);
        System.out.println(isEqualStr.test("qwertz","qwerty"));

        NumericInterface smallDividor = n -> {

            int res = 1;

            n = n < 0 ? -n : n;

            for ( int i = 2; i <= n; i++){
                if((n % i)==0){
                    res = i;
                    break;
                }
            }
            return res;

        };

    }

    public double return100(){
        return Math.random()*1000;
    }
}
