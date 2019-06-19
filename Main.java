import java.util.List;
//import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        /* Инстанцирование объектов класса Person */
        Person John = new Person("John", 39, "MAN");
        Person Ammy = new Person("Ammy", 45, "WOMAN");
        Person Bill = new Person("Bill", 31, "MAN");

        /* Инстанцирование объектов класса Animal */
        Animal Cat = new Animal(0, "Murzik", John, 4.1);
        Animal Dog = new Animal(1,"Rex", Ammy,5.2);
        Animal Turtle = new Animal(2,"Leo", Bill,1.2);

        /* Инстанцирование объекта класса Animal.
        8 Класс реализует методы:
         * - добавления животного в общий список;
         * - генерирование исключительной ситуации при добавлении дубликатов */
        AnimalCollection animals = new AnimalCollection();

        /* Добавление объектов класса Animal в HashSet класса AnimalCollection */
        animals.addAnimal(Cat);
        animals.addAnimal(Dog);
        animals.addAnimal(Turtle);
        System.out.println("Общий список животных: "+animals.toString());

        /* Добавление дубликатов для генерирования исключительной ситуации */
        animals.addAnimal(Cat);
        animals.addAnimal(Dog);
        animals.addAnimal(Turtle);

        /* Вызов метода поиска животного по его кличке */
        animals.animalSearch("Rex");

        /* Вызов метода по изменению данных животного по его идентификатору */
        animals.changeAnimalRecord();
        System.out.println("Общий список животных: "+animals.toString());

        /* Инстанцирование массива из HashSet для вывода на экран списка животных в отсортированном порядке */
        List<Animal> newAnimalCollection = animals.sortingCollection();

        /* Вызов метода пузырьковой сортировки для вывода на экран списка животных в отсортированном порядке */
        animals.bubbleSortAnimals(newAnimalCollection);
        System.out.println(newAnimalCollection);

        //if (Char "B" > "C") {System.out.println("Правда")};

    }
}