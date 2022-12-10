package lr3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в последовательности ");
        int f4 = in.nextInt();
        if (f4 == 1) {
            System.out.println("1");
        } else {
            int f1 = 1;
            int f2 = 1;
            int f3;
            System.out.print(f1 + " " + f2 + " ");
            for (int a = 3; a <= f4; a++) {
                f3 = f1 + f2;
                System.out.print(f3 + " ");
                f1 = f2;
                f2 = f3;
            }

        }
    }
}
//        Напишите программу, которая выводит последовательность чисел
//        Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
//        следующее число равно сумме двух предыдущих (получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее).
//        Количество чисел в последовательности вводится пользователем. Предложите версии
//        программы, использующие разные операторы цикла.