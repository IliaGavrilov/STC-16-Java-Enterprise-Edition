package part01.lesson02.task02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        //Используем ввод пользователя для получения числа N
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите число"); //
        int givenNum = Integer.parseInt(reader.nextLine());

        MathOperations n = new MathOperations();

        System.out.println(n.numAray(givenNum));

        n.numArrayCheck(givenNum);
    }
}
