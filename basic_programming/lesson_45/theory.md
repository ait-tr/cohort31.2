***merge() method***    

public V merge(K key, V value, BiFunction remappingFunction)  

The merge() method can be explained as follows: it either places a new value under the given key (if it is absent) or updates an existing key with the specified value (UPSERT).

merge() works in two scenarios. If the key is absent, it simply becomes put(key, value). However, if the specified key already has some value, our remappingFunction can combine the old and new values. This function can help in the following ways:
  
Overwrite the old value by simply returning the new value: (old, new) -> new  
Preserve the old value by simply returning the old value: (old, new) -> old  
Combine the two values, for example: (old, new) -> old + new  
Remove the old value: (old, new) -> null    

***метод merge()***     
public V merge(K key, V value, BiFunction remappingFunction)  
Метод merge() может быть объяснен следующим образом: он либо помещает новое значение под заданным ключом (если отсутствует), либо обновляет существующий ключ с заданным значением (UPSERT).  
merge()работает в двух сценариях. Если данного ключа нет, он просто становится put(key, value). Однако, если указанный ключ уже имеет какое-то значение, наш remappingFunction может объединить старый и новый. Эта функция поможет:

перезаписать старое значение, просто вернув новое: (old, new) -> new  
сохранить старое значение, просто возвращая старое: (old, new) -> old  
объединить два, например: (old, new) -> old + new  
удалить старое значение: (old, new) -> null  





