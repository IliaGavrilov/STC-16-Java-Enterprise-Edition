package part01.lesson02.task03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Person {
    int age;
    String sex;
    String name;
    
    int z;
    ArrayList<String> manNames = new ArrayList<>(Arrays.asList("Михаил Голубцов", "Павел Бородин", "Илья Гаврилов",
            "Ринат Рябиков", "Александр Мамонов", "Георгий Шишкин", "Дмитрий Пономаренко", "Максим Милованов"));
    ArrayList<String> womanNames = new ArrayList<>(Arrays.asList("Айслу Самигуллина", "Елена Протасова", "Алина Мангутова",
            "Камила Исхакова", "Анна Шеронова", "Анна Шеронова", "Анастасия Ильюшенко", "Индира Токенова"));

    public Person() {
        this.age = setAge();
        this.sex = setSex();
        this.name = setName();
    }

    // Сеттер для поля возвраст на осномании рандомного значения
    public static int setAge() {
        return new Random().nextInt(100);
    }

    // Генерирование рандомного значения нормального распределения
    public static double arrayGaussianDistrib() {
        double x = new Random().nextGaussian();
        return x;
    }
    
    // Использование рандомного значения метода arrayGaussianDistrib() для использования в определении пола
    public static int getGaussianELem() {
        double y = arrayGaussianDistrib();
        if (y > 0) {
            return (int) y;
        }
        return 0;
    }

    // Генерирование пола посредством вызова метода getGaussianELem()
    public String setSex() {
        z = getGaussianELem();
        if (z == 0) {
            return "MAN";
        }
        z = 1;
        return "WOMAN";
    }
    
    // Вызов имени из массива по рандомному индексу в зависимости от пола 
    public String setName() {
        if (z == 0) {
            int w = new Random().nextInt(manNames.size());
            return manNames.get(w);
        }
        int w = new Random().nextInt(womanNames.size());
        return womanNames.get(w);
    }
}
