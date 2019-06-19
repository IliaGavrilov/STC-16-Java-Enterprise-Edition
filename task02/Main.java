package part01.lesson04.task02;

public class Main {
    public static void main(String[] args){
        /* Инстранцирование объектов класса Dummy, который необходим для тестовых целей задания */
        Dummy q = new Dummy("q", 1);
        Dummy w = new Dummy("w", 2);
        Dummy e = new Dummy("e",2);

        /* Инстанцирование класса ObjectBox*/
        ObjectBox x = new ObjectBox();

        /* Добавление в класс ObjectBox объектов класса Dummy */
        x.addObject(q);
        x.addObject(w);
        x.addObject(e);

        /* Демонстрация наличия объектов в коллекции объекта x класса ObjectBox */
        System.out.println("Объекты в коллекции: ");
        for (int i = 0; i < x.objectsContainer.size(); i++) {
            System.out.println(x.objectsContainer.get(i).toString());
        }

        /* Вызов метода deleteObject() */
        x.deleteObject(e);

        /* Демонстрация наличия объектов в коллекции объекта x класса ObjectBox */
        System.out.println("Объекты в коллекции после вызова метода deleteObject(): ");
        for (int i = 0; i < x.objectsContainer.size(); i++) {
            System.out.println(x.objectsContainer.get(i).toString());
        }

        /* Вызов метода dump() */
        System.out.println("Вызов метода dump(): "+ x.dump());
    }

    /* Конструктор класса Dummy для тестовых целей задания */
    public static class Dummy{
        String name;
        int tempVar;

        Dummy(String name, int tempVar){
            this.name = name;
            this.tempVar = tempVar;}

        @Override
        public String toString() {
            return "Dummy{" +
                    "name='" + name + '\'' +
                    ", tempVar=" + tempVar +
                    '}';
        }
    }
}
