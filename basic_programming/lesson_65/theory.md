**Multithreading**

Most programming languages support a crucial feature called multithreading, and Java is no exception in this regard. With multithreading, we can allocate multiple threads in an application to perform different tasks simultaneously. For example, in a graphical application that sends requests to a server or reads and processes a large file, without multithreading, the graphical interface would become unresponsive during task execution. However, thanks to threads, we can allocate tasks like sending a request or any other task that may take a long time to complete, to a separate thread. Therefore, most real-world applications that many of us use would be practically inconceivable without multithreading.

**The Thread Class**

In Java, the functionality of a separate thread is encapsulated in the Thread class. To create a new thread, we need to create an object of this class. However, threads do not spontaneously come into existence. When a program starts, the main thread of that program begins its work. All other child threads are derived from this main thread. By default, the name of the main thread is "main."

The Thread class provides several methods for managing threads. The most commonly used ones include:

- `getName()`: Returns the thread's name.
- `setName(String name)`: Sets the thread's name.
- `getPriority()`: Returns the thread's priority.
- `setPriority(int priority)`: Sets the thread's priority. Priority is one of the key factors for the system to choose which thread to execute from a pool of threads. This method takes a numerical priority value from 1 to 10 as a parameter. By default, the main thread is assigned a medium priority of 5.
- `isAlive()`: Returns `true` if the thread is active.
- `isInterrupted()`: Returns `true` if the thread has been interrupted.
- `join()`: Waits for the thread to finish.
- `run()`: Defines the entry point for the thread.
- `sleep()`: Pauses the thread for a specified number of milliseconds.
- `start()`: Initiates the thread by calling its `run()` method.



***Многопоточность***

Большинство языков программирования поддерживают такую важную функциональность как многопоточность, и Java в этом плане не исключение. При помощи многопоточности мы можем выделить в приложении несколько потоков, которые будут выполнять различные задачи одновременно. Если у нас, допустим, графическое приложение, которое посылает запрос к какому-нибудь серверу или считывает и обрабатывает огромный файл, то без многопоточности у нас бы блокировался графический интерфейс на время выполнения задачи. А благодаря потокам мы можем выделить отправку запроса или любую другую задачу, которая может долго обрабатываться, в отдельный поток. Поэтому большинство реальных приложений, которые многим из нас приходится использовать, практически не мыслимы без многопоточности.

**Класс Thread**   
В Java функциональность отдельного потока заключается в классе Thread. И чтобы создать новый поток, нам надо создать объект этого класса. Но все потоки не создаются сами по себе. Когда запускается программа, начинает работать главный поток этой программы. От этого главного потока порождаются все остальные дочерние потоки.  
По умолчанию именем главного потока будет main.  

Для управления потоком класс Thread предоставляет еще ряд методов. Наиболее используемые из них:
  
getName(): возвращает имя потока  

setName(String name): устанавливает имя потока  

getPriority(): возвращает приоритет потока  

setPriority(int proirity): устанавливает приоритет потока. Приоритет является одним из ключевых факторов для выбора системой потока из кучи потоков для выполнения. В этот метод в качестве параметра передается числовое значение приоритета - от 1 до 10. По умолчанию главному потоку выставляется средний приоритет - 5.
  
isAlive(): возвращает true, если поток активен  

isInterrupted(): возвращает true, если поток был прерван  

join(): ожидает завершение потока  

run(): определяет точку входа в поток  

sleep(): приостанавливает поток на заданное количество миллисекунд  

start(): запускает поток, вызывая его метод run()  