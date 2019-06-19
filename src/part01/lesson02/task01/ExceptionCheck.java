package part01.lesson02.task01;

public class ExceptionCheck {
    // Объявление полей класса
    String nullValue;
    String myStringArray[];

    // Конструкутор класса
    public ExceptionCheck() {
        this.myStringArray = new String[] {"ab", "cd", "ef"};
    }

    // Метод для моделирования ошибки «NullPointerException» и отлавливания ошибки
    public void foobar() {
        try {
            this.nullValue.charAt(1);
        } catch (NullPointerException npe) {
            System.out.println("NPE");
        }
    }

    // Перегрузка метода для моделирования ошибки «ArrayIndexOutOfBoundsException» и отлавливания ошибки
    public void foobar(int givenInt) {
        try {
            System.out.println(this.myStringArray[givenInt]);
        } catch (ArrayIndexOutOfBoundsException aio) {
            System.out.println("AIO");
        }
    }

    // Перегрузка метода для моделирования ошибки «ArrayIndexOutOfBoundsException» и возврата логического выражения
    public boolean foobar(String givenStr)  {
        if (givenStr.equals(myStringArray[0])) {
            return true;
        }
        return false;
    }
}