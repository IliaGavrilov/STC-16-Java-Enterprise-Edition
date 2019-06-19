package part01.lesson04.task01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        /* Инициализация массива */
        Double array[] = {8.0, 7.3, 6.7, 5.2, 4.1, 3.6, 2.1, 1.9};
        System.out.println("Массив: " + Arrays.toString(array));

        /* Инстанцирование объекта m */
        MathBox m = new MathBox(array);
        System.out.println("Set: "+ m.MySet);

        /* Инстанцирование объекта n для проверки метода equals() */
        MathBox n = new MathBox(array);
        System.out.println("Метод equals(): "+m.equals(n));

        /* Вызов метода summator() для сложения элементов */
        System.out.println("Сумма элементов: "+m.summator(array));

        /* Вызов метода splitter() для деления элементов на делитель */
        m.splitter(2.3);
        System.out.println("Элементы после деления: "+m.MySet);

        /* Вызов метода searchAndDestroy() для поиска и удаления элементов */
        m.searchAndDestroy(3);
        System.out.println("Set после удаления элементов: "+m.MySet);

        /* Вывод hashCode объекта m*/
        int x = m.hashCode();
        System.out.println("hashCode: "+x);

        /* Проверка метода equals() */
        System.out.println("Метод equals(): "+m.equals(n));
        //System.out.println(m.hashCode() == n.hashCode());
    }
}
