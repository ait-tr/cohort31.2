***Queues and the ArrayDeque Class***  

Queues represent a data structure that operates on the principle of FIFO (first in - first out). In other words, the earlier an element was added to the collection, the earlier it will be removed. This is the standard model for a one-way queue. However, there are also two-way queues, where you can add elements not only at the beginning but also at the end, and consequently remove elements not only from the end but also from the beginning.
  
The special feature of queue classes is that they implement special interfaces, either Queue or Deque.  

***Queue Interface***  
The generic Queue<E> interface extends the basic Collection interface and defines the behavior of a one-way queue. It exposes its functionality through the following methods:
  
E element(): Returns, but does not remove, the element at the front of the queue. 
If the queue is empty, it throws a NoSuchElementException.  
boolean offer(E obj): Adds the element obj to the end of the queue. 
If the element is successfully added, it returns true; otherwise, it returns false.  
E peek(): Returns the element at the front of the queue without removing it. 
If the queue is empty, it returns null.  
E poll(): Returns and removes the element at the front of the queue. If the queue is empty, it returns null.  
E remove(): Returns and removes the element at the front of the queue.   
If the queue is empty, it throws a NoSuchElementException.  
Therefore, all classes that implement this interface will have an offer method to add to the queue, a poll method to retrieve an element from the head of the queue, and peek and element methods for simply getting the element from the head of the queue.
  
***Deque Interface***  
The Deque interface extends the aforementioned Queue interface and defines the behavior of a two-way queue, which can operate as a regular one-way queue or as a stack using the LIFO (last in, first out) principle.
  
The Deque interface defines the following methods:  

void addFirst(E obj): Adds an element to the front of the queue.  
void addLast(E obj): Adds the element obj to the end of the queue.  
E getFirst(): Returns the element at the front of the queue without removing it. If the queue is empty, 
it throws a NoSuchElementException.  
E getLast(): Returns the last element of the queue without removing it. 
If the queue is empty, it throws a NoSuchElementException.  
boolean offerFirst(E obj): Adds the element obj to the front of the queue. 
Returns true if the element is successfully added; otherwise, it returns false.  
boolean offerLast(E obj): Adds the element obj to the end of the queue. 
Returns true if the element is successfully added; otherwise, it returns false.  
E peekFirst(): Returns the element at the front of the queue without removing it. 
If the queue is empty, it returns null.  
E peekLast(): Returns the last element of the queue without removing it. 
If the queue is empty, it returns null.  
E pollFirst(): Returns and removes the element at the front of the queue. 
If the queue is empty, it returns null.  
E pollLast(): Returns and removes the last element of the queue. 
If the queue is empty, it returns null.  
E pop(): Returns and removes the element at the front of the queue, following the LIFO principle.   
If the queue is empty, it throws a NoSuchElementException.  
void push(E element): Adds an element to the front of the queue, following the LIFO principle.  
E removeFirst(): Returns and removes the element at the front of the queue. 
If the queue is empty, it throws a NoSuchElementException.  
E removeLast(): Returns and removes the last element of the queue. 
If the queue is empty, it throws a NoSuchElementException.    
boolean removeFirstOccurrence(Object obj): Removes the first occurrence of the specified element obj from the queue.
Returns true if the removal occurs; otherwise, it returns false.  
boolean removeLastOccurrence(Object obj): Removes the last occurrence of the specified element obj from the queue.
Returns true if the removal occurs; otherwise, it returns false.  
As a result, the presence of the pop and push methods allows classes implementing this interface to act as a stack.
At the same time, the existing functionality also enables the creation of two-way queues, making classes that apply
this interface quite flexible.  

***The ArrayDeque Class***
In Java, queues are represented by a range of classes, including the ArrayDeque<E> class. 
This class represents a generic two-way queue, inheriting functionality from the 
AbstractCollection class and implementing the Deque interface.  

The ArrayDeque class defines the following constructors:  

ArrayDeque(): Creates an empty queue.  
ArrayDeque(Collection<? extends E> col): Creates a queue filled with elements from the collection col.  
ArrayDeque(int capacity): Creates a queue with an initial capacity of capacity. 
If we do not explicitly specify the initial capacity, the default capacity will be 16.    








***Очереди и класс ArrayDeque***  

