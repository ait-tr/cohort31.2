

1. During the application's operation, it is sometimes necessary to ensure exclusive access to a method or a portion of code. That is, only one thread should work with this part of the code at the same time. This can be achieved by using the `synchronized` keyword in the method's signature or by wrapping the necessary code in a `synchronized` block.

2. There are simple operations like "test-and-set" that can be implemented in a single action. In the `java.util.concurrent.atomic` package, there are classes like `AtomicXXX`, the objects of which allow you to perform such basic operations atomically without using locks.


<ul>
<li> В процессе работы аппликации, бывает необходимо обеспечить эксклюзивный доступ к методу, или части кода. Т. е. единомоментно с этой частью кода должен работать только один тред. Сделать это можно указав ключевое слово synchronized в сигнатуре метода, или обернув нужную часть кода в synchronized блок.
</li>
<li> Существуют простейшие операции типа test-and-set, которые можно реализовать за одно действие. В пакете java.util.concurrent.atomic есть классы вида AtomicXXX, объекты которых позволяют производить такие простейшие операции атомарно не используя блокировки.
</li>
</ul>