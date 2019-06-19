package part01.lesson02.task03;

import java.util.ArrayList;

public class InsertionSort {

    // Метод сортировки вставкой по возврасту
    public static void insertionSortAge(ArrayList<Person> personListNext) {
        for (int i = 1; i < personListNext.size(); i++) {
            Person key = personListNext.get(i);
            int j = i-1;
            while (j >= 0 && key.age > personListNext.get(j).age) {
                personListNext.set(j+1, personListNext.get(j));
                j--;
            }
            personListNext.set(j+1, key);
        }
    }

    // Метод сортировки вставкой по полу
    public static void insertionSortSex(ArrayList<Person> personListNext) {
        for (int i = 1; i < personListNext.size(); i++) {
            Person key = personListNext.get(i);
            int j = i-1;
            while (j >= 0 && key.z < personListNext.get(j).z) {
                personListNext.set(j+1, personListNext.get(j));
                j--;
            }
            personListNext.set(j+1, key);
        }
    }

    // Метод сортировки вставкой по имени
    public static void insertionSortName(ArrayList<Person> personListNext) {
        for (int i = 1; i < personListNext.size(); i++) {
            Person key = personListNext.get(i);
            int j = i-1;
            while (j >= 0 && key.name.charAt(0) < personListNext.get(j).name.charAt(0)) {
                personListNext.set(j+1, personListNext.get(j));
                j--;
            }
            personListNext.set(j+1, key);
        }
    }
}
