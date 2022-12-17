package lr4;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
            Scanner id = new Scanner(System.in);
            System.out.print("введите высоту треугольника: ");
            int height = id.nextInt(); // число строк которое необходимо вывести
            int [][] massiv = new int [height][]; //создание элемента массива необходимого размера
            for (int i=0;i<massiv.length;i++){//резервирование памяти для второго измерения массива
                int j = i+1;
                massiv[i]=new int[j];
            }
            int z = 0; //переменная для вывода количества строк
            for (int i =0; i < height; i++){//заполнение массива
                for (int j = 0; j <i+1; j++){
                    massiv[i][j] = 2;
                }
            }
            for (int i =0; i < height; i++){//печать массива
                int count = i+1;//переменная для повышения номера индекса для вывода на консоль
                System.out.print("номер строки " + count + " : ");
                for (int j = 0; j < massiv[i].length; j++){
                    System.out.print(massiv[i][j]+" ");
                    z++;
                }
                System.out.println(" Количество символов в строке " + z);
                z = 0; //обнуление счетчика
            }
        }
}
//Напишите программу, в которой создается двумерный массив, который
//выводит прямоугольный треугольник;