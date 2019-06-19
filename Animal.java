public class Animal{

    /* Поля класса Animal */
    public int id;
    public String animalName;
    public Person owner;
    public double weight;

    /* Конструктор класса Animal */
    public Animal(int givenId, String givenName, Person givenOwner, double givenWeight){
        this.id = givenId;
        this.animalName = givenName;
        this.owner = givenOwner;
        this.weight = givenWeight;
    }

    /* Геттеры класса Animal */
    public String getAnimalName() {
        return animalName;
    }

    public int getId() {
        return id;
    }

    public Person getOwner() {
        return owner;
    }

    public double getWeight() {
        return weight;
    }

    /* Cеттеры класса Animal */
    public void setId(int id) {
        this.id = id;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /* Переназначение метода toString() класса Animal */
    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", animalName='" + animalName + '\'' +
                ", owner='" + owner.toString()  + '\'' +
                ", weight=" + weight +
                '}';
    }
}

