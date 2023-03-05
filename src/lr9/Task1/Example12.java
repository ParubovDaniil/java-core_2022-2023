package lr9.Task1;

public class Example12 {
    public static void m(String str, double cifra) {
        if (str == null) {
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if (cifra > 0.001) {
            throw new IllegalArgumentException("Неверное число");
        }
    }

    public static void main(String[] args) {
        m(null, 0.000001);
    }
}