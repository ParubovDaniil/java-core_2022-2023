package lr9.Task1;

public class Example1 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
            // исключение перехвачено
        } catch (RuntimeException e) {
            // исключение обработано
            System.out.println("1 " + e);
        }
        System.out.println("2");
    }
}