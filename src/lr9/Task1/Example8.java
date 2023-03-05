package lr9.Task1;

public class Example8 {
    //Пример 8. Генерация исключения в методе.
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1");
        }
    }
    public static void main(String[] args) {
        System.out.println(m());
    }
}


