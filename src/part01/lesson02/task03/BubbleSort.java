package part01.lesson02.task03;

import java.util.ArrayList;

public class BubbleSort {

    // Метод пузырьковой сортировки по возврасту
    public static void bubbleSortAge(ArrayList<Person> personList) {
        for (int i = 0; i < personList.size(); i++) {
            for (int j = 1; j < personList.size() - i; j++) {

                if (personList.get(j-1).age < personList.get(j).age) {
                    Person temp = personList.get(j-1);//.age;
                    personList.set(j-1, personList.get(j));
                    personList.set(j, temp);
                }
            }
        }
    }

    // Метод пузырьковой сортировки по полу
    public static void bubbleSortSex(ArrayList<Person> personList) {
        for (int i = 0; i < personList.size(); i++) {
            for (int j = 1; j < personList.size() - i; j++) {

                if (personList.get(j-1).z > personList.get(j).z) {
                    Person temp = personList.get(j-1);
                    personList.set(j-1, personList.get(j));
                    personList.set(j, temp);
                }
            }
        }
    }

    // Метод пузырьковой сортировки по имени
    public static void bubbleSortName(ArrayList<Person> personList) {
        for (int i = 0; i < personList.size(); i++) {
            for (int j = 1; j < personList.size() - i; j++) {

                if (personList.get(j-1).name.charAt(0) > personList.get(j).name.charAt(0)) {
                    Person temp = personList.get(j-1);
                    personList.set(j-1, personList.get(j));
                    personList.set(j, temp);
                }
            }
        }
    }
}
