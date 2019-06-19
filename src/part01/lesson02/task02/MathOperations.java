package part01.lesson02.task02;

import java.util.ArrayList;
import java.util.Random;

public class MathOperations {
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    // Метод для генерации числа k
    public static int randomNum() {
        int max = 1000;
        int min = max-max*2;
        return new Random().nextInt(max-min)+min;
    }

    // Метод для формирования списочного массива из чисел k
    public ArrayList<Integer> numAray(int givenNum) {
        for (int i = 0; i < givenNum; i++) {
            numbers.add(randomNum());
            }
        return numbers;
    }

    // Метод проверки равенства целой части от квадратного корня самому случайному числу, а также проверки отрицательного числа
    public void numArrayCheck(int givenNum) {
        for (int i = 0; i < givenNum; i++) {
            if (numbers.get(i)==0||numbers.get(i)==1) { continue; }

            try {
                int x = numbers.get(i) / (int) (numbers.get(i) + Math.abs(numbers.get(i)));
            }
            catch (ArithmeticException e)
            {
                System.out.println("Генерируемое исключение: Число " + numbers.get(i)+ " отрицательное");
            }

            if ((int)Math.pow((int)Math.sqrt(numbers.get(i)), 2)==numbers.get(i)) {
                System.out.println("Целая часть от квадратного корня равна самому случайному числу у числа: "+numbers.get(i));
            }
        }
    }
}
