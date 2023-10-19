<ul>
<li>Sometimes, when threads interact, there arises a question of notifying one thread about the actions of another. For example, the actions of one thread depend on the outcome of another thread's actions, and you need to somehow inform one thread that the second thread has performed a certain task. For such situations, the Object class defines a set of methods:

- wait(): Releases the monitor and puts the calling thread in a waiting state until another thread calls the notify() method.
- notify(): Resumes the work of the thread on which the wait() method was previously called.
- notifyAll(): Resumes the work of all threads on which the wait() method was previously called.
</li>
<li>Deadlock is a problem caused by a synchronization design error in multi-threaded applications. The essence of the problem is when one of the competing threads has acquired a monitor, and to release it, it must enter a synchronized block whose monitor is held by another thread. At the same time, the second thread cannot release the monitor because it needs to enter a synchronized block whose monitor is held by the first thread.
</li>
<li>Daemon threads usually represent background tasks that run throughout the entire lifecycle of an application. They automatically terminate their work when the last non-daemon thread finishes. You can create a daemon thread as follows: thread.setDaemon(true). This must be done before starting the thread.
</li>
</ul>



<ul>
<li>Иногда при взаимодействии потоков встает вопрос о извещении одних потоков о действиях других. Например, действия одного потока зависят от результата действий другого потока, и надо как-то известить один поток, что второй поток произвел некую работу. И для подобных ситуаций у класса Object определено ряд методов:

wait(): освобождает монитор и переводит вызывающий поток в состояние ожидания до тех пор, пока другой поток не вызовет метод notify()

notify(): продолжает работу потока, у которого ранее был вызван метод wait()

notifyAll(): возобновляет работу всех потоков, у которых ранее был вызван метод wait()
</li>
<li> Deadlock (взаимная блокировка), это проблема вызванная ошибкой в проектировании синхронизации многопоточных аппликаций. Суть проблемы, когда один из конкурирующий потоков захватил монитор, и чтобы его освободить, он должен пройти в synchronized блок, монитор которого захвачен вторым потоком. При этом второй поток, не может освободить монитор, т. к. для этого ему надо пройти в synchronized блок, монитор которого захвачен первым потоком.
</li>
<li> Демон треды, обычно представляют из себя задачи работающие в фоновом режиме на протяжении всего жизненного цикла аппликации. Они автоматически завершают свою работу, вместе с завершением работы последнего не демон треда. Создать демон тред можно следующим образом: thread.setDeamon(true). Сделать это необходимо до старта треда.
</li>
</ul>