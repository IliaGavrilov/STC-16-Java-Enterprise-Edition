package task02;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    /* Поля объекта - String и примитив */
    String name;
    int age;
    List friends;
    //User friend;

    public User(String name, int age, List friends){
        this.name = name;
        this.age = age;
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public List getFriend() {
        return friends;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFriend(List friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friends=" + friends +
                '}';
    }
}