package lr9.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {
    static Scanner vision = new Scanner(System.in);
public static void main(String[] args) {
        int [] massive = setArray(5);
        averageVal(massive);
    }
    public static void averageVal(int [] array){
        if (array == null){
            return;
        }
        int summa = 0, i = 0;
        for (int j : array) {
            if (j > 0) {
                summa += j;
                i++;
            }
        }
        if (summa <= 0) {
            throw new NullPointerException("положительные элементы отсутствуют");
        } else System.out.println("Среднее значение элементов в массиве: " + summa / i);
    }
    public static int[] setArray(int chislo){

        int[] a = new int[chislo];
        System.out.println("Массив состоиз из " + chislo + " элемента(ов), далее заполните его:");
        int z = 0;
        while(true) {
            try {
                int i = z;
                for (; i < a.length; i++) {
                    z = i;
                    System.out.print("A[" + i + "] = ");
                    a[i] = vision.nextInt();

                }
                vision.close();
                return a;
            } catch (InputMismatchException e) {
                System.out.println("Сгенерировано исключение: " + e.toString());
                vision.next();
                a[z] = 0;
            }
        }

    }
}
