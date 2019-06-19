package part01.lesson02.task01;

public class Main {
    public static void main(String[] args) throws Exception {

        // Инстанцирование объекта e класса ExceptionCheck
        ExceptionCheck e = new ExceptionCheck();

        // Вызов метода foobar() класса ExceptionCheck, моделирующего ошибку «NullPointerException»
        e.foobar();

        // Вызов метода foobar() класса ExceptionCheck, моделирующего ошибку «ArrayIndexOutOfBoundsException»
        e.foobar(3);

        // Вызов перегруженного метода foobar() в условии логического оператора
        // Вызов ошибки класса Exception посредством оператора throw
        if (!e.foobar("xy")) {
            throw new Exception(); //
        }
    }
}