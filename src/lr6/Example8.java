package lr6;

import java.util.Arrays;
public class Example8 {
    public static void main(String[] args) {
        int[] A = { 1, 3, 5, 7, 9 };
        int[] B = { 1, 2, 4 };
        System.out.println("Одномерный массив А:");
        System.out.println(Arrays.toString(A));
        System.out.println("Его среднее арифметическое: "+ Program.avgMas(A));
        System.out.println("Одномерный массив В:");
        System.out.println(Arrays.toString(B));
        System.out.println("Его среднее арифметическое: "+ Program.avgMas(B));
    }
    class Program {
        static double avgMas(int[] nums) {
            int s = 0;
            for (int k = 0; k < nums.length; k++) {
                s += nums[k];
            }
            return (double) s / nums.length;
        }

        static void showArray(int[] nums) {
            for (int k = 0; k < nums.length; k++) {
                System.out.println("| "+ nums[k]);
            }
            System.out.println("|");
        }
    }
}
//        Напишите программу со статическим методом, аргументом которому передается
//        целочисленный массив, а результатом возвращается среднее значение для элементов
//        массива (сумма значений элементов, деленная на количество элементов в массиве).