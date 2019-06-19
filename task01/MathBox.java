package part01.lesson04.task01;

        import java.util.*;
        import java.lang.Double;
        import java.lang.Integer;

class MathBox<T> {

    public Set MySet;

    /* Параметризованный конструктор класса */
    public MathBox(T array[]) {
        this.MySet = convertArrayToSet(array);
    }

    /* Параметризованный метод для разложения массива в Set */
    public <T> Set<T> convertArrayToSet(T array[]) {
        Set<T> set = new HashSet<>(Arrays.asList(array));
        return set;
    }

    /* Метод summator, возвращающий сумму всех элементов коллекции */
    public Double summator(Double array[]){
        Double doubleSum = convertArrayToSet(array).stream().mapToDouble(Double::doubleValue).sum();
        return doubleSum;
    }

    /**
     * Метод splitter, выполняющий поочередное деление всех хранящихся в объекте элементов на делитель,
     * являющийся аргументом метода.
     * Хранящиеся в объекте данные полностью заменяются результатами деления
     * @param temp
     **/
    public void splitter(Double temp){
        Set NewSet = new HashSet<>();
        double holderVar = 0;
        Iterator iter = MySet.iterator();
        while (iter.hasNext()) {
            holderVar = (double)iter.next()/temp;
            NewSet.add(holderVar);
        }
        MySet = NewSet;
    }

    /* Метод, который получает на вход Integer и если такое значение есть в коллекции, удаляет его */
    public void searchAndDestroy(Integer temp) {
        Iterator<Double> iter = MySet.iterator();
        while (iter.hasNext()) {
            Double setElement = iter.next();
            double tempVar = setElement - temp;
            if (tempVar > 0 && tempVar < 1) {
                iter.remove();
            }
        }
    }

    /* Переопределение методов toString, hashCode, equals */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox<?> mathBox = (MathBox<?>) o;
        return MySet.equals(mathBox.MySet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MySet);
    }

    @Override
    public String toString() {
        return "MathBox{" +
                "MySet=" + MySet +
                '}';
    }
}
