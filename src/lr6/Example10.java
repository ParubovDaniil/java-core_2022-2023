package lr6;
import java.util.Arrays;
import java.util.Random;
public class Example10 {
    public static void main(String[] args) {
        int[] a = new int[100];
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {

            a[i] = rand.nextInt((1000 - 1) + 1) +1;
        }
        Method1(a);
    }
    static public void Method1( int ... num)
    {
        int arr[] = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num[i];
        }
        Arrays.sort(arr);
        int maxNum = arr[arr.length - 1];
        int minNum = arr[0];
        System.out.println("Maximum number = " + maxNum);
        System.out.println("Minimum number = " + minNum);

    }
}
//        Напишите программу со статическим методом, аргументом которому передается
//        произвольное количество целочисленных аргументов. Результатом метод возвращает
//        массив из двух элементов: это значения наибольшего и наименьшего значений среди
//        аргументов, переданных методу.
