package lr4;

import java.util.Random;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Random random = new Random(200);                                       // Создание объекта класса Random
        Scanner id = new Scanner(System.in);                                        // Создание объекта класса Scanner
        System.out.print("введите количество строк массива: ");
        int a = id.nextInt();
        System.out.print("введите количество столбцов массива: ");
        int b = id.nextInt();
        int firstArray[][] = new int[a][b];                                         // создание первого массива
        for (int i = 0 ; i <a; i++) {
            for (int j = 0 ; j <b; j++) {
                firstArray[i][j] = random.nextInt(200);
                System.out.println("i = "+i+";j= "+j+";value= "+firstArray[i][j]);//печать
            }
        }
        System.out.println("===================================");

        int deleteS = random.nextInt(a-1);                                  //генерация № строки для удаления
        int deleteK = random.nextInt(b-1);                                  //генерация № столбца для удаления

        System.out.println("deleteS = "+(deleteS)+";deleteK= "+(deleteK));
        System.out.println("===================================");

        int secondArray[][] = new int[a-1][b-1]; // создание массива в котором удалена 1 строка и 1 столбец
        for (int i=0, s = 0; i<a-1; s++) {
            if (s!=deleteS){
                for (int j =0, k = 0 ; j <b-1; k++) {
                    if (k != deleteK) {
                        secondArray[i][j] = firstArray[s][k];
                        System.out.println("i = " + i + ";j= " + j + ";value= " + secondArray[i][j]);
                        j++;
                    }
                }
                i++;
            }
        }
    }
}
//Напишите программу, в которой создается и инициализируется
//двумерный числовой массив. Затем из этого массива удаляется строка и
//столбец (создается новый массив, в котором по сравнению с исходным
//удалена одна строка и один столбец). Индекс удаляемой строки и индекс
//удаляемого столбца определяется с помощью генератора случайных чисел.