package lr3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        //while - цикл, пока выполняется-то
        //for - цикл, пока выполняется-то
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое целое число");
        int one = in.nextInt();
        System.out.println("Введите второе целое число");
        int two = in.nextInt();

        while (one > two) {
            System.out.println("В порядке возрастания : " + one + " " + two);
            break;
        }
        while (one < two) {
            System.out.println("В порядке возрастания : " + two + " " + one);
            break;
        }
        for (int k = one; k > two; ) {
            System.out.println("В порядке возрастания : " + one + " " + two);
            break;
        }
        for (int j = two; j > one; ) {
            System.out.println("В порядке возрастания : " + two + " " + one);
            break;
        }
    }
}
//        Напишите программу, в которой пользователем вводится два
//        целых числа. Программа выводит все целые числа — начиная с наименьшего
//        (из двух введенных чисел) и заканчивая наибольшим (из двух введенных
//        чисел). Предложите разные версии программы (с использованием разных
//        операторов цикла).
