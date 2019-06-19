import java.util.*;

public class AnimalCollection {
    public HashSet<Animal> animalCollection = new HashSet<>();

    /* Метод добавления животного в общий список */
    public void addAnimal(Animal givenAnimal){
        if (equals(givenAnimal)){
            System.out.println("Объект: " + givenAnimal.toString() + " уже в списке!");
        }
        animalCollection.add(givenAnimal);
    }

    /* Поиск животного по его кличке */
    public Animal animalSearch(String nameToSearch){
        Iterator itr = animalCollection.iterator();
        while (itr.hasNext()) {
            Animal x = (Animal)itr.next();
            if (x.getAnimalName() == nameToSearch) {
                System.out.println("Животное найдено: " + x.toString());
                return x;
            }
            x = null;
        }
        return null;
    }

    /* Поиск животного по его id для изменения данных животного */
    public Animal animalSearch(int tempIdToSearch){
        Iterator itr = animalCollection.iterator();
        while (itr.hasNext()) {
            Animal x = (Animal)itr.next();
            if (x.getId() == tempIdToSearch) {
                System.out.println("Животное найдено: " + x.toString());
                return x;
            }
            x = null;
        }
        System.out.println("Животное c id: "+ tempIdToSearch + " не найдено ");
        return null;
    }

    /* Метод для изменения данных животного по его идентификатору */
    public void changeAnimalRecord(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите Id животного: ");
        int givenId = Integer.parseInt(reader.nextLine());
        Animal x = animalSearch(givenId);
        System.out.print("Введите новое имя: ");
        String givenName = reader.nextLine();
        System.out.print("Введите новый вес: ");
        Double givenWeight = Double.parseDouble(reader.nextLine());

        System.out.print("Укажите имя нового хозяина: ");
        String givenOwnerName = reader.nextLine();
        System.out.print("Укажите возвраст нового хозяина: ");
        int givenAge = Integer.parseInt(reader.nextLine());
        System.out.print("Укажите пол нового хозяина: ");
        String givenOwnerSex = reader.nextLine();

        Person tempOwner = new Person(givenOwnerName, givenAge, givenOwnerSex);
        Animal newAnimal = new Animal(givenId, givenName, tempOwner, givenWeight);

        animalCollection.remove(x);
        animalCollection.add(newAnimal);
    }

    public List<Animal> sortingCollection(){
        List<Animal> newAnimalCollection = new ArrayList<Animal>(animalCollection);
        return newAnimalCollection;
    }

    /* Метод пузырьковой сортировки по трем полям объектов в массиве */
    public void bubbleSortAnimals(List<Animal> newAnimalCollection) {
        for (int i = 0; i < newAnimalCollection.size(); i++) {
            for (int j = 1; j < newAnimalCollection.size() - i; j++) {
                char x = getOwnerName(newAnimalCollection.get(j-1).getOwner()).charAt(0);
                char y = getOwnerName(newAnimalCollection.get(j).getOwner()).charAt(0);
                if (x > y) {
                    Animal temp = newAnimalCollection.get(j-1);
                    newAnimalCollection.set(j-1, newAnimalCollection.get(j));
                    newAnimalCollection.set(j, temp);
                }
                x = getOwnerName(newAnimalCollection.get(j-1).getOwner()).charAt(0);
                y = getOwnerName(newAnimalCollection.get(j).getOwner()).charAt(0);
                if (x == y && newAnimalCollection.get(j-1).getAnimalName().charAt(0) > newAnimalCollection.get(j).getAnimalName().charAt(0)) {
                    Animal temp = newAnimalCollection.get(j-1);
                    newAnimalCollection.set(j-1, newAnimalCollection.get(j));
                    newAnimalCollection.set(j, temp);
                }
                x = getOwnerName(newAnimalCollection.get(j-1).getOwner()).charAt(0);
                y = getOwnerName(newAnimalCollection.get(j).getOwner()).charAt(0);
                if (x == y && newAnimalCollection.get(j-1).getAnimalName().charAt(0) == newAnimalCollection.get(j).getAnimalName().charAt(0)
                && newAnimalCollection.get(j-1).getWeight() > newAnimalCollection.get(j).getWeight()) {
                    Animal temp = newAnimalCollection.get(j-1);
                    newAnimalCollection.set(j-1, newAnimalCollection.get(j));
                    newAnimalCollection.set(j, temp);
                }
            }
        }
    }

    /* Метод-помощник для возврата имени объекта Хозяин для метода сортировки bubbleSortAnimals()*/
    public String getOwnerName(Person givenPerson) {
        return givenPerson.getOwnerName();
    }

    /* Переписанный метод equals() для выявления добавляемых дубликатов
     * для генерирования исключительной ситуации */
    @Override
    public boolean equals(Object o) {
        Iterator itr = animalCollection.iterator();
        while (itr.hasNext()) {
            Object x = itr.next();
            if (x.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalCollection);
    }

    /* Метод toString() для вывода на экран списка животных */
    @Override
    public String toString() {
        return "AnimalCollection{" +
                "animalCollection=" + animalCollection +
                '}';
    }
}