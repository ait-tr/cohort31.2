***TreeMap***  
The TreeMap class represents a map as a tree. It inherits from the AbstractMap class and implements the NavigableMap interface, and therefore also the SortedMap interface. Unlike the HashMap collection, in a TreeMap, all objects are automatically sorted in ascending order based on their keys.

The TreeMap class has the following constructors:

TreeMap(): Creates an empty tree map.

TreeMap(Map<? extends K, ? extends V> map): Creates a tree map and adds all elements from the map.

TreeMap(SortedMap<K, ? extends V> smap): Creates a tree map and adds all elements from the smap.

TreeMap(Comparator<? super K> comparator): Creates an empty tree where all subsequently added elements will be sorted using the provided comparator.









***TreeMap***  
Класс TreeMap<K, V> представляет отображение в виде дерева. Он наследуется от класса AbstractMap и реализует интерфейс NavigableMap, а следовательно, также и интерфейс SortedMap. Поэтому в отличие от коллекции HashMap в TreeMap все объекты автоматически сортируются по возрастанию их ключей.

Класс TreeMap имеет следующие конструкторы:

TreeMap(): создает пустое отображение в виде дерева

TreeMap(Map<? extends K,​? extends V> map): создает дерево, в которое добавляет все элементы из отображения map

TreeMap(SortedMap<K, ? extends V> smap): создает дерево, в которое добавляет все элементы из отображения smap

TreeMap(Comparator<? super K> comparator): создает пустое дерево, где все добавляемые элементы впоследствии будут отсортированы компаратором.  


