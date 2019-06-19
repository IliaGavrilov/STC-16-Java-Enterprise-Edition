package part01.lesson04.task03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObjectBox {
    List<Object> objectsContainer = new ArrayList<Object>();

    /* Метод addObject, добавляющий объект в коллекцию */
    public void addObject(Object temp){objectsContainer.add(temp);}

    /* Метод deleteObject, проверяющий наличие объекта в коллекции и при наличии удаляющий его */
    public void deleteObject(Object temp){
        Iterator itr = objectsContainer.iterator();
        while (itr.hasNext()) {
            Object x = itr.next();
            if (x.equals(temp)){
                itr.remove();
            }
        }
    }

    /* Метод dump, выводящий содержимое коллекции в строку */
    public String dump() {
        return "ObjectBox{" +
                "objectsContainer=" + objectsContainer +
                '}';
    }
}
