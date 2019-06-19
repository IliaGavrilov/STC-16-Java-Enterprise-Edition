public class Person{

    /* Поля класса Person */
    String ownerName;
    int age;
    String sex;

    /* Конструктор класса Person */
    public Person(String givenOwnerName, int givenOwnerAge, String givenSex){
        this.ownerName = givenOwnerName;
        this.age = givenOwnerAge;
        this.sex = givenSex;
    }

    /* Геттеры класса Person */
    public String getOwnerName() {
        return ownerName;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    /* Переназначение метода toString() класса Person */
    @Override
    public String toString() {
        return "Person{" +
                "ownerName='" + ownerName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
