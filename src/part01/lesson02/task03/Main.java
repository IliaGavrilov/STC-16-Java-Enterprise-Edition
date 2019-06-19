package part01.lesson02.task03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int arrayNum = 100;

        // Генерация исходного массива объектов класса Person для пузырьковой сортировки
        ArrayList<Person> personList = new ArrayList<Person>();
        for (int i = 0; i < arrayNum; ++i) {
            personList.add(new Person());
        }

        System.out.println("До пузырьковой сортировки");
        for (Person person : personList) {
            System.out.println(person.age + " " + person.sex + " " + person.name);
        }

        // Вызов методов пузырьковой сортировки
        final long startTime = System.nanoTime();
        BubbleSort.bubbleSortName(personList);
        BubbleSort.bubbleSortAge(personList);
        BubbleSort.bubbleSortSex(personList);
        final long duration = System.nanoTime() - startTime;

        System.out.println("");
        System.out.println("После пузырьковой сортировки");

        for (int i = 0; i < arrayNum; ++i) {
            System.out.println(personList.get(i).age + " " + personList.get(i).sex + " " + personList.get(i).name);
            if (i == 0) {continue;}
            if (personList.get(i).name.equals(personList.get(i-1).name)) {
                try {
                    int x = personList.get(i).age / (personList.get(i).age - personList.get(i-1).age);
                } catch (ArithmeticException e) {
                    System.out.println("Пользовательское исключение: имена людей и возраст совпадают");
                }
            }
        }
        System.out.println("Время работы алгоритма пузырьковой сортировки: " + duration/1000000000 + " секунд");

        // Генерация исходного массива объектов класса Person для сортировки вставкой
        ArrayList<Person> personListNext = new ArrayList<Person>();
        for (int i = 0; i < arrayNum; ++i) {
            personListNext.add(new Person());
        }

        System.out.println("");
        System.out.println("До сортировки вставкой");
        for (Person person : personListNext) {
            System.out.println(person.age + " " + person.sex + " " + person.name);
        }

        // Вызов методов сортировки вставкой
        final long startTimeNext = System.nanoTime();
        InsertionSort.insertionSortName(personListNext);
        InsertionSort.insertionSortAge(personListNext);
        InsertionSort.insertionSortSex(personListNext);
        final long durationNext = System.nanoTime() - startTime;

        System.out.println("");
        System.out.println("После сортировки вставкой");

        for (int i = 0; i < arrayNum; ++i) {
            System.out.println(personListNext.get(i).age + " " + personListNext.get(i).sex + " " + personListNext.get(i).name);
            if (i == 0) {continue;}
            if (personList.get(i).name.equals(personList.get(i-1).name)) {
                try {
                    int x = personList.get(i).age / (personList.get(i).age - personList.get(i-1).age);
                } catch (ArithmeticException e) {
                    System.out.println("Пользовательское исключение: имена людей и возраст совпадают");
                }
            }
        }
        System.out.println("Время работы алгоритма сортировки вставкой: " + durationNext/1000000000 + " секунд");
    }
}