package lr9.Task2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Example2 {
    static Random random = new Random();
    static Scanner vision1 = new Scanner(System.in);
    static Scanner vision2 = new Scanner(System.in);
    static Scanner vision3 = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println(" Введите кол-во строк для матрицы: ");
            int z = vision1.nextInt();
            System.out.println(" Введите кол-во столбцов для матрицы: ");
            int b = vision2.nextInt();
            System.out.println("Текущий массив:");
            int newArray[][] = new int[z][b];
            int a;
            int c;
            for (a = 0; a < z; a++) {
                for (c = 0; c < b; c++) {
                    newArray[a][c] = random.nextInt(100);
                    System.out.print(newArray[a][c]+" ");
                }
                System.out.println();
            }
            System.out.print("Введите номер стобца для его вывода:");
            int p = vision3.nextInt();
            for (a = 0; a < z; a++) {
                System.out.println(newArray[a][p]);
            }
        } catch (InputMismatchException F) {
            System.out.println(" Error! Не подходит тип данных, которые введены");
        } catch (ArrayIndexOutOfBoundsException E) {
            System.out.println("Error! Нет такого столбца!");
        }
    }
}