Очереди представляют структуру данных, работающую по принципу FIFO (first in - first out). То есть чем раньше был добавлен элемент в коллекцию, тем раньше он из нее удаляется. Это стандартная модель однонаправленной очереди. Однако бывают и двунаправленные - то есть такие, в которых мы можем добавить элемент не только в начала, но и в конец. И соответственно удалить элемент не только из конца, но и из начала.

Особенностью классов очередей является то, что они реализуют специальные интерфейсы Queue или Deque.

**Интерфейс Queue**  
Обобщенный интерфейс Queue<E> расширяет базовый интерфейс Collection и определяет поведение класса в качестве однонаправленной очереди. Свою функциональность он раскрывает через следующие методы:

E element(): возвращает, но не удаляет, элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException

boolean offer(E obj): добавляет элемент obj в конец очереди. Если элемент удачно добавлен, возвращает true, иначе - false

E peek(): возвращает без удаления элемент из начала очереди. Если очередь пуста, возвращает значение null

E poll(): возвращает с удалением элемент из начала очереди. Если очередь пуста, возвращает значение null

E remove(): возвращает с удалением элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException

Таким образом, у всех классов, которые реализуют данный интерфейс, будет метод offer для добавления в очередь, метод poll для извлечения элемента из головы очереди, и методы peek и element, позволяющие просто получить элемент из головы очереди.

**Интерфейс Deque**  
Интерфейс Deque расширяет вышеописанный интерфейс Queue и определяет поведение двунаправленной очереди, которая работает как обычная однонаправленная очередь, либо как стек, действующий по принципу LIFO (последний вошел - первый вышел).

Интерфейс Deque определяет следующие методы:  

void addFirst(E obj): добавляет элемент в начало очереди

void addLast(E obj): добавляет элемент obj в конец очереди

E getFirst(): возвращает без удаления элемент из головы очереди. Если очередь пуста, генерирует исключение NoSuchElementException

E getLast(): возвращает без удаления последний элемент очереди. Если очередь пуста, генерирует исключение NoSuchElementException

boolean offerFirst(E obj): добавляет элемент obj в самое начало очереди. Если элемент удачно добавлен, возвращает true, иначе - false

boolean offerLast(E obj): добавляет элемент obj в конец очереди. Если элемент удачно добавлен, возвращает true, иначе - false

E peekFirst(): возвращает без удаления элемент из начала очереди. Если очередь пуста, возвращает значение null

E peekLast(): возвращает без удаления последний элемент очереди. Если очередь пуста, возвращает значение null

E pollFirst(): возвращает с удалением элемент из начала очереди. Если очередь пуста, возвращает значение null

E pollLast(): возвращает с удалением последний элемент очереди. Если очередь пуста, возвращает значение null

E pop(): возвращает с удалением элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException

void push(E element): добавляет элемент в самое начало очереди

E removeFirst(): возвращает с удалением элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException

E removeLast(): возвращает с удалением элемент из конца очереди. Если очередь пуста, генерирует исключение NoSuchElementException

boolean removeFirstOccurrence(Object obj): удаляет первый встреченный элемент obj из очереди. Если удаление произшло, то возвращает true, иначе возвращает false.

boolean removeLastOccurrence(Object obj): удаляет последний встреченный элемент obj из очереди. Если удаление произшло, то возвращает true, иначе возвращает false.

Таким образом, наличие методов pop и push позволяет классам, реализующим этот элемент, действовать в качестве стека. В тоже время имеющийся функционал также позволяет создавать двунаправленные очереди, что делает классы, применяющие данный интерфейс, довольно гибкими.

**Класс ArrayDeque**  
В Java очереди представлены рядом классов. Одни из низ - класс ArrayDeque<E>. Этот класс представляют обобщенную двунаправленную очередь, наследуя функционал от класса AbstractCollection и применяя интерфейс Deque.

В классе ArrayDeque определены следующие конструкторы:  

ArrayDeque(): создает пустую очередь

ArrayDeque(Collection<? extends E> col): создает очередь, наполненную элементами из коллекции col

ArrayDeque(int capacity): создает очередь с начальной емкостью capacity. Если мы явно не указываем начальную емкость, то емкость по умолчанию будет равна 16