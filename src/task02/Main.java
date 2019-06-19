package task02;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /* Инстанцирование класса, реализующего методы сериализации и десериализации */
        SerialisationClass serialisation = new SerialisationClass();

        /* Инстанцирование объекта класса User для последующей сериализации и десериализации */
        List<User> friends = new ArrayList<>();
        User userInitialFriendFirst = new User("Гарик", 33, null);
        User userInitialFriendSecond = new User("демис", 32, null);
        friends.add(userInitialFriendFirst);
        friends.add(userInitialFriendSecond);

        User userInitial = new User("Тимур", 31, friends);

        /* Вызов методов сериализации и десериализации */
        serialisation.serialize(userInitial, "fileObjectFriends");
        Object deSerializedObject = serialisation.deSerialize("fileObjectFriends");
        System.out.println("Десериализованный юзер из метода: " + deSerializedObject);
    }

    /* Класс, реализующий методы сериализации и десериализации */
    static class SerialisationClass {

        /* Сериализация объекта */
        public void serialize(Object object, String file) {
            try (ObjectOutputStream objOStrm = new ObjectOutputStream(new FileOutputStream(file))) {
                System.out.println("Созданный юзер для сериализации: " + object);
                objOStrm.writeObject(object);
            } catch (IOException e) {
                System.out.println("Исключение при сериализации: " + e);
            }
        }

        /* Десериализация объекта */
        public Object deSerialize(String file) {
            try (ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream(file))) {
                User userInitialRead = (User)objIStrm.readObject();
                System.out.println("Десериализованный юзер: " + userInitialRead);
                return userInitialRead;
            } catch (Exception e) {
                System.out.println("Исключение при десериализации: " + e);
                System.exit(0);
            }
            return null;
        }
    }
}