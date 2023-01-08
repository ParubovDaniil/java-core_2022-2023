package lr6;

public class Example2 {
    public static void main(String[] args) {
        StaticMethod.numberIncriment();
    }
    class StaticMethod
    {
        private static int number =1;

        public static int numberIncriment()
        {
            System.out.println(++number);
            return 0;
        }
    }
}
//        Напишите программу с классом, в котором есть закрытое статическое
//        целочисленное ноле с начальным нулевым значением. В классе должен быть описан
//        статический метод, при вызове которого отображается текущее значение статического
//        поля, после чего значение поля увеличивается на единицу.
