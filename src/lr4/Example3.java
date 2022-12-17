package lr4;
import java.util.Scanner;
public class Example3{
    public static void main(String[] args) {
    Scanner id = new Scanner(System.in);
    System.out.print("введите ширину прямоугольника: ");
    int width = id.nextInt(); // число строк которое необходимо вывести
    System.out.print("введите высоту прямоугольника: ");
    int height = id.nextInt(); // число строк которое необходимо вывести
    int [][] massiv = new int [height][width]; //создание элемента массива необходимого размера
    int z = 0; //переменная для вывода количества строк
    for (int i =0; i < height; i++){//заполнение массива
    for (int j = 0; j <width; j++){
    massiv[i][j] = 2;
                    }
                }
                for (int i =0; i < height; i++){//печать массива
                    int plus = i+1;//переменная для повышения номера индекса для вывода на консоль
                    System.out.print("номер строки " + plus + " : ");
                    for (int j = 0; j <width; j++){
                        System.out.print(massiv[i][j]+" ");
                        z++;
                    }
                    System.out.println(" Количество символов в строке " + z);
                    z = 0; //обнуление счетчика
                }
            }
}


//    Напишите программу, в которой создается двумерный массив, который
//    выводи прямоугольник из цифр 2;