import java.util.Stack;

public class OurStack {

    // Stack - стэк -  структура данных, основанная на принципе LIFO ( last-in-first-out)
    // конструктор стека Stack()

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();


        // методы стека
        // empty()
        System.out.println(stack.empty());

        // добавляет элт на вершину стека push()
        stack.push("aaa");
        stack.push("bbb");
        stack.push("ccc");

        System.out.println(stack);

        // pop() - возвращает элемент и удаляет его при этом
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
     //   System.out.println(stack.pop());
        System.out.println(stack);

        //peek() - возвращает элемент не удаляя его
        stack.push("ddddd");
        System.out.println(stack.peek());
        System.out.println(stack);
    }


}
