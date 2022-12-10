package lr3;
import java.util.Scanner;
import java.util.Random;
public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ввведите количество чисел");
        int x = in.nextInt();
        int sum = 0;
        Random random = new Random();
        int x1 = x;
        while (x1 > 0) {
            int nums = random.nextInt(1000);
            if (nums % 5 == 2 & nums % 3 == 1) {
                System.out.print("Сгенерированное число "+nums + " ");
                sum = sum + nums;
                x1--;
            }
        }
        System.out.print("Сумма чисел : " + sum);
    }
}
//        Напишите программу, в которой вычисляется сумма чисел,
//        удовлетворяющих таким критериям: при делении числа на 5 в остатке получается 2, или при делении на 3 в остатке получается 1.
//        Количество чисел в сумме вводится пользователем. Программа отображает числа, которые
//        суммируются, и значение суммы. Предложите версии программы,
//        использующие разные операторы цикла.